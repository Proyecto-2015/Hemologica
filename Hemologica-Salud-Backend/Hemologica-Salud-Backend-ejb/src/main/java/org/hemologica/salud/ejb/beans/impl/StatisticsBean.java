package org.hemologica.salud.ejb.beans.impl;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
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
import org.hemologica.datatypes.DataAnswer;
import org.hemologica.datatypes.DataDonationsStatistics;
import org.hemologica.datatypes.DataDonationsStatisticsResults;
import org.hemologica.datatypes.DataOmsStatistics;
import org.hemologica.datatypes.DataQuestion;
import org.hemologica.datatypes.DataStatistic;
import org.hemologica.datatypes.DataTransfusionsStatistics;
import org.hemologica.datatypes.DataTransfusionsStatisticsResults;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.TransfusionFilterData;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.StatisticsBeanLocal;
import org.hemologica.salud.web.oms.FooterAndHeader;
import org.hemologica.salud.web.oms.OmsStatistics;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.hemologica.xmldatabase.factories.XMLDataBaseFactory;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import com.bradmcevoy.http.values.Pair;
import com.itextpdf.text.*;

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
		
		/**
		 * Cantidad de transfusiones
		 */
		int countDonations = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(null,null,null,null);
		dataDonationsStatistics.setCantDonations(countDonations);
		
		Pair<Integer, Integer> countPersonDonation = getCantPerson(null, null, null, null, null);
		if(countPersonDonation != null){
			dataDonationsStatistics.setCantDonors(countPersonDonation.getObject1());
		}
		
		List<String> andClausesNumerator = new ArrayList<>();
		List<String> andClausesDonaminator = new ArrayList<>();
		
		List<String> orClausesNoDataNumerator = new ArrayList<>();
		List<String> orClausesNoDataDenominator = new ArrayList<>();
		
		List<List<String>> orClausesList = new ArrayList<>();
		List<String> orClauses = new ArrayList<>();
		
		/**
		 * Bancos
		 */
		boolean bankFilter = false;
		if(donationsStatisticsData.getBloodBank() == null && donationsStatisticsData.getInstitution() != null ){
			
			bankFilter = true;
			List<Center> banks = FactoryDAO.getCenterDAO(em).getBanksByInstitutionId(donationsStatisticsData.getInstitution().getCode());
			for(Center c : banks){
				
				String query = "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root='" + c.getCenterCode() +"'";
				orClauses.add(query);
			
			}
		}else if(donationsStatisticsData.getBloodBank() != null){
			
			bankFilter = true;
			String query = "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root='" + donationsStatisticsData.getBloodBank().getCode() +"'";
			andClausesNumerator.add(query);
			andClausesDonaminator.add(query);
			
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
		if(donationsStatisticsData.getFromDate()!= null && !donationsStatisticsData.getFromDate().equals("")){
			
			dateFilter = true;
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
			
			dateFilter = true;
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
		
		if(dateFilter){
			String dateNodata = "$doc/ClinicalDocument/component/structuredBody/component/section/entry/procedure/effectiveTime/low/@value='' or "
					+ "$doc/ClinicalDocument/component/structuredBody/component/section/entry/procedure/effectiveTime/low/not(@value)" ;
			orClausesNoDataNumerator.add(dateNodata);
			orClausesNoDataDenominator.add(dateNodata);
		}
		
		/**
		 * Cantidad de donaciones
		 */
		//int countDonations = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClauses,orClausesList,null,null);
		
		/**
		 * Filtros NUMERADOR
		 */
		
		
		List<String> filtersAnalysisNumerator = new ArrayList<>();
		List<String> filtersAnalysisNumeratorNoData = new ArrayList<>();
		
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
				
				String dateNodata = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
						+ "not("+"$doc/" + donationFilter.getDonationFilterCodesPath() +")" ;
				orClausesNoDataNumerator.add(dateNodata);
								
			}
			
			if(filter.getCode().equals(Constants.AGE_TO) && (filter.getValueString()!= null) && !(filter.getValueString().equals(""))){
				
				Calendar dateFrom = Calendar.getInstance();
				dateFrom.add(Calendar.YEAR, (Integer.parseInt(filter.getValueString())+1)*(-1));
				
				String dateFromString = sdf.format(dateFrom.getTime());
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				String query = donationFilter.getDonationFilterCodesPath() + ">='" + dateFromString +"'";
				andClausesNumerator.add(query);
				
				String dateNodata = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
						+ "not("+"$doc/" + donationFilter.getDonationFilterCodesPath() +")" ;
				orClausesNoDataNumerator.add(dateNodata);
				
			}
			
			
			if(filter.getValue() != null && filter.getValue().getCode() != null){
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				if(donationFilter != null){
					
					String query = donationFilter.getDonationFilterCodesPath() + "='" + filter.getValue().getCode() +"'";
					
					String dateNodata = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
							+ "not("+ "$doc/" +donationFilter.getDonationFilterCodesPath() +")" ;
					
					
					if(filter.getCode().equals(Constants.ANALYSIS) || filter.getCode().equals(Constants.RESULTS)){
						/**
						 * Analisis
						 */
						if(donationFilter.getDonationFilterCodesValue().equals(Constants.RESULTS)){
							
							if(analisisCode.equals("")){
								
								query = query.replace("/"+Constants.VAR_EVENT_FILTER.toString()+"/", "");
								dateNodata = dateNodata.replace("/"+Constants.VAR_EVENT_FILTER.toString()+"/", "");
								
							}else{
								
								String filterEvent = Constants.ANALYSIS_FILTER + "'" + analisisCode + "']";
								query = query.replace(Constants.VAR_EVENT_FILTER.toString(), filterEvent);					
								dateNodata = dateNodata.replace(Constants.VAR_EVENT_FILTER.toString(), filterEvent);
							}
							
							
						}else if(donationFilter.getDonationFilterCodesValue().equals(Constants.ANALYSIS)){
							
							analisisCode = filter.getValue().getCode();
							
							// Si es evento adverso solo ve que sea vacio si no esta es porque no tuvo esvento adverso.
							dateNodata = donationFilter.getDonationFilterCodesPath()+"=''";
							
						}	
						
						filtersAnalysisNumerator.add(query);
						filtersAnalysisNumeratorNoData.add(dateNodata);
						
					}else{
					
						andClausesNumerator.add(query);
						orClausesNoDataNumerator.add(dateNodata);
					}	
					
				}
			}	
		}
		
		/**
		 * Filtros DENOMINADOR
		 */
		List<String> filtersAnalysisDenominator = new ArrayList<>();
		List<String> filtersAnalysisDenominatorNoData = new ArrayList<>();
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
				
				String dateNodata = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
						+ "not("+"$doc/" + donationFilter.getDonationFilterCodesPath() +")" ;
				orClausesNoDataDenominator.add(dateNodata);
				
			}
			
			if(filter.getCode().equals(Constants.AGE_TO) && (filter.getValueString()!= null) && !(filter.getValueString().equals(""))){
				
				Calendar dateFrom = Calendar.getInstance();
				dateFrom.add(Calendar.YEAR, (Integer.parseInt(filter.getValueString())+1)*(-1));
				
				String dateFromString = sdf.format(dateFrom.getTime());
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				String query = donationFilter.getDonationFilterCodesPath() + ">='" + dateFromString +"'";
				andClausesDonaminator.add(query);
				
				String dateNodata = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
						+ "not("+"$doc/" + donationFilter.getDonationFilterCodesPath() +")" ;
				orClausesNoDataDenominator.add(dateNodata);
				
			}
			
			
			if(filter.getValue() != null && filter.getValue().getCode() != null){
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				if(donationFilter != null){
					
					String query = donationFilter.getDonationFilterCodesPath() + "='" + filter.getValue().getCode() +"'";
					
					String dateNodata = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
							+ "not("+ "$doc/" +donationFilter.getDonationFilterCodesPath() +")" ;
					
					if(filter.getCode().equals(Constants.ANALYSIS) || filter.getCode().equals(Constants.RESULTS)){
						/**
						 * Analisis
						 */
						if(donationFilter.getDonationFilterCodesValue().equals(Constants.RESULTS)){
							
							if(analisisCodeDenominator.equals("")){
								
								query = query.replace("/"+Constants.VAR_EVENT_FILTER.toString()+"/", "");
								dateNodata = dateNodata.replace("/"+Constants.VAR_EVENT_FILTER.toString()+"/", "");
							
							}else{
								
								String filterEvent = Constants.ANALYSIS_FILTER + "'" + analisisCodeDenominator + "']";
								query = query.replace(Constants.VAR_EVENT_FILTER.toString(), filterEvent);
								dateNodata = dateNodata.replace(Constants.VAR_EVENT_FILTER.toString(), filterEvent);
								
							}
							
							
						}else if(donationFilter.getDonationFilterCodesValue().equals(Constants.ANALYSIS)){
							
							analisisCodeDenominator = filter.getValue().getCode();
							
							// Si es evento adverso solo ve que sea vacio si no esta es porque no tuvo esvento adverso.
							dateNodata = donationFilter.getDonationFilterCodesPath()+"=''";
							
						}	
						
						filtersAnalysisDenominator.add(query);
						filtersAnalysisDenominatorNoData.add(dateNodata);
						
					}else{
					
						andClausesDonaminator.add(query);
						orClausesNoDataDenominator.add(dateNodata);
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
				
		int noDataNumeratorDonations = 0, noDataDenominatorDonations = 0  ;
		if((orClausesNoDataNumerator != null && orClausesNoDataNumerator.size() !=0) || (filtersAnalysisNumeratorNoData != null && filtersAnalysisNumeratorNoData.size() !=0)){
			
			noDataNumeratorDonations = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(orClausesNoDataNumerator,filtersAnalysisNumeratorNoData);
		}
		
		if(orClausesNoDataDenominator != null && orClausesNoDataDenominator.size() != 0 || (filtersAnalysisDenominatorNoData != null && filtersAnalysisDenominatorNoData.size() !=0) ){
			
			noDataDenominatorDonations = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(orClausesNoDataDenominator, filtersAnalysisDenominatorNoData);
		}	 
		
		dataDonationsStatistics.setNoDataDenominator(noDataDenominatorDonations);
		dataDonationsStatistics.setNoDataNumerator(noDataNumeratorDonations);
		
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
		
		/**
		 * Cantidad de transfusiones
		 */
		int countTransfusions = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(null,null,null,null);
		dataDonationsStatistics.setCantTransfusions(countTransfusions);
		/**
		 * Cantidad de eventos adversos
		 */
		int countAdverseEvents = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countEvents(null,null,null);
		dataDonationsStatistics.setCantEvents(countAdverseEvents);
		
		Pair<Integer, Integer> countPersonTransfusion = getCantPerson(null, null, null, null, null);
		if(countPersonTransfusion != null){
			dataDonationsStatistics.setCantPersonTransfusion(countPersonTransfusion.getObject2());
		}
		
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
			
			noDataNumeratorDonations = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(orClausesNoDataNumerator,null);
		}
		
		if(orClausesNoDataDenominator != null && orClausesNoDataDenominator.size() != 0){
			
			noDataDenominatorDonations = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(orClausesNoDataDenominator,null);
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
	
				String query = "$doc/ClinicalDocument/id/@root='"+ personRecord.getPersonsRecordCdaRoot() + "' and " +
				"$doc/ClinicalDocument/id/@extension='" + personRecord.getPersonsRecordCdaExtension() +"'";
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

	@Override
	public ByteArrayOutputStream getOmsStatistics(DataOmsStatistics statictic) {
		
		List<String> andClausesNumerator = new ArrayList<>();
		
		List<List<String>> orClausesList = new ArrayList<>();
		List<String> orClauses = new ArrayList<>();
		
		/**
		 * Bancos
		 */
		if(statictic.getBloodBank() == null && statictic.getInstitution() != null ){
			
			List<Center> banks = FactoryDAO.getCenterDAO(em).getBanksByInstitutionId(statictic.getInstitution().getCode());
			for(Center c : banks){
				
				String query = "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root='" + c.getCenterCode() +"'";
				orClauses.add(query);
			
			}
			
		}else if(statictic.getBloodBank() != null){
			
			String query = "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root='" + statictic.getBloodBank().getCode() +"'";
			andClausesNumerator.add(query);
			
		}
		
		orClausesList.add(orClauses);
		
		/**
		 * Fecha desde
		 */
		
		if(statictic.getFromDate()!= null && !statictic.getFromDate().equals("")){
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dateFrom;
			try {
				dateFrom = sdf.parse(statictic.getFromDate());
				SimpleDateFormat sdfCDA = new SimpleDateFormat("yyyyMMddHHmmss");
				
				String dateString = sdfCDA.format(dateFrom);
				
				String query = "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/effectiveTime/low/@value" + ">='" + dateString +"'";
				andClausesNumerator.add(query);
							
			} catch (ParseException e) {
				
				logger.log(Level.SEVERE, "Error al parsear la fecha", e);
				
			}
		}
		
		/**
		 * Fecha Hasta
		 */
		if(statictic.getToDate()!= null && !statictic.getToDate().equals("")){

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dateFrom;
			try {
				dateFrom = sdf.parse(statictic.getToDate());
				SimpleDateFormat sdfCDA = new SimpleDateFormat("yyyyMMddHHmmss");
				
				String dateString = sdfCDA.format(dateFrom);
				
				String query = "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/effectiveTime/low/@value" + "<='" + dateString +"'";
				andClausesNumerator.add(query);
							
			} catch (ParseException e) {
				
				logger.log(Level.SEVERE, "Error al parsear la fecha", e);
				
			}
			
		}

		Document document = new Document();
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		
        try {
        	
        	PdfWriter p = PdfWriter.getInstance(document, byteArrayOutputStream);
	        
	        Rectangle rect = new Rectangle(30, 30, 550, 900);
	        p.setBoxSize("art", rect);
	        
	        p.setPageSize(rect);
	        
	        document.open();
	        
//	        FooterAndHeader event = new FooterAndHeader();
//	        p.setPageEvent(event);
            
	        /**
	         * Logo de Hemologica
	         */
	        
	        PdfPTable table = new PdfPTable(2);
			table.setTotalWidth(110); 
			 
	    	Image img;
	 		try {

	 			table.setWidths(new float[]{1,3});
	 			
	 			URL imagePath = FooterAndHeader.class.getResource("/img/hemologica-logo-6.png");
	 			
	 			img = Image.getInstance(imagePath.getPath());
	 			img.scaleToFit(20,20);
	 			
	 			PdfPCell cell = new PdfPCell();
	 			cell.setBorder(Rectangle.NO_BORDER);
	 			cell.addElement(new Chunk(img, 0, 0));
	 			cell.setFixedHeight(35f);
	 			table.addCell(cell);
	 			
	 			PdfPCell cellText = new PdfPCell();
	 			cellText.setBorder(Rectangle.NO_BORDER);
	 			cellText.addElement(new Chunk("Hemologica"));
	 			cellText.setFixedHeight(45f);
	 			table.addCell(cellText);
	 			
	 			table.writeSelectedRows(0, -1, 36, 830, p.getDirectContent());
	 			
	 			
	 			document.add(Chunk.NEWLINE);
	 			
	 	         
	 		} catch (BadElementException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		} catch (MalformedURLException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		} catch (IOException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		} catch (DocumentException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}

            Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            	      Font.BOLD);
            Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
          	      Font.BOLD);
            
            /**
             * Titulo
             */
            Paragraph title = new Paragraph("Indicadores", catFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);
            
            document.add(Chunk.NEWLINE);
            
            /**
             * Info general
             */
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Paragraph paragrafInfo = new Paragraph("Fecha: " + sdf.format(Calendar.getInstance().getTime()));
            document.add(paragrafInfo);
            
            document.add(Chunk.NEWLINE);
            
            Paragraph paragrafVersion = new Paragraph("Version Hemologica: 1.0");
            document.add(paragrafVersion);
            document.add(Chunk.NEWLINE);
            
            /**
             * Población general
             */  
            
            Paragraph generalPeople = new Paragraph("Poblacion general",smallBold);
            document.add(generalPeople);
            
            int cantDonations = 0, cantTransfusions = 0, cantAdversEvents = 0;
            Pair<Integer,Integer> cant = null;
            try {
            	cant = getCantPerson(null,null,null,null,null);
            	cantDonations = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(null,null,null,null);
            	cantTransfusions = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(null,null,null,null);
            	cantAdversEvents = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countEvents(null, null, null);
            	
			} catch (XMLDataBaseException e) {
				
				logger.log(Level.SEVERE, "Error al calcular poblacion general ", e);
			}
            
            document.add(new Paragraph("Cantidad de donantes: " + cant.getObject1() ));
            document.add(new Paragraph("Cantidad de donaciones: " + cantDonations));
            document.add(new Paragraph("Cantidad de personas transfundidas: " + cant.getObject2()));
            document.add(new Paragraph("Cantidad de transfusiones: " + cantTransfusions));
            document.add(new Paragraph("Cantidad de eventos adversos: " + cantAdversEvents));
            
            document.add(Chunk.NEWLINE);
       
            /**
             * Filtros
             */
            
            Properties prop = new Properties();
			try {
				
				prop.load(StatisticsBean.class.getClassLoader().getResourceAsStream("messages.properties"));
				
			} catch (IOException e) {
				
				logger.log(Level.SEVERE,"error al leer el archivo de etiquetas", e);
			}
            
            document.add(new Paragraph("Filtros generales",smallBold));
            
            for(DonationFilterData filter : statictic.getCommonsFilters()){
            	
            	if(filter.getValue() != null){
            		
            		document.add(new Paragraph(prop.getProperty(filter.getDisplayName()) +": " + prop.getProperty(filter.getValue().getDisplayName())));
            		
            	}else if(filter.getValueString() != null && !filter.getValueString().equals("")){
            		
            		document.add(new Paragraph(prop.getProperty(filter.getDisplayName()) +": " + prop.getProperty(filter.getValueString())));
            		
            	}            	
            }
            
            document.add(new Paragraph("Filtros donaciones", smallBold));
            
            for(DonationFilterData filter : statictic.getDonationFilter()){
            	
            	if(filter.getValue() != null){
            		
            		document.add(new Paragraph(prop.getProperty(filter.getDisplayName()) +": " + prop.getProperty(filter.getValue().getDisplayName())));
            		
            	}else if(filter.getValueString() != null){
            		
            		document.add(new Paragraph(prop.getProperty(filter.getDisplayName()) +": " + prop.getProperty(filter.getValueString())));
            		
            	}            	
            }
            
            document.add(new Paragraph("Filtros transfusiones", smallBold ));
            
            for(TransfusionFilterData filter : statictic.getTransfusionFilter()){
            	
            	if(filter.getValue() != null){
            		
            		document.add(new Paragraph(prop.getProperty(filter.getDisplayName()) +": " + prop.getProperty(filter.getValue().getDisplayName())));
            		
            	}else if(filter.getValueString() != null){
            		
            		document.add(new Paragraph(prop.getProperty(filter.getDisplayName()) +": " + prop.getProperty(filter.getValueString())));
            		
            	}            	
            }
            
            document.add(Chunk.NEWLINE);
            

            List<String> filtersAnalysisDenominator = new ArrayList<>();
            List<String> filtersAnalysisDenominatorNoData = new ArrayList<>();
            List<String> orClausesNoDataDenominator = new ArrayList<>();
            
            getCommonsQueries(statictic.getCommonsFilters(), andClausesNumerator, orClausesNoDataDenominator);
           
            List<String> andClausesNumeratorCopy = new ArrayList<>();
            List<String> orClausesNoDataDenominatorCopy = new ArrayList<>();
            
            for(String s : andClausesNumerator){
            	andClausesNumeratorCopy.add(new String(s));
            }
            for(String s : orClausesNoDataDenominator){
            	orClausesNoDataDenominatorCopy.add(new String(s));
            }
            
            getQueriesDonations(statictic.getDonationFilter(), andClausesNumerator, orClausesNoDataDenominator, filtersAnalysisDenominator, filtersAnalysisDenominatorNoData);

            getQueriesTransfusion(statictic.getTransfusionFilter(), andClausesNumeratorCopy, orClausesNoDataDenominatorCopy);
            
            /**
             * Población general
             */  
            
            Paragraph filterPeople = new Paragraph("Poblacion filtrada",smallBold);
            document.add(filterPeople);
            
            int cantDonationsFilter = 0, cantTransfusionsFilter = 0, cantAdversEventsFilter = 0;
            Pair<Integer,Integer> cantFilter = null;
            try {
            	cantFilter = getCantPerson(andClausesNumerator,orClausesList,filtersAnalysisDenominator,andClausesNumeratorCopy,orClausesList);
            	cantDonationsFilter = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesNumerator,orClausesList,null,filtersAnalysisDenominator);
            	cantTransfusionsFilter = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesNumeratorCopy,orClausesList,null,null);
            	cantAdversEventsFilter = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countEvents(andClausesNumeratorCopy, orClausesList, null);
            	
			} catch (XMLDataBaseException e) {
				
				logger.log(Level.SEVERE, "Error al calcular poblacion general ", e);
			}
            
            document.add(new Paragraph("Cantidad de donantes: " + cantFilter.getObject1() ));
            document.add(new Paragraph("Cantidad de donaciones: " + cantDonationsFilter));
            document.add(new Paragraph("Cantidad de personas transfundidas: " + cantFilter.getObject2()));
            document.add(new Paragraph("Cantidad de transfusiones: " + cantTransfusionsFilter));
            document.add(new Paragraph("Cantidad de eventos adversos: " + cantAdversEventsFilter));
            
            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
            
            
            List<DataQuestion> questions = OmsStatistics.getDonationsQuestions(orClausesList,andClausesNumerator,orClausesNoDataDenominator,filtersAnalysisDenominator, filtersAnalysisDenominatorNoData, em);
            
            List<DataQuestion> qTransfusions = OmsStatistics.getTransfusionsQuestions(orClausesList,andClausesNumeratorCopy,orClausesNoDataDenominatorCopy,null, null, em);
            
            questions.addAll(qTransfusions);
            
            for(DataQuestion dataQuestion : questions){
            	
            	Paragraph preface = new Paragraph(); 
            	//preface.setAlignment(Element.ALIGN_CENTER);
            	
            	preface.add(new Phrase(dataQuestion.getQuestion()));
            	
            	com.itextpdf.text.List orderedList = new com.itextpdf.text.List(com.itextpdf.text.List.ORDERED);
	            
            	for(DataAnswer dataAnswer : dataQuestion.getAnswers()){
	            
		            orderedList.add(new ListItem(dataAnswer.getAnswer() + " " + dataAnswer.getAnswerResult()));

	            }
	            
            	preface.add(orderedList);
            	
	            document.add(preface);
	            document.add(new Phrase("Sin datos: " + dataQuestion.getNodata()));
	            document.add( Chunk.NEWLINE );
	            document.add( Chunk.NEWLINE );
            }
            
            /**
             * Logos Universidad
             */

    		PdfPTable tableFooter = new PdfPTable(3);
    		tableFooter.setTotalWidth(160);
            
    		Image imgFing, imgUdelar, imgNib;
     		try {

     			tableFooter.setWidths(new float[]{2, 1, 1});
     			
     			URL UrlUdelar = FooterAndHeader.class.getResource("/img/udelar-logo.jpg");
     			URL UrlFing = FooterAndHeader.class.getResource("/img/fing-logo.jpg");
     			URL UrlNib = FooterAndHeader.class.getResource("/img/nib-logo.jpg");

     			if(UrlNib != null){
     				
    	 			imgNib = Image.getInstance(UrlNib.getPath());
    	 					 		
    	 			PdfPCell cell = new PdfPCell();
    	 			cell.setBorder(Rectangle.NO_BORDER);
    	 			cell.addElement(new Chunk(imgNib, 0, rect.getBottom() - 18));
    	 			cell.setFixedHeight(30f);
    	 			tableFooter.addCell(cell);
    	 			
     			}
     			
     			if(UrlFing != null){
     				
    	 			imgFing = Image.getInstance(UrlFing.getPath());
    	 			imgFing.scaleToFit(140,140);
    	 			
    	 			PdfPCell cell = new PdfPCell();
    	 			cell.setBorder(Rectangle.NO_BORDER);
    	 			cell.addElement(new Chunk(imgFing, 0, rect.getBottom() - 18));
    	 			cell.setFixedHeight(45f);
    	 			tableFooter.addCell(cell);
    	 			
     			}

     			if(UrlUdelar != null){
     				
    	 			imgUdelar = Image.getInstance(UrlUdelar.getPath());
    	 			imgUdelar.scaleToFit(145,145);
    	 			
    	 			PdfPCell cell = new PdfPCell();
    	 			cell.setBorder(Rectangle.NO_BORDER);
    	 			cell.addElement(new Chunk(imgUdelar, 0, rect.getBottom() - 18));
    	 			cell.setFixedHeight(45f);
    	 			tableFooter.addCell(cell);
     			}	
     			
     			
     			tableFooter.writeSelectedRows(0, -1, 36, 20, p.getDirectContent());	 			
     	         
     		} catch (BadElementException e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		} catch (MalformedURLException e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		} catch (IOException e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		} catch (DocumentException e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		}
            
            document.close();

        } catch (DocumentException e) {
        	
            logger.log(Level.SEVERE, "Error al crear el documento DocumentException", e);
            
        } 

		return byteArrayOutputStream;
		
	}
	
	public class HeaderFooterPageEvent extends PdfPageEventHelper {
	    
		public void onStartPage(PdfWriter writer,Document document) {
	    	Rectangle rect = writer.getBoxSize("art");
	        ColumnText.showTextAligned(writer.getDirectContent(),Element.ALIGN_CENTER, new Phrase("Top Left"), rect.getLeft(), rect.getTop(), 0);
	        ColumnText.showTextAligned(writer.getDirectContent(),Element.ALIGN_CENTER, new Phrase("Top Right"), rect.getRight(), rect.getTop(), 0);
	    }
	    public void onEndPage(PdfWriter writer,Document document) {
	    	Rectangle rect = writer.getBoxSize("art");
	        ColumnText.showTextAligned(writer.getDirectContent(),Element.ALIGN_CENTER, new Phrase("Bottom Left"), rect.getLeft(), rect.getBottom(), 0);
	        ColumnText.showTextAligned(writer.getDirectContent(),Element.ALIGN_CENTER, new Phrase("Bottom Right"), rect.getRight(), rect.getBottom(), 0);
	    }
	} 
	
	public void getCommonsQueries(List<DonationFilterData> commonsFilters, List<String> andClausesDenominator, List<String> orClausesNoDataDenominator ){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		if(andClausesDenominator == null)
			andClausesDenominator = new ArrayList<>();
		
		if(orClausesNoDataDenominator == null)
			orClausesNoDataDenominator = new ArrayList<>();
		
		for(DonationFilterData filter : commonsFilters){
		
			if(filter.getCode().equals(Constants.AGE_FROM) && (filter.getValueString()!= null) && (!filter.getValueString().equals(""))){
				
				Calendar dateFrom = Calendar.getInstance();
				dateFrom.add(Calendar.YEAR, (Integer.parseInt(filter.getValueString()))*(-1));
				
				String dateFromString = sdf.format(dateFrom.getTime());
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				String query = donationFilter.getDonationFilterCodesPath() + "<='" + dateFromString +"'";
				andClausesDenominator.add(query);
				
				String dateNodata = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
						+ "not("+"$doc/" + donationFilter.getDonationFilterCodesPath() +")" ;
				orClausesNoDataDenominator.add(dateNodata);
				
			}
			
			if(filter.getCode().equals(Constants.AGE_TO) && (filter.getValueString()!= null) && !(filter.getValueString().equals(""))){
				
				Calendar dateFrom = Calendar.getInstance();
				dateFrom.add(Calendar.YEAR, (Integer.parseInt(filter.getValueString())+1)*(-1));
				
				String dateFromString = sdf.format(dateFrom.getTime());
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				String query = donationFilter.getDonationFilterCodesPath() + ">='" + dateFromString +"'";
				andClausesDenominator.add(query);
				
				String dateNodata ="$doc/" + donationFilter.getDonationFilterCodesPath()+"='' or "
						+ "not("+ "$doc/" +donationFilter.getDonationFilterCodesPath() +")" ;
				orClausesNoDataDenominator.add(dateNodata);
				
			}
			
			if(filter.getValue() != null && filter.getValue().getCode() != null){
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				String query ="";
				if(donationFilter != null){
					
					query = donationFilter.getDonationFilterCodesPath() + "='" + filter.getValue().getCode() +"'";
					
					String dateNodata = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
							+ "not("+ "$doc/" +donationFilter.getDonationFilterCodesPath() +")" ;
					
					
					andClausesDenominator.add(query);
					orClausesNoDataDenominator.add(dateNodata);
					
				}
			}	
		}	
	}
	
	public void getQueriesTransfusion(List<TransfusionFilterData> transfusionFilters, List<String> andClausesDenominator, List<String> orClausesNoDataDenominator ){
		
		List<String> filtersDenominator = new ArrayList<>();
		String edverseEventCodeDenominator = "";
		
		for(TransfusionFilterData filter : transfusionFilters){
			
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
		
	}
	
	public void getQueriesDonations(List<DonationFilterData> donationFilters, List<String> andClausesDenominator, 
			List<String> orClausesNoDataDenominator,List<String> filtersAnalysisDenominator, List<String> filtersAnalysisDenominatorNoData ){

		String analisisCodeDenominator = "";
		
		for(DonationFilterData filter : donationFilters){
			
			if(filter.getValue() != null && filter.getValue().getCode() != null){
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				if(donationFilter != null){
					
					String query = donationFilter.getDonationFilterCodesPath() + "='" + filter.getValue().getCode() +"'";
					
					String dateNodata = "$doc/" +donationFilter.getDonationFilterCodesPath()+"='' or "
							+ "not("+ "$doc/" +donationFilter.getDonationFilterCodesPath() +")" ;
					
					if(filter.getCode().equals(Constants.ANALYSIS) || filter.getCode().equals(Constants.RESULTS)){
						/**
						 * Analisis
						 */
						if(donationFilter.getDonationFilterCodesValue().equals(Constants.RESULTS)){
							
							if(analisisCodeDenominator.equals("")){
								
								query = query.replace("/"+Constants.VAR_EVENT_FILTER.toString()+"/", "");
								dateNodata = dateNodata.replace("/"+Constants.VAR_EVENT_FILTER.toString()+"/", "");
							
							}else{
								
								String filterEvent = Constants.ANALYSIS_FILTER + "'" + analisisCodeDenominator + "']";
								query = query.replace(Constants.VAR_EVENT_FILTER.toString(), filterEvent);
								dateNodata = dateNodata.replace(Constants.VAR_EVENT_FILTER.toString(), filterEvent);
								
							}
							
							
						}else if(donationFilter.getDonationFilterCodesValue().equals(Constants.ANALYSIS)){
							
							analisisCodeDenominator = filter.getValue().getCode();
							
							// Si es evento adverso solo ve que sea vacio si no esta es porque no tuvo esvento adverso.
							dateNodata = donationFilter.getDonationFilterCodesPath()+"=''";
							
						}	
						
						filtersAnalysisDenominator.add(query);
						filtersAnalysisDenominatorNoData.add(dateNodata);
						
					}else{
					
						andClausesDenominator.add(query);
						orClausesNoDataDenominator.add(dateNodata);
					}	
				}
			}
		}
	}

	public Pair<Integer,Integer> getCantPerson(List<String> andClausesDonations, List<List<String>> orClausesDonations, List<String> analysis,
		List<String> andClausesTransfusions, List<List<String>> orClausesTransfusions){

		Integer cantDonors = 0,  cantTransfussed = 0;
		try {

			for(Person p : FactoryDAO.getPeronDAO(em).getPersonsFilters(new HashMap<String,Object>())){
				
				List<String> orClausesCDAsIds = new ArrayList<>();
				for(PersonsRecord personRecord :FactoryDAO.getPersonRecordDAO(em).getCDAsUserId(p.getId())){
		
					String query = "$doc/ClinicalDocument/id/@root='"+ personRecord.getPersonsRecordCdaRoot() + "' and " +
					"$doc/ClinicalDocument/id/@extension='" + personRecord.getPersonsRecordCdaExtension() +"'";
					orClausesCDAsIds.add(query);
					
				}
				if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClausesDonations,orClausesDonations,orClausesCDAsIds,analysis) > 0){
					
					cantDonors++;
					
				}
				if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClausesTransfusions,orClausesTransfusions,orClausesCDAsIds,null) > 0){
					
					cantTransfussed++;
					
				}
			}
		}catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al calcular la cantidad de personas", e);
			
		}
		Pair<Integer, Integer> p = new Pair<Integer, Integer>(cantDonors,cantTransfussed);
		return p;
	}
}
