package org.hemologica.salud.web.rest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.hemologica.dao.enums.DataDonationStateEnum;
import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataDonationDonorType;
import org.hemologica.datatypes.DataDonationsStatisticsResults;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.datatypes.DataStock;
import org.hemologica.datatypes.DataStockProductType;
import org.hemologica.datatypes.DataStockProductTypeBloodType;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataTransfusionsStatistics;
import org.hemologica.datatypes.DataTransfusionsStatisticsResults;
import org.hemologica.datatypes.DataUnit;
import org.hemologica.datatypes.DataUnitInfo;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.DataDonationsStatistics;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataMovement;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.DataMessageOption;
import org.hemologica.datatypes.TransfusionFilterData;
import org.hemologica.salud.ejb.utils.FactoryBeans;
import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;
import org.xml.sax.SAXException;


public class RestServicesImpl implements IRestServices{

	private Logger logger = Logger.getLogger(RestServicesImpl.class.getName());

	@Override
	public List<DataDonation> getDonations(String user) {
		
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
	public List<DataTransfusion> getTransfusions(String user) {
		
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
	public DataPerson getPerson(String id) {
				
		return FactoryBeans.getPersonBean().getPersonId(id);

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
	public List<DataBank> getBanksUser(String user) {

		if(user == null)
			return null;
		return FactoryBeans.getCenterBean().getBanksUser(user);
	}

	@Override
	public List<DataInstitution> getInstitutionsUser(String user) {
		
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

		DataStock ret = new DataStock();

		List<DataStockProductTypeBloodType> bloodTypes = new ArrayList<>();

		DataStockProductTypeBloodType o5 = new DataStockProductTypeBloodType();
		o5.setCode("1");
		o5.setDisplayName("A+");
		o5.setCount(10);
		bloodTypes.add(o5);

		DataStockProductTypeBloodType o8 = new DataStockProductTypeBloodType();
		o8.setCode("2");
		o8.setDisplayName("A-");
		o8.setCount(10);
		bloodTypes.add(o8);

		DataStockProductTypeBloodType o6 = new DataStockProductTypeBloodType();
		o6.setCode("3");
		o6.setDisplayName("B+");
		o6.setCount(10);
		bloodTypes.add(o6);

		DataStockProductTypeBloodType o7 = new DataStockProductTypeBloodType();
		o7.setCode("4");
		o7.setDisplayName("B-");
		o7.setCount(10);
		bloodTypes.add(o7);

		DataStockProductTypeBloodType o1 = new DataStockProductTypeBloodType();
		o1.setCode("0");
		o1.setDisplayName("AB+");
		o1.setCount(10);
		bloodTypes.add(o1);

		DataStockProductTypeBloodType o2 = new DataStockProductTypeBloodType();
		o2.setCode("5");
		o2.setDisplayName("AB-");
		o2.setCount(10);
		bloodTypes.add(o2);

		DataStockProductTypeBloodType o3 = new DataStockProductTypeBloodType();
		o3.setCode("6");
		o3.setDisplayName("0+");
		o3.setCount(10);
		bloodTypes.add(o3);

		DataStockProductTypeBloodType o4 = new DataStockProductTypeBloodType();
		o4.setCode("7");
		o4.setDisplayName("0-");
		o4.setCount(10);
		bloodTypes.add(o4);

		List<DataStockProductType> products = new ArrayList<>();

		DataStockProductType p1 = new DataStockProductType();
		p1.setBloodTypes(bloodTypes);
		p1.setCode("0");
		p1.setDisplay("Plasma");
		products.add(p1);

		p1 = new DataStockProductType();
		p1.setBloodTypes(bloodTypes);
		p1.setCode("2");
		p1.setDisplay("Plaquetas");
		products.add(p1);

		p1 = new DataStockProductType();
		p1.setBloodTypes(bloodTypes);
		p1.setCode("3");
		p1.setDisplay("Glóbulos Rojos");
		products.add(p1);

		ret.setProducts(products);

		List<DataBank> banks = this.getBanks();
		for (DataBank b : banks) {
			if (b.getCode().equals(code)) {
				ret.setBank(b);
				return ret;
			}
		}

		return null;
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

	public List<DataStockProductType> getBankNationalStock() {

		List<DataStockProductTypeBloodType> bloodTypes = new ArrayList<>();

		DataStockProductTypeBloodType o5 = new DataStockProductTypeBloodType();
		o5.setCode("1");
		o5.setDisplayName("A+");
		o5.setCount(1000);
		bloodTypes.add(o5);

		DataStockProductTypeBloodType o8 = new DataStockProductTypeBloodType();
		o8.setCode("2");
		o8.setDisplayName("A-");
		o8.setCount(1000);
		bloodTypes.add(o8);

		DataStockProductTypeBloodType o6 = new DataStockProductTypeBloodType();
		o6.setCode("3");
		o6.setDisplayName("B+");
		o6.setCount(1000);
		bloodTypes.add(o6);

		DataStockProductTypeBloodType o7 = new DataStockProductTypeBloodType();
		o7.setCode("4");
		o7.setDisplayName("B-");
		o7.setCount(1000);
		bloodTypes.add(o7);

		DataStockProductTypeBloodType o1 = new DataStockProductTypeBloodType();
		o1.setCode("0");
		o1.setDisplayName("AB+");
		o1.setCount(1000);
		bloodTypes.add(o1);

		DataStockProductTypeBloodType o2 = new DataStockProductTypeBloodType();
		o2.setCode("5");
		o2.setDisplayName("AB-");
		o2.setCount(1000);
		bloodTypes.add(o2);

		DataStockProductTypeBloodType o3 = new DataStockProductTypeBloodType();
		o3.setCode("6");
		o3.setDisplayName("0+");
		o3.setCount(1000);
		bloodTypes.add(o3);

		DataStockProductTypeBloodType o4 = new DataStockProductTypeBloodType();
		o4.setCode("7");
		o4.setDisplayName("0-");
		o4.setCount(1000);
		bloodTypes.add(o4);

		List<DataStockProductType> products = new ArrayList<>();

		DataStockProductType p1 = new DataStockProductType();
		p1.setBloodTypes(bloodTypes);
		p1.setCode("0");
		p1.setDisplay("Plasma");
		products.add(p1);

		p1 = new DataStockProductType();
		p1.setBloodTypes(bloodTypes);
		p1.setCode("2");
		p1.setDisplay("Plaquetas");
		products.add(p1);

		p1 = new DataStockProductType();
		p1.setBloodTypes(bloodTypes);
		p1.setCode("3");
		p1.setDisplay("Glóbulos Rojos");
		products.add(p1);

		return products;

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
	
	public List<DataBank> getBanks(String bankCode, String productTypeCode, String bloodTypeCodeABO,  String bloodTypeCodeRH, Integer count) {

		List<DataBank> ret = this.getBanks();
		if (bankCode != null && !bankCode.equals("")) {
			for (DataBank b : ret) {
				if (b.getCode().equals(bankCode)) {
					ret.clear();
					ret.add(b);
					return ret;
				}
			}
		}
		return ret;
	}

	@Override
	public DataUnit getUnit() {

		List<DataInstitution> banks = new ArrayList<DataInstitution>();
		DataInstitution db1 = new DataInstitution();
		db1.setCode("1");
		db1.setName("Institucion 1");
		db1.setAddress("Av Italia 345");
		db1.setEmail("infobanco1@hc.com");
		db1.setHour("Lunes a viernes de 8 - 18 hs ");
		db1.setInformation("Se dan 40 numeros a partir de las 8 am.");
		db1.setTelephone("12345678");
		db1.setLatitude(-34.898930);
		db1.setLongitude(-56.165753);

		
		banks.add(db1);

		DataInstitution db2 = new DataInstitution();
		db2.setCode("2");
		db1.setName("Institucion 2");
		db2.setAddress("Rivera 567");
		db2.setEmail("infobanco2@hc.com");
		db2.setHour("Lunes a viernes de 8 - 20 hs y Sabados 8 - 12 ");
		db2.setInformation("Pedir hora por telefono");
		db2.setTelephone("098765432");
		db2.setLatitude(-34.871729);
		db2.setLongitude(-56.188868);

		List<DataProductType> productTypes = this.getProducts();
		List<DataCode> bloodTypes = this.getBloodTypes();
		
		DataUnit d = null;
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		for (DataCode bt : bloodTypes) {
			for (DataProductType pt : productTypes) {
				for (int i = 0; i < 1; ++i) {
					d = new DataUnit();
					d.setActive(true);
					d.setCode("" + i);
					d.setDonationId(new Long(i));
					d.setId(new Long(i));
					d.setDueDate(sdf.format(new Date()));
					d.setInstitution(db1.getCode());
					d.setInstitutionCode("123456789-"+i);
					d.setProductType(pt);
					d.setBloodType(bt);
//					ret.add(d);
				}
			}
		}

		return d;
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
	public DataUnitInfo getUnitInfo() {
		
		DataUnitInfo dataUnitInfo = new DataUnitInfo();
		
		DataTransfusion dataTransfusion = new DataTransfusion();
		dataTransfusion.setDate("10/10/2015");
		
		DataBank b2 = new DataBank();
		b2.setName("Banco de Sangre 2");
		
		
		dataTransfusion.setBank(b2);
		
		DataProductType dataProduct = new DataProductType();
		dataProduct.setDisplay("Plaquetas");
		dataTransfusion.setDataProduct(dataProduct);
		dataTransfusion.setVolume("20ml");
		dataUnitInfo.setTransfusion(dataTransfusion);
		
//		List<Movement> movements = new ArrayList<>();
//		
//		Movement m1 = new Movement();
//		
//		MovementsType mt1= new MovementsType();
//		
//		m1.setMovementsType(movementsType);
		
		
		DataDonation d = new DataDonation();
		
		DataCode dc24 = new DataCode();
		dc24.setCode(DataDonationStateEnum.MADE.label);
		dc24.setDisplayName(DataDonationStateEnum.MADE.label);
		
		
		d.setState(dc24);
		DataBank b1 = new DataBank();
		b1.setName("Banco de Sangre 1");
		d.setBank(b1);
		DataInstitution di = new DataInstitution();
		di.setName("Hospital de clinicas");
		d.setInstitution(di);
		d.setName("Pedro");

		DataDonationDonorType a = new DataDonationDonorType();
		a.setDisplayName("Voluntario");
		d.setDataDonorType(a);
		d.setDate("10/02/2015");
		
		DataPerson dataPerson = new DataPerson();
		DataBloodType dataBloodType = new DataBloodType();
		dataBloodType.setDisplayName("AB+");
		
		dataPerson.setBloodType(dataBloodType);
		d.setPerson(dataPerson);
		dataUnitInfo.setDonation(d);
		
		List<DataMovement> movements = new ArrayList<>();
		
		DataMovement d1 = new DataMovement();
		d1.setDate("15/03/2015");
		d1.setCenterName("Banco de Sangre 1");
		d1.setMovementsType("Salida");
		
		DataMovement d2 = new DataMovement();
		d2.setDate("15/03/2015");
		d2.setCenterName("Banco de Sangre 2");
		d2.setMovementsType("Entrada");
		
		movements.add(d2);
		movements.add(d1);
		
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

	
}
