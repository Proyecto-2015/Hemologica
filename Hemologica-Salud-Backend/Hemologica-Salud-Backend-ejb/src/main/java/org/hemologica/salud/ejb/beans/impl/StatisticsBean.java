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
		
		List<String> andClauses = new ArrayList<>();
		
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
			
			String query = "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root='" + donationsStatisticsData.getBloodBank() +"'";
			andClauses.add(query);
			
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
				andClauses.add(query);
							
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
				andClauses.add(query);
							
			} catch (ParseException e) {
				
				logger.log(Level.SEVERE, "Error al parsear la fecha", e);
				
			}
		}
		
		/**
		 * Cantidad de donaciones
		 */
		int countDonations = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClauses,orClausesList,null);
		
		/**
		 * Filtros
		 */
		for(DonationFilterData filter :donationsStatisticsData.getFilters()){
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			
			if(filter.getCode().equals(Constants.AGE_FROM) && (filter.getValueString()!= null) && (!filter.getValueString().equals(""))){
				
				Calendar dateFrom = Calendar.getInstance();
				dateFrom.add(Calendar.YEAR, (Integer.parseInt(filter.getValueString()))*(-1));
				
				String dateFromString = sdf.format(dateFrom.getTime());
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				String query = donationFilter.getDonationFilterCodesPath() + "<='" + dateFromString +"'";
				andClauses.add(query);
				
			}
			
			if(filter.getCode().equals(Constants.AGE_TO) && (filter.getValueString()!= null) && !(filter.getValueString().equals(""))){
				
				Calendar dateFrom = Calendar.getInstance();
				dateFrom.add(Calendar.YEAR, (Integer.parseInt(filter.getValueString())+1)*(-1));
				
				String dateFromString = sdf.format(dateFrom.getTime());
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				String query = donationFilter.getDonationFilterCodesPath() + ">='" + dateFromString +"'";
				andClauses.add(query);
				
			}
			
			
			if(filter.getValue() != null && filter.getValue().getCode() != null){
				
				DonationFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getDonationsFilterById(filter.getCode());
				
				if(donationFilter != null){
					
					String query = donationFilter.getDonationFilterCodesPath() + "='" + filter.getValue().getCode() +"'";
					andClauses.add(query);
					
				}
			}	
		}
		
		/**
		 * Cantidad de donaciones
		 */
//		orClausesList.add(orClauses);
		int count = XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClauses,orClausesList,null);

		DataStatistic donationsCount = new DataStatistic();
		donationsCount.setCount(count);
		donationsCount.setPercentage((countDonations != 0) ? count *100/countDonations : 0);
		
		dataDonationsStatistics.setDonationsCount(donationsCount);
		
		/**
		 * Cantidad de donantes
		 */
		int cant = 0;
		int cantPersons = 0;
		
		for(Person p : FactoryDAO.getPeronDAO(em).getPersonsFilters(new HashMap<String,Object>())){
			
			cantPersons++;
			
			List<String> orClausesCDAsIds = new ArrayList<>();
			for(PersonsRecord personRecord :FactoryDAO.getPersonRecordDAO(em).getCDAsUserId(p.getId())){
	
				String query = "$doc//ClinicalDocument//id/@root='"+ personRecord.getPersonsRecordCdaRoot() + "' and " +
				"$doc//ClinicalDocument//id/@extension='" + personRecord.getPersonsRecordCdaExtension() +"'";
				orClausesCDAsIds.add(query);
				
			}
			
			if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseDonations().countQuery(andClauses,orClausesList,orClausesCDAsIds) > 0){
				
				cant++;
				
			}	
		}
		
		DataStatistic donorsCount = new DataStatistic();
		donorsCount.setCount(cant);
		donorsCount.setPercentage((cantPersons != 0) ? cant *100/cantPersons : 0);
		dataDonationsStatistics.setDonorsCount(donorsCount);
		
		return dataDonationsStatistics;
	}

	@Override
	public DataTransfusionsStatisticsResults getTransfusionsStatistics(
			DataTransfusionsStatistics transfusionStatisticsData) throws XMLDataBaseException {
		
		DataTransfusionsStatisticsResults dataDonationsStatistics = new DataTransfusionsStatisticsResults();
		
		List<String> andClauses = new ArrayList<>();
		
		List<List<String>> orClausesList = new ArrayList<>();
		List<String> orClauses = new ArrayList<>();
		
		/**
		 * Bancos
		 */
		if(transfusionStatisticsData.getBloodBank() == null && transfusionStatisticsData.getInstitution() != null ){
			
			List<Center> banks = FactoryDAO.getCenterDAO(em).getBanksByInstitutionId(transfusionStatisticsData.getInstitution().getCode());
			for(Center c : banks){
				
				String query = "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root='" + c.getCenterCode() +"'";
				orClauses.add(query);
			
			}
		}else if(transfusionStatisticsData.getBloodBank() != null){
			
			String query = "//ClinicalDocument//author//assignedAuthor//representedOrganization//id//@root='" + transfusionStatisticsData.getBloodBank() +"'";
			andClauses.add(query);
			
		}
		
		orClausesList.add(orClauses);
		
		/**
		 * Fecha desde
		 */
		if(transfusionStatisticsData.getFromDate()!= null && !transfusionStatisticsData.getFromDate().equals("")){
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dateFrom;
			try {
				dateFrom = sdf.parse(transfusionStatisticsData.getFromDate());
				SimpleDateFormat sdfCDA = new SimpleDateFormat("yyyyMMddHHmmss");
				
				String dateString = sdfCDA.format(dateFrom);
				
				String query = "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/effectiveTime/low/@value" + ">='" + dateString +"'";
				andClauses.add(query);
							
			} catch (ParseException e) {
				
				logger.log(Level.SEVERE, "Error al parsear la fecha", e);
				
			}
		}
		
		/**
		 * Fecha Hasta
		 */
		if(transfusionStatisticsData.getToDate()!= null && !transfusionStatisticsData.getToDate().equals("")){
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dateFrom;
			try {
				dateFrom = sdf.parse(transfusionStatisticsData.getToDate());
				SimpleDateFormat sdfCDA = new SimpleDateFormat("yyyyMMddHHmmss");
				
				String dateString = sdfCDA.format(dateFrom);
				
				String query = "/ClinicalDocument/component/structuredBody/component/section/entry/procedure/effectiveTime/low/@value" + "<='" + dateString +"'";
				andClauses.add(query);
							
			} catch (ParseException e) {
				
				logger.log(Level.SEVERE, "Error al parsear la fecha", e);
				
			}
		}
		
		/**
		 * Cantidad de transfusiones
		 */
		int countTransfusions = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClauses,orClausesList,null);
		
		/**
		 * Cantidad de eventos adversos
		 */
		int countAdverseEvents = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countEvents(andClauses,orClausesList,null);
		
		/**
		 * Filtros
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
				andClauses.add(query);
				
			}
			
			if(filter.getCode().equals(Constants.AGE_TO) && (filter.getValueString()!= null) && !(filter.getValueString().equals(""))){
				
				Calendar dateFrom = Calendar.getInstance();
				dateFrom.add(Calendar.YEAR, (Integer.parseInt(filter.getValueString())+1)*(-1));
				
				String dateFromString = sdf.format(dateFrom.getTime());
				
				TransfusionFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(filter.getCode());
				
				String query = donationFilter.getTransfusionFilterCodesPath() + ">='" + dateFromString +"'";
				andClauses.add(query);
				
			}
			
			if(filter.getValue() != null && filter.getValue().getCode() != null){
				
				TransfusionFilterCode donationFilter = FactoryDAO.getCodesDAO(em).getTransfusionFilterById(filter.getCode());
				String query ="";
				if(donationFilter != null){
					
					
					query = donationFilter.getTransfusionFilterCodesPath() + "='" + filter.getValue().getCode() +"'";
					
					if(donationFilter.getTransfusionFilterCodesValue().equals(Constants.SEVERITY_EVENT)){
						
						if(edverseEventCode.equals(""))
							query = query.replace("/"+Constants.VAR_EVENT_FILTER.toString()+"/", "");
						else{
							String filterEvent = Constants.EVENT_FILTER + "'" + edverseEventCode + "']";
							query = query.replace(Constants.VAR_EVENT_FILTER.toString(), filterEvent);
						}
						adversEventsFilters.add(query);
						
					}
					
					andClauses.add(query);
					
					if(donationFilter.getTransfusionFilterCodesValue().equals(Constants.ADVERSE_EVENT)){
						edverseEventCode = filter.getValue().getCode();
						adversEventsFilters.add(query);
					}
					
				}
				
				
				
			}	
		}
		
		/**
		 * Cantidad de transfusiones
		 */
//		orClausesList.add(orClauses);
		int count = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClauses,orClausesList,null);

		DataStatistic donationsCount = new DataStatistic();
		donationsCount.setCount(count);
		donationsCount.setPercentage((countTransfusions != 0) ? count *100/countTransfusions : 0);
		
		dataDonationsStatistics.setTransfusionsCount(donationsCount);
		
		/**
		 * Cantidad de personas transfundidas
		 */
		int cant = 0;
		int cantPersons = 0;
		
		for(Person p : FactoryDAO.getPeronDAO(em).getPersonsFilters(new HashMap<String,Object>())){
			
			cantPersons++;
			
			List<String> orClausesCDAsIds = new ArrayList<>();
			for(PersonsRecord personRecord :FactoryDAO.getPersonRecordDAO(em).getCDAsUserId(p.getId())){
	
				String query = "$doc//ClinicalDocument//id/@root='"+ personRecord.getPersonsRecordCdaRoot() + "' and " +
				"$doc//ClinicalDocument//id/@extension='" + personRecord.getPersonsRecordCdaExtension() +"'";
				orClausesCDAsIds.add(query);
				
			}
			
			if(orClausesCDAsIds.size() != 0 && XMLDataBaseFactory.getIXMLDataBaseTransfusions().countQuery(andClauses,orClausesList,orClausesCDAsIds) > 0){
				
				cant++;
				
			}	
		}
		
		DataStatistic donorsCount = new DataStatistic();
		donorsCount.setCount(cant);
		donorsCount.setPercentage((cantPersons != 0) ? cant *100/cantPersons : 0);
		dataDonationsStatistics.setPersonTransfusionsCount(donorsCount);
		
		/**
		 * Cantidad de eventos adversos
		 */
		int countAdverseEventsAllFilters = XMLDataBaseFactory.getIXMLDataBaseTransfusions().countEvents(andClauses,orClausesList,adversEventsFilters);
		
		DataStatistic eventsCount = new DataStatistic();
		eventsCount.setCount(countAdverseEventsAllFilters);
		eventsCount.setPercentage((countAdverseEvents != 0) ? countAdverseEventsAllFilters *100/countAdverseEvents : 0);
		dataDonationsStatistics.setAdversEventsCount(eventsCount);
			
		return dataDonationsStatistics;
	}

}
