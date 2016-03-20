package org.hemologica.salud.web.rest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Response;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataDonationsStatisticsResults;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.datatypes.DataSearchFilter;
import org.hemologica.datatypes.DataStock;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataTransfusionsStatistics;
import org.hemologica.datatypes.DataTransfusionsStatisticsResults;
import org.hemologica.datatypes.DataUnitInfo;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.DataDonationsStatistics;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataMovement;
import org.hemologica.datatypes.DataOmsStatistics;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.DataMessageOption;
import org.hemologica.datatypes.TransfusionFilterData;
import org.hemologica.salud.ejb.utils.FactoryBeans;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.xml.sax.SAXException;


public class RestServicesImpl implements IRestServices{

	private Logger logger = Logger.getLogger(RestServicesImpl.class.getName());

	@Override
	public List<DataDonation> getDonations(Long user) {
		
		try {
			
			return FactoryBeans.getDonationBean().getDonationsUserId(user);
			
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas XMLDataBaseException", e);
			
		} catch (SAXException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas SAXException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas IOException", e);
			
		} catch (ParserConfigurationException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas ParserConfigurationException", e);
			
		} catch (XPathExpressionException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas XPathExpressionException", e);
			
		}
		
		return new ArrayList<DataDonation>();
		
	}

	@Override
	public List<DataTransfusion> getTransfusions(Long user) {
		
		try {
			
			return FactoryBeans.getTransfusionBean().getTransfusionsUserId(user);
		
		}catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas XMLDataBaseException", e);
			
		} catch (SAXException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas SAXException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas IOException", e);
			
		} catch (ParserConfigurationException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas ParserConfigurationException", e);
			
		} catch (XPathExpressionException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas XPathExpressionException", e);
			
		} 
		
		return new ArrayList<DataTransfusion>();
		
	}

	@Override
	public DataPerson getPerson(String user) {
		return FactoryBeans.getPersonBean().getPersonId(FactoryBeans.getUserBeanLocal().getPersonIdFromUsername(user));

	}

	@Override
	public List<DataBank> getBanks() {
		
		return FactoryBeans.getCenterBean().getBanks();
		
	}

	@Override
	public List<DataCode> getCities() {

		return FactoryBeans.getCodeBeans().getCities();
	}

	@Override
	public List<DataCode> getCities(String stateCode) {

		if (stateCode == null) {
			return this.getCities();
		}

		return  FactoryBeans.getCodeBeans().getCitiesByState(stateCode);
	}

	@Override
	public List<DataMessageOption> getMessageOptions() {

		return FactoryBeans.getCodeBeans().getMessageOptions();
		
	}

	@Override
	public List<DataCode> getBloodTypes() {
		
		return FactoryBeans.getCodeBeans().getBloodTypes();

	}

	@Override
	public DataResponse sendMessage(MailData mailData) {
		
		return FactoryBeans.getAdvertismentBean().sendMessage(mailData); 
		
	}

	@Override
	public DataResponse sendCampaign(DataCampaign dataCampaign) {
		
		return FactoryBeans.getAdvertismentBean().sendCampaign(dataCampaign);

	}

	@Override
	public List<DataCampaign> getCampaigns(String cant) {
		
		return FactoryBeans.getAdvertismentBean().getCampaigns(cant);

	}

	@Override
	public DataCampaign getCampaign(String campaignId) {
		
		return FactoryBeans.getAdvertismentBean().getCampaign(campaignId);
		
	}

	@Override
	public List<DonationFilterData> getDonationsFilters() {
		
		return FactoryBeans.getCodeBeans().getDonationsFilters();
		
	}

	@Override
	public List<TransfusionFilterData> getTransfusionsFilters() {

		return FactoryBeans.getCodeBeans().getTransfusionsFilters();
	}

	@Override
	public List<DataBank> getBanksUser(Long user) {

		if(user == null)
			return null;
		return FactoryBeans.getCenterBean().getBanksUser(user);
	}

	@Override
	public List<DataInstitution> getInstitutionsUser(Long user) {
		
		if(user == null)
			return null;
		
		return FactoryBeans.getInstitutionBean().getInstitutionsUser(user);
		
	}

	@Override
	public List<DataPerson> getPersons() {
		
		return FactoryBeans.getPersonBean().getPersonsFilters(new HashMap<String,Object>());

	}

	@Override
	public List<DataProductType> getProducts() {

		return FactoryBeans.getCodeBeans().getProducts();

	}

	public DataStock getBankStock(String code) {

		return FactoryBeans.getStockBeanLocal().getStockAndBanks(code, null, null, null, null);

	}

	@Override
	public List<DataResponsiblePerson> getResponsibleTransfusionPersons(String centerCode) {
		
		if(centerCode == null)
			return null;
		
		return FactoryBeans.getCenterBean().getResponsibleTransfusionPersons(centerCode);
		
	}

	@Override
	public List<DataCode> getTransfusionsAnalysis() {

		return FactoryBeans.getCodeBeans().getTransfusionsAnalysis();
	}

	@Override
	public List<DataCode> getTransfusionsEvents() {

		return FactoryBeans.getCodeBeans().getTransfusionsEvents();
	}

	@Override
	public List<DataCode> getSeverities() {

		return FactoryBeans.getCodeBeans().getSeverities();
	}

	@Override
	public List<DataCode> getDonationsAnalysis() {
		
		return FactoryBeans.getCodeBeans().getDonationsAnalysis();
		
	}

	@Override
	public List<DataCode> getDonationsEvents() {
		
		return FactoryBeans.getCodeBeans().getDonationsEvents();
	}

	@Override
	public List<DataCode> getDonationABOTypes() {
		
		return FactoryBeans.getBloodLocal().getDonationABOTypes();
	}

	@Override
	public List<DataCode> getDonationDTTypes() {
		
		return FactoryBeans.getBloodLocal().getDonationDTTypes();
		
	}

	@Override
	public List<DataCode> getRejectionReasons() {
		
		return FactoryBeans.getCodeBeans().getRejectionReasons();
	}

	@Override
	public List<DataCode> getRejectionTypes() {
	
		return FactoryBeans.getCodeBeans().getRejectionTypes();
		
	}
	
	public DataStock getBanks(String bankCode, String institution, String productTypeCode, String bloodTypeCodeABO,  String bloodTypeCodeRH) {
		
		return FactoryBeans.getStockBeanLocal().getStockAndBanks(bankCode, institution, productTypeCode, bloodTypeCodeABO, bloodTypeCodeRH);

	}

	@Override
	public List<DataCode> getDocumentsTypes() {
		
		return FactoryBeans.getCodeBeans().getDocumentsTypes();
		
	}

	@Override
	public List<DataCode> getCountries() {
		
		return FactoryBeans.getCodeBeans().getCountries();
		
	}

	@Override
	public List<DataCode> getStatesCodes() {
		
		return FactoryBeans.getCodeBeans().getStates();
	}

	@Override
	public List<DataCode> getCitiesCodes() {
		
		return FactoryBeans.getCodeBeans().getCities();
		
	}

	@Override
	public List<DataInstitution> getInstitutions() {
		
		return FactoryBeans.getInstitutionBean().getInstitutions();
		
	}

	@Override
	public DataUnitInfo getUnitInfo(String code, String institutionCode) {
		
		DataUnitInfo dataUnitInfo = new DataUnitInfo();
		
		DataTransfusion dataTransfusion = new DataTransfusion();
		try {
			
			dataTransfusion = FactoryBeans.getTransfusionBean().getDataTransfusionSpecimenId(code, institutionCode);
			
		} catch (SAXException e) {
			
			logger.log(Level.SEVERE, "Error al obtener la transfusion SAXException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al obtener la transfusion IOException", e);
			
		} catch (ParserConfigurationException e) {
			
			logger.log(Level.SEVERE, "Error al obtener la transfusion ParserConfigurationException", e);
			
		} catch (XPathExpressionException e) {
			
			logger.log(Level.SEVERE, "Error al obtener la transfusion XPathExpressionException", e);
			
		} 
		
		dataUnitInfo.setTransfusion(dataTransfusion);
		
		DataDonation dataDonation = new DataDonation();
		try {
			
			dataDonation = FactoryBeans.getDonationBean().getDataDonationSpecimenId(code, institutionCode);
		
		}catch (SAXException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas SAXException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas IOException", e);
			
		} catch (ParserConfigurationException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas ParserConfigurationException", e);
			
		} catch (XPathExpressionException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas XPathExpressionException", e);
			
		}
		
		dataUnitInfo.setDonation(dataDonation);
		
		
		List<DataMovement> movements = FactoryBeans.getStockBeanLocal().getMovementsUnitId(code);
		dataUnitInfo.setMovements(movements);
		
		return dataUnitInfo;
	}
	
	@Override
	public List<DataCode> getDonationState() {
		
		return FactoryBeans.getCodeBeans().getDonationsStates();
		
	}

	@Override
	public DataDonationsStatisticsResults getDonationsStatistics(DataDonationsStatistics donationsStatisticsData) {
		
		try {
			
			return FactoryBeans.getStatisticsBeanLocal().getDonationsStatistics(donationsStatisticsData);
			
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la consulta", e);
		}
		
		return new DataDonationsStatisticsResults();
		
	}

	@Override
	public DataTransfusionsStatisticsResults getTransfusionsStatistics(
			DataTransfusionsStatistics donationsStatisticsData) {
		
		try {
			
			return FactoryBeans.getStatisticsBeanLocal().getTransfusionsStatistics(donationsStatisticsData);
			
		} catch (XMLDataBaseException e) {
			
			logger.log(Level.SEVERE, "Error al realizar la consulta", e);
		}
		
		return new DataTransfusionsStatisticsResults();
	}

	@Override
	public List<DataCode> getDonationTypes() {
		
		return FactoryBeans.getCodeBeans().getDonationTypes();
	}

	@Override
	public List<DataCode> getDonorTypes() {
		
		return FactoryBeans.getCodeBeans().getDonorTypes();
		
	}

	@Override
	public DataResponse addDonation(DataDonation dataDonacion) {
		
		return FactoryBeans.getDonationBean().addDonation(dataDonacion);
	}

	@Override
	public DataResponse addTransfusion(DataTransfusion dataTransfusion) {
		
		return FactoryBeans.getTransfusionBean().addTransfusion(dataTransfusion);
		
	}

	@Override
	public List<DataCode> getGenderCodes() {
		
		return FactoryBeans.getCodeBeans().getGenderCodes();
		
	}

	@Override
	public List<DataCode> getResultsCodes() {
		
		return FactoryBeans.getCodeBeans().getResultsCodes();
		
	}

	@Override
	public List<DataBank> getArrangementBanks(String code) {
		
		return getBanks();
		
	}

	@Override
	public List<DataInstitution> getArrangementInstitutions(String code) {
		
		return getInstitutions();
	}

	@Override
	public Response getOmsStatistics(DataOmsStatistics statictic) {
	
		ByteArrayOutputStream o = FactoryBeans.getStatisticsBeanLocal().getOmsStatistics(statictic); 
        
		if(o!= null)
			return Response.status(200).entity(o.toByteArray()).build(); 
		else
			return Response.status(0).build();
		
	}

	@Override
	public List<DataPerson> getPersonsFilters(String filterName, String filterDocumentNumber) {
		
		
		return FactoryBeans.getPersonBean().getPersonsFilters(filterName, filterDocumentNumber);
	}

	@Override
	public List<DataSearchFilter> getSearchFilters() {
		
		return FactoryBeans.getCodeBeans().getSearchFilters();
		
	}

	@Override
	public List<DataDonation> getDonations(List<DataSearchFilter> resultDonations) {
		
		try {
			
			return FactoryBeans.getDonationBean().getDonationsFilters(resultDonations);
			
		}catch (SAXException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas SAXException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas IOException", e);
			
		} catch (ParserConfigurationException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas ParserConfigurationException", e);
			
		} catch (XPathExpressionException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas XPathExpressionException", e);
			
		}
		
		return new ArrayList<DataDonation>();
	}

	@Override
	public List<DataTransfusion> getTransfusions(List<DataSearchFilter> filters) {
		
		try {
			
			return FactoryBeans.getTransfusionBean().getTransfusionsFilters(filters);
			
		}catch (SAXException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas SAXException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas IOException", e);
			
		} catch (ParserConfigurationException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas ParserConfigurationException", e);
			
		} catch (XPathExpressionException e) {
			
			logger.log(Level.SEVERE, "Error al obtener los cdas XPathExpressionException", e);
			
		}
		
		return new ArrayList<DataTransfusion>();
	}

	
}
