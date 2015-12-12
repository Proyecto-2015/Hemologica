package org.hemologica.salud.ejb.beans.impl;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hemologica.constants.Constants;
import org.hemologica.dao.model.Center;
import org.hemologica.dao.model.DonationFilterCode;
import org.hemologica.dao.model.Person;
import org.hemologica.dao.model.PersonsRecord;
import org.hemologica.dao.model.TransfusionFilterCode;
import org.hemologica.datatypes.DataDonationsStatistics;
import org.hemologica.datatypes.DataDonationsStatisticsResults;
import org.hemologica.datatypes.DataStatistic;
import org.hemologica.datatypes.DataTransfusionsStatistics;
import org.hemologica.datatypes.DataTransfusionsStatisticsResults;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.TransfusionFilterData;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.StatisticsBeanLocal;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.hemologica.xmldatabase.factories.XMLDataBaseFactory;

@Stateless
@LocalBean
public class StatisticsBean implements StatisticsBeanLocal {

	private Logger logger = Logger.getLogger(StatisticsBean.class.getName());
	
	@PersistenceContext(unitName = "Hemologica-Salud-PU")
	private EntityManager em;
	
    public StatisticsBean() {

    }

	@Override
	public DataDonationsStatisticsResults getDonationsStatistics(DataDonationsStatistics donationsStatisticsData) throws XMLDataBaseException {
		
		DataDonationsStatisticsResults dataDonationsStatistics = new DataDonationsStatisticsResults();
		
		List<String> andClausesNumerator = new ArrayList<>();
		List<String> andClausesDonaminator = new ArrayList<>();
		
		List<List<String>> orClausesList = new ArrayList<>();
		List<String> orClauses = new ArrayList<>();
		
		/**
		 * Bancos
		 */
		if(donationsStatisticsData.getBloodBank() == null && donationsStatisticsData.getInstitution() != null ){
			
			List<Center> banks = FactoryDAO.getCenterDAO(em).getBanksByInstitutionId(donationsStatisticsData.getInstitution().getCode());
			for(Center c : banks){
				
				String query = "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root='" + c.getCenterCode() +"'";
				orClauses.add(query);
			
			}
		}else if(donationsStatisticsData.getBloodBank() != null){
			
			String query = "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root='" + donationsStatisticsData.getBloodBank().getCode() +"'";
			andClausesNumerator.add(query);
			andClausesDonaminator.add(query);
			
		}
		
		orClausesList.add(orClauses);
		
		/**
		 * Fecha desde
		 */
		if(donationsStatisticsData.getFromDate()!= null && !donationsStatisticsData.getFromDate().equals("")){
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dateFrom;
			try {
				dateFrom = sdf.parse(donationsStatisticsData.getFromDate());
				SimpleDateFormat sdfCDA = new SimpleDateFormat("yyyyMMddHHmmss");
				
				String dateString = sdfCDA.format(dateFrom);
				
				String query = "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/effectiveTime/low/@value" + ">='" + dateString +"'";
				andClausesNumerator.add(query);
				andClausesDonaminator.add(query);
							
			} catch (ParseException e) {
				
				logger.log(Level.SEVERE, "Error al parsear la fecha", e);
				
			}
		}
		
		/**
		 * Fecha Hasta
		 */
		if(donationsStatisticsData.getToDate()!= null && !donationsStatisticsData.getToDate().equals("")){
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dateFrom;
			try {
				dateFrom = sdf.parse(donationsStatisticsData.getToDate());
				SimpleDateFormat sdfCDA = new SimpleDateFormat("yyyyMMddHHmmss");
				
				String dateString = sdfCDA.format(dateFrom);
				
				String query = "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/effectiveTime/low/@value" + "<='" + dateString +"'";
				andClausesNumerator.add(query);
				andClausesDonaminator.add(query);
							
			} catch (ParseException e) {
				
				logger.log(Level.SEVERE, "Error al parsear la fecha", e);
				
			}
		}
		
		/**
		 * Cantidad de donaciones
		 */
		//int countDonations = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClauses,orClausesList,null,null);
		
		/**
		 * Filtros NUMERADOR
		 */
		
		
		List<String> filtersAnalysisNumerator = new ArrayList<>();
		String analisisCode = "";
		for(DonationFilterData filter :donationsStatisticsData.getFiltersNumerator()){
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			
			if(filter.getCode().equals(Constants.AGE_FROM) && (filter.getValueString()!= null) && (!filter.getValueString().equals(""))){
				
				Calendar dateFrom = Calendar.getInstance();
				dateFrom.add(Calendar.YEAR, (Integer.parseInt(filter.getValueString()))*(-1));
				
				String dateFromString = sdf.format(dateFrom.getTime());
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				String query = donationFilter.getDonationFilterCodesPath() + "<='" + dateFromString +"'";
				andClausesNumerator.add(query);
								
			}
			
			if(filter.getCode().equals(Constants.AGE_TO) && (filter.getValueString()!= null) && !(filter.getValueString().equals(""))){
				
				Calendar dateFrom = Calendar.getInstance();
				dateFrom.add(Calendar.YEAR, (Integer.parseInt(filter.getValueString())+1)*(-1));
				
				String dateFromString = sdf.format(dateFrom.getTime());
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				String query = donationFilter.getDonationFilterCodesPath() + ">='" + dateFromString +"'";
				andClausesNumerator.add(query);
				
			}
			
			
			if(filter.getValue() != null && filter.getValue().getCode() != null){
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				if(donationFilter != null){
					
					String query = donationFilter.getDonationFilterCodesPath() + "='" + filter.getValue().getCode() +"'";
					
					if(filter.getCode().equals(Constants.ANALYSIS) || filter.getCode().equals(Constants.RESULTS)){
						/**
						 * Analisis
						 */
						if(donationFilter.getDonationFilterCodesValue().equals(Constants.RESULTS)){
							
							if(analisisCode.equals(""))
								
								query = query.replace("/"+Constants.VAR_EVENT_FILTER.toString()+"/", "");
							
							else{
								
								String filterEvent = Constants.EVENT_FILTER + "'" + analisisCode + "']";
								query = query.replace(Constants.VAR_EVENT_FILTER.toString(), filterEvent);
								
							}
							
							
						}else if(donationFilter.getDonationFilterCodesValue().equals(Constants.ANALYSIS)){
							
							analisisCode = filter.getValue().getCode();
							
						}	
						
						filtersAnalysisNumerator.add(query);
						
					}else{
					
						andClausesNumerator.add(query);
					}		
				}
			}	
		}
		
		/**
		 * Filtros DENOMINADOR
		 */
		List<String> filtersAnalysisDenominator = new ArrayList<>();
		String analisisCodeDenominator = "";
		for(DonationFilterData filter :donationsStatisticsData.getFiltersDenominator()){
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			
			if(filter.getCode().equals(Constants.AGE_FROM) && (filter.getValueString()!= null) && (!filter.getValueString().equals(""))){
				
				Calendar dateFrom = Calendar.getInstance();
				dateFrom.add(Calendar.YEAR, (Integer.parseInt(filter.getValueString()))*(-1));
				
				String dateFromString = sdf.format(dateFrom.getTime());
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				String query = donationFilter.getDonationFilterCodesPath() + "<='" + dateFromString +"'";
				andClausesDonaminator.add(query);
				
			}
			
			if(filter.getCode().equals(Constants.AGE_TO) && (filter.getValueString()!= null) && !(filter.getValueString().equals(""))){
				
				Calendar dateFrom = Calendar.getInstance();
				dateFrom.add(Calendar.YEAR, (Integer.parseInt(filter.getValueString())+1)*(-1));
				
				String dateFromString = sdf.format(dateFrom.getTime());
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				String query = donationFilter.getDonationFilterCodesPath() + ">='" + dateFromString +"'";
				andClausesDonaminator.add(query);
				
			}
			
			
			if(filter.getValue() != null && filter.getValue().getCode() != null){
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				if(donationFilter != null){
					
					String query = donationFilter.getDonationFilterCodesPath() + "='" + filter.getValue().getCode() +"'";
					
					if(filter.getCode().equals(Constants.ANALYSIS) || filter.getCode().equals(Constants.RESULTS)){
						/**
						 * Analisis
						 */
						if(donationFilter.getDonationFilterCodesValue().equals(Constants.RESULTS)){
							
							if(analisisCodeDenominator.equals(""))
								
								query = query.replace("/"+Constants.VAR_EVENT_FILTER.toString()+"/", "");
							
							else{
								
								String filterEvent = Constants.EVENT_FILTER + "'" + analisisCodeDenominator + "']";
								query = query.replace(Constants.VAR_EVENT_FILTER.toString(), filterEvent);
								
							}
							
							
						}else if(donationFilter.getDonationFilterCodesValue().equals(Constants.ANALYSIS)){
							
							analisisCodeDenominator = filter.getValue().getCode();
							
						}	
						
						filtersAnalysisDenominator.add(query);
						
					}else{
					
						andClausesDonaminator.add(query);
					}		
				}
			}	
		}
		
		/**
		 * Cantidad de donaciones
		 */
		int countNumerator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisNumerator);
		int countDenominator = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesDonaminator,orClausesList,null,filtersAnalysisDenominator);
		
		DataStatistic donationsCount = new DataStatistic();
		donationsCount.setCountNumerator(countNumerator);
		donationsCount.setCountDenominator(countDenominator);
		donationsCount.setPercentage((donationsCount.getCountDenominator() != 0) ? donationsCount.getCountNumerator() *100/donationsCount.getCountDenominator() : 0);
		
		dataDonationsStatistics.setDonationsCount(donationsCount);
		
		/**
		 * Cantidad de donantes
		 */
		int cantNumerator = 0;
		int cantDenominator = 0;
//		int cantPersons = 0;
		
		for(Person p : FactoryDAO.getPeronDAO(em).getPersonsFilters(new HashMap<String,Object>())){
			
//			cantPersons++;
			
			List<String> orClausesCDAsIds = new ArrayList<>();
			for(PersonsRecord personRecord :FactoryDAO.getPersonRecordDAO(em).getCDAsUserId(p.getId())){
	
				String query = "$doc//ClinicalDocument//id/@root='"+ personRecord.getPersonsRecordCdaRoot() + "' and " +
				"$doc//ClinicalDocument//id/@extension='" + personRecord.getPersonsRecordCdaExtension() +"'";
				orClausesCDAsIds.add(query);
				
			}
			
			if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,orClausesCDAsIds,filtersAnalysisNumerator) > 0){
				
				cantNumerator++;
				
			}
			
			if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesDonaminator,orClausesList,orClausesCDAsIds,filtersAnalysisDenominator) > 0){
				
				cantDenominator++;
				
			}	
		}
		
		DataStatistic donorsCount = new DataStatistic();
		donorsCount.setCountNumerator(cantNumerator);
		donorsCount.setCountDenominator(cantDenominator);
		donorsCount.setPercentage((donorsCount.getCountDenominator() != 0) ? donorsCount.getCountNumerator() *100/donorsCount.getCountDenominator() : 0);
		
		dataDonationsStatistics.setDonorsCount(donorsCount);
		
		return dataDonationsStatistics;
	}

	@Override
	public DataTransfusionsStatisticsResults getTransfusionsStatistics(
			DataTransfusionsStatistics transfusionStatisticsData) throws XMLDataBaseException {
		
		DataTransfusionsStatisticsResults dataDonationsStatistics = new DataTransfusionsStatisticsResults();
		
		List<String> andClausesNumerator = new ArrayList<>();
		List<String> andClausesDenominator = new ArrayList<>();
		
		List<String> orClausesNoDataNumerator = new ArrayList<>();
		List<String> orClausesNoDataDenominator = new ArrayList<>();
		
		List<List<String>> orClausesList = new ArrayList<>();
		List<String> orClauses = new ArrayList<>();
		
		/**
		 * Bancos
		 */
		boolean bankFilter = false;
		if(transfusionStatisticsData.getBloodBank() == null && transfusionStatisticsData.getInstitution() != null ){
			bankFilter = true;
			List<Center> banks = FactoryDAO.getCenterDAO(em).getBanksByInstitutionId(transfusionStatisticsData.getInstitution().getCode());
			for(Center c : banks){
				
				String query = "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root='" + c.getCenterCode() +"'";
				orClauses.add(query);
			
			}
			
		}else if(transfusionStatisticsData.getBloodBank() != null){
			bankFilter = true;
			String query = "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root='" + transfusionStatisticsData.getBloodBank().getCode() +"'";
			andClausesNumerator.add(query);
			andClausesDenominator.add(query);
			
		}
		if(bankFilter){
			String bankNodata = "$doc//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root='' or "
					+ "$doc//ClinicalDocument//author//assignedAuthor//representedOrganization//id//not(@root)" ;
			
			orClausesNoDataNumerator.add(bankNodata);
			orClausesNoDataDenominator.add(bankNodata);
		}
		orClausesList.add(orClauses);
		
		/**
		 * Fecha desde
		 */
		
		boolean dateFilter = false;
		if(transfusionStatisticsData.getFromDate()!= null && !transfusionStatisticsData.getFromDate().equals("")){
			dateFilter=true;
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dateFrom;
			try {
				dateFrom = sdf.parse(transfusionStatisticsData.getFromDate());
				SimpleDateFormat sdfCDA = new SimpleDateFormat("yyyyMMddHHmmss");
				
				String dateString = sdfCDA.format(dateFrom);
				
				String query = "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/effectiveTime/low/@value" + ">='" + dateString +"'";
				andClausesNumerator.add(query);
				andClausesDenominator.add(query);
							
			} catch (ParseException e) {
				
				logger.log(Level.SEVERE, "Error al parsear la fecha", e);
				
			}
		}
		
		/**
		 * Fecha Hasta
		 */
		if(transfusionStatisticsData.getToDate()!= null && !transfusionStatisticsData.getToDate().equals("")){
			dateFilter=true;
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dateFrom;
			try {
				dateFrom = sdf.parse(transfusionStatisticsData.getToDate());
				SimpleDateFormat sdfCDA = new SimpleDateFormat("yyyyMMddHHmmss");
				
				String dateString = sdfCDA.format(dateFrom);
				
				String query = "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/effectiveTime/low/@value" + "<='" + dateString +"'";
				andClausesNumerator.add(query);
				andClausesDenominator.add(query);
							
			} catch (ParseException e) {
				
				logger.log(Level.SEVERE, "Error al parsear la fecha", e);
				
			}
			
		}
		if(dateFilter){
			String dateNodata = "$doc/ClinicalDocument/component/structuredBody/component/section/entry/procedure/effectiveTime/low/@value='' or "
					+ "$doc/ClinicalDocument/component/structuredBody/component/section/entry/procedure/effectiveTime/low/not(@value)" ;
			orClausesNoDataNumerator.add(dateNodata);
			orClausesNoDataDenominator.add(dateNodata);
		}
		
		/**
		 * Cantidad de transfusiones
		 */
		//int countTransfusions = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClauses,orClausesList,null,null);
		
		/**
		 * Cantidad de eventos adversos
		 */
		//int countAdverseEvents = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countEvents(andClauses,orClausesList,null);
		
		
		/**
		 * Filtros DENOMINADOR
		 */
		List<String> filtersDenominator = new ArrayList<>();
		String edverseEventCodeDenominator = "";
		for(TransfusionFilterData filter :transfusionStatisticsData.getAllFiltersDenominator()){
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			
			if(filter.getCode().equals(Constants.AGE_FROM) && (filter.getValueString()!= null) && (!filter.getValueString().equals(""))){
				
				Calendar dateFrom = Calendar.getInstance();
				dateFrom.add(Calendar.YEAR, (Integer.parseInt(filter.getValueString()))*(-1));
				
				String dateFromString = sdf.format(dateFrom.getTime());
				
				TransfusionFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(filter.getCode());
				
				String query = donationFilter.getTransfusionFilterCodesPath() + "<='" + dateFromString +"'";
				andClausesDenominator.add(query);
				
				String dateNodata = "$doc/" +donationFilter.getTransfusionFilterCodesPath()+"='' or "
						+ "not("+"$doc/" + donationFilter.getTransfusionFilterCodesPath() +")" ;
				orClausesNoDataDenominator.add(dateNodata);
				
			}
			
			if(filter.getCode().equals(Constants.AGE_TO) && (filter.getValueString()!= null) && !(filter.getValueString().equals(""))){
				
				Calendar dateFrom = Calendar.getInstance();
				dateFrom.add(Calendar.YEAR, (Integer.parseInt(filter.getValueString())+1)*(-1));
				
				String dateFromString = sdf.format(dateFrom.getTime());
				
				TransfusionFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(filter.getCode());
				
				String query = donationFilter.getTransfusionFilterCodesPath() + ">='" + dateFromString +"'";
				andClausesDenominator.add(query);
				
				String dateNodata ="$doc/" + donationFilter.getTransfusionFilterCodesPath()+"='' or "
						+ "not("+ "$doc/" +donationFilter.getTransfusionFilterCodesPath() +")" ;
				orClausesNoDataDenominator.add(dateNodata);
				
			}
			
			if(filter.getValue() != null && filter.getValue().getCode() != null){
				
				TransfusionFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(filter.getCode());
				String query ="";
				if(donationFilter != null){
					
					query = donationFilter.getTransfusionFilterCodesPath() + "='" + filter.getValue().getCode() +"'";
					
					String dateNodata = "$doc/" +donationFilter.getTransfusionFilterCodesPath()+"='' or "
							+ "not("+ "$doc/" +donationFilter.getTransfusionFilterCodesPath() +")" ;
					
					if(donationFilter.getTransfusionFilterCodesValue().equals(Constants.SEVERITY_EVENT)){
						
						if(edverseEventCodeDenominator.equals("")){
							
							query = query.replace("/"+Constants.VAR_EVENT_FILTER.toString()+"/", "");
							dateNodata = dateNodata.replace("/"+Constants.VAR_EVENT_FILTER.toString()+"/", "");
							
						}else{
							
							String filterEvent = Constants.EVENT_FILTER + "'" + edverseEventCodeDenominator + "']";
							query = query.replace(Constants.VAR_EVENT_FILTER.toString(), filterEvent);
							dateNodata = dateNodata.replace(Constants.VAR_EVENT_FILTER.toString(), filterEvent);
						}
						filtersDenominator.add(query);
						
					}
					
					andClausesDenominator.add(query);
					
					if(donationFilter.getTransfusionFilterCodesValue().equals(Constants.ADVERSE_EVENT)){
						edverseEventCodeDenominator = filter.getValue().getCode();
						filtersDenominator.add(query);
						
						// Si es evento adverso solo ve que sea vacio si no esta es porque no tuvo esvento adverso.
						dateNodata ="$doc/" + donationFilter.getTransfusionFilterCodesPath()+"=''";
					}	
					
					orClausesNoDataDenominator.add(dateNodata);
					
				}
			}	
		}
		
		
		/**
		 * Filtros NUMERADOR
		 */
		List<String> adversEventsFilters = new ArrayList<>();
		String edverseEventCode = "";
		for(TransfusionFilterData filter :transfusionStatisticsData.getFilters()){
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			
			if(filter.getCode().equals(Constants.AGE_FROM) && (filter.getValueString()!= null) && (!filter.getValueString().equals(""))){
				
				Calendar dateFrom = Calendar.getInstance();
				dateFrom.add(Calendar.YEAR, (Integer.parseInt(filter.getValueString()))*(-1));
				
				String dateFromString = sdf.format(dateFrom.getTime());
				
				TransfusionFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(filter.getCode());
				
				String query = donationFilter.getTransfusionFilterCodesPath() + "<='" + dateFromString +"'";
				andClausesNumerator.add(query);
				
				String dateNodata = "$doc/" +donationFilter.getTransfusionFilterCodesPath()+"='' or "
						+ "not("+"$doc/" + donationFilter.getTransfusionFilterCodesPath() +")" ;
				orClausesNoDataNumerator.add(dateNodata);
				
			}
			
			if(filter.getCode().equals(Constants.AGE_TO) && (filter.getValueString()!= null) && !(filter.getValueString().equals(""))){
				
				Calendar dateFrom = Calendar.getInstance();
				dateFrom.add(Calendar.YEAR, (Integer.parseInt(filter.getValueString())+1)*(-1));
				
				String dateFromString = sdf.format(dateFrom.getTime());
				
				TransfusionFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(filter.getCode());
				
				String query = donationFilter.getTransfusionFilterCodesPath() + ">='" + dateFromString +"'";
				andClausesNumerator.add(query);
				
				String dateNodata = "$doc/" +donationFilter.getTransfusionFilterCodesPath()+"='' or "
						+ "not("+"$doc/" + donationFilter.getTransfusionFilterCodesPath() +")" ;
				orClausesNoDataNumerator.add(dateNodata);
				
			}
			
			if(filter.getValue() != null && filter.getValue().getCode() != null){
				
				TransfusionFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(filter.getCode());
				String query ="";
				if(donationFilter != null){
					
					
					query = donationFilter.getTransfusionFilterCodesPath() + "='" + filter.getValue().getCode() +"'";
					
					String dateNodata = "$doc/" +donationFilter.getTransfusionFilterCodesPath()+"='' or "
							+ "not("+ "$doc/" +donationFilter.getTransfusionFilterCodesPath() +")" ;
					
					
					if(donationFilter.getTransfusionFilterCodesValue().equals(Constants.SEVERITY_EVENT)){
						
						if(edverseEventCode.equals("")){
							query = query.replace("/"+Constants.VAR_EVENT_FILTER.toString()+"/", "");
							dateNodata = dateNodata.replace("/"+Constants.VAR_EVENT_FILTER.toString()+"/", "");
						}else{
							String filterEvent = Constants.EVENT_FILTER + "'" + edverseEventCode + "']";
							query = query.replace(Constants.VAR_EVENT_FILTER.toString(), filterEvent);
							dateNodata = dateNodata.replace(Constants.VAR_EVENT_FILTER.toString(), filterEvent);
						}
						adversEventsFilters.add(query);
						
					}
					
					andClausesNumerator.add(query);
					
					if(donationFilter.getTransfusionFilterCodesValue().equals(Constants.ADVERSE_EVENT)){
						// Si es evento adverso solo ve que sea vacio si no esta es porque no tuvo esvento adverso.
						dateNodata = "$doc/" +donationFilter.getTransfusionFilterCodesPath()+"=''";
						
						edverseEventCode = filter.getValue().getCode();
						adversEventsFilters.add(query);
					}
					
					orClausesNoDataNumerator.add(dateNodata);
				}
			}	
		}
		
		/**
		 * Cantidad de transfusiones
		 */
//		orClausesList.add(orClauses);
		int countNumeratos = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,null,null);
		int countDenominator = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesDenominator,orClausesList,null,null);
		
		DataStatistic donationsCount = new DataStatistic();
		donationsCount.setCountNumerator(countNumeratos);
		donationsCount.setCountDenominator(countDenominator);
		
		
		int noDataNumeratorDonations = 0, noDataDenominatorDonations = 0  ;
		if(orClausesNoDataNumerator != null && orClausesNoDataNumerator.size() !=0){
			
			noDataNumeratorDonations = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(orClausesNoDataNumerator);
		}
		
		if(orClausesNoDataDenominator != null && orClausesNoDataDenominator.size() != 0){
			
			noDataDenominatorDonations = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(orClausesNoDataDenominator);
		}	 
		
		dataDonationsStatistics.setNoDataDenominator(noDataDenominatorDonations);
		dataDonationsStatistics.setNoDataNumerator(noDataNumeratorDonations);
		
		donationsCount.setPercentage((donationsCount.getCountDenominator() != 0) ? donationsCount.getCountNumerator() *100/donationsCount.getCountDenominator() : 0);
		dataDonationsStatistics.setTransfusionsCount(donationsCount);
		
		/**
		 * Cantidad de personas transfundidas
		 */
		int cantNumerator = 0;
		int cantDenominator = 0;
		
		for(Person p : FactoryDAO.getPeronDAO(em).getPersonsFilters(new HashMap<String,Object>())){
			
			List<String> orClausesCDAsIds = new ArrayList<>();
			for(PersonsRecord personRecord :FactoryDAO.getPersonRecordDAO(em).getCDAsUserId(p.getId())){
	
				String query = "$doc//ClinicalDocument//id/@root='"+ personRecord.getPersonsRecordCdaRoot() + "' and " +
				"$doc//ClinicalDocument//id/@extension='" + personRecord.getPersonsRecordCdaExtension() +"'";
				orClausesCDAsIds.add(query);
				
			}
			
			if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumerator,orClausesList,orClausesCDAsIds,null) > 0){
				
				cantNumerator++;
				
			}	
			if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesDenominator,orClausesList,orClausesCDAsIds,null) > 0){
				
				cantDenominator++;
				
			}	
		}
		
		DataStatistic donorsCount = new DataStatistic();
		donorsCount.setCountNumerator(cantNumerator);
		donorsCount.setCountDenominator(cantDenominator);
		donorsCount.setPercentage((donorsCount.getCountDenominator() != 0) ? donorsCount.getCountNumerator() *100/donorsCount.getCountDenominator() : 0);
		dataDonationsStatistics.setPersonTransfusionsCount(donorsCount);
		
		/**
		 * Cantidad de eventos adversos
		 */
		int countAdverseEventsAllFilters = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countEvents(andClausesNumerator,orClausesList,adversEventsFilters);
		int countAdverseEventsDenominator = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countEvents(andClausesDenominator,orClausesList,filtersDenominator);
		
		DataStatistic eventsCount = new DataStatistic();
		eventsCount.setCountNumerator(countAdverseEventsAllFilters);
		eventsCount.setCountDenominator(countAdverseEventsDenominator);
		eventsCount.setPercentage((eventsCount.getCountDenominator() != 0) ? eventsCount.getCountNumerator() *100/eventsCount.getCountDenominator() : 0);
		dataDonationsStatistics.setAdversEventsCount(eventsCount);
			
		return dataDonationsStatistics;
	}

}
