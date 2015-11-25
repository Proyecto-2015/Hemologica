package org.hemologica.salud.web.rest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.core.Response;
import org.hemologica.dao.enums.DataDonationStateEnum;
import org.hemologica.dao.enums.DataEventSeverityEnum;
import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataDonationDonorType;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.datatypes.DataStock;
import org.hemologica.datatypes.DataStockProductType;
import org.hemologica.datatypes.DataStockProductTypeBloodType;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataTransfusionEvent;
import org.hemologica.datatypes.DataUnit;
import org.hemologica.datatypes.DataUnitInfo;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataMovement;
import org.hemologica.datatypes.LoginData;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.DataMessageOption;
import org.hemologica.datatypes.TransfusionFilterData;
import org.hemologica.salud.ejb.beans.AdvertismentBeanLocal;
import org.hemologica.salud.ejb.beans.CentersBeanLocal;
import org.hemologica.salud.ejb.beans.CodesBeanLocal;
import org.hemologica.salud.ejb.beans.IBloodLocal;
import org.hemologica.salud.ejb.beans.IInstitutionBeanLocal;
import org.hemologica.salud.ejb.beans.PersonBeanLocal;


public class RestServicesImpl implements IRestServices{

	private Logger logger = Logger.getLogger(RestServicesImpl.class.getName());

	@Inject
	private IInstitutionBeanLocal institutionBean;
	
	@Inject
	private IBloodLocal bloodLocal;
	
	@Inject
	private CodesBeanLocal codeBeans;
	
	@Inject
	private CentersBeanLocal centerBeans;
	
	@Inject
	private PersonBeanLocal personBeans;
	
	@Inject
	private AdvertismentBeanLocal advertismentBean;
	
	@Override
	public Response login(LoginData datos) {

		System.out.println("holaaaa" + datos);
		System.out.println(datos.getUser());
		System.out.println(datos.getPassword());
		return null;
	}

	@Override
	public void getProductInJSON() {
		System.out.println("GET");

	}

	@Override
	public List<DataDonation> getDonations(String user) {

		List<DataDonation> donaciones = new ArrayList<DataDonation>();

		DataDonation d = new DataDonation();

		
		DataCode dc222 = new DataCode();
		dc222.setCode(DataDonationStateEnum.MADE.label);
		dc222.setDisplayName(DataDonationStateEnum.MADE.label);
		
		d.setState(dc222);

		DataBank b1 = new DataBank();
		b1.setName("Banco de Sangre X");

		d.setBank(b1);

		DataInstitution di = new DataInstitution();
		di.setName("Hospital de clinicas");

		d.setInstitution(di);
		d.setName("Pedro");

		DataDonationDonorType a = new DataDonationDonorType();
		a.setDisplayName("Voluntario");
		d.setDataDonorType(a);
		d.setDate("10/02/2015");
		donaciones.add(d);

		DataDonation d3 = new DataDonation();
		
		DataCode dc = new DataCode();
		dc.setCode(DataDonationStateEnum.REJECTED.label);
		dc.setDisplayName(DataDonationStateEnum.REJECTED.label);
		d3.setState(dc);
		// d3.setApproved(true);

		DataBank b13 = new DataBank();
		b13.setName("Banco de Sangre X");

		d3.setBank(b13);

		DataInstitution di3 = new DataInstitution();
		di3.setName("Hospital de clinicas");

		d3.setInstitution(di);

		d3.setName("Pedro");
		DataDonationDonorType a3 = new DataDonationDonorType();
		a3.setDisplayName("Reposicion");

		d3.setDataDonorType(a3);
		d3.setDate("10/02/2015");
		donaciones.add(d3);

		DataDonation d2 = new DataDonation();
		
		DataCode dc2 = new DataCode();
		dc2.setCode(DataDonationStateEnum.MADE.label);
		dc2.setDisplayName(DataDonationStateEnum.MADE.label);
		
		d2.setState(dc2);
		// d2.setApproved(false);
		DataBank b133 = new DataBank();
		b133.setName("Banco de Sangre X");

		d2.setBank(b13);

		DataInstitution di33 = new DataInstitution();
		di33.setName("Hospital de clinicas");

		d2.setInstitution(di33);
		d2.setName("Pedro2");

		DataDonationDonorType a1 = new DataDonationDonorType();
		a1.setDisplayName("Reposicion");

		d2.setDataDonorType(a1);
		d2.setDate("10/02/2014");
		donaciones.add(d2);

		DataDonation d4 = new DataDonation();
		// d4.setApproved(false);
		
		
		DataCode dc22 = new DataCode();
		dc22.setCode(DataDonationStateEnum.REJECTED.label);
		dc22.setDisplayName(DataDonationStateEnum.REJECTED.label);
		
		d4.setState(dc22);
		// d2.setApproved(false);
		DataBank b1333 = new DataBank();
		b1333.setName("Banco de Sangre X");

		d4.setBank(b133);

		DataInstitution di333 = new DataInstitution();
		di333.setName("Hospital de clinicas");

		d4.setInstitution(di333);
		d4.setName("Pedro2");

		DataDonationDonorType a4 = new DataDonationDonorType();

		a4.setDisplayName("Voluntario");

		d4.setDataDonorType(a4);
		d4.setDate("10/02/2014");
		donaciones.add(d4);

		return donaciones;
	}

	@Override
	public List<DataTransfusion> getTransfusions(String user) {
		List<DataTransfusion> transfusions = new ArrayList<DataTransfusion>();

		DataTransfusion t1 = new DataTransfusion();
		DataBank db = new DataBank();
		db.setName("Banco X");

		t1.setBank(db);

		DataInstitution d2 = new DataInstitution();
		d2.setName("Hospital de clinicas");

		t1.setInstitution(d2);

		t1.setName("Pedro");
		t1.setDate("10/02/2015");

		DataProductType dp1 = new DataProductType();
		dp1.setDisplay("Plaquetas");
		t1.setDataProduct(dp1);
		transfusions.add(t1);

		DataTransfusion t2 = new DataTransfusion();
		DataBank db2 = new DataBank();
		db2.setName("Banco X");

		DataTransfusionEvent d1 = new DataTransfusionEvent();

		DataCode dc1 = new DataCode();
		dc1.setCode("0");
		dc1.setDisplayName("Evento adverso 1");
		d1.setEvent(dc1);
		
		
		
		DataCode dc13 = new DataCode();
		
		dc13.setCode(DataEventSeverityEnum.MODERATE.getValue());
		dc13.setDisplayName(DataEventSeverityEnum.MODERATE.getLabel());
		
		d1.setSeverity(dc13);

		DataCode dc2 = new DataCode();
		dc2.setCode("1");

		dc2.setDisplayName("Evento adverso 2");

		DataTransfusionEvent d22 = new DataTransfusionEvent();
		d22.setEvent(dc2);
		DataCode dc133 = new DataCode();
		dc133.setCode(DataEventSeverityEnum.SEVERE.getValue());
		dc133.setDisplayName(DataEventSeverityEnum.SEVERE.getLabel());
		
		d1.setSeverity(dc133);		

		List<DataTransfusionEvent> dteList = new ArrayList<>();
		dteList.add(d1);
		dteList.add(d22);

		t2.setEvents(dteList);

		t1.setBank(db2);

		DataInstitution di = new DataInstitution();
		di.setName("Hospital de clinicas");

		t2.setInstitution(di);
		t2.setName("Pedro");
		t2.setDate("10/02/2015");
		DataProductType dp2 = new DataProductType();
		dp2.setDisplay("Plaquetas");
		t2.setDataProduct(dp2);
		transfusions.add(t2);

		return transfusions;
	}

	@Override
	public DataPerson getPerson(String id) {
				
		return getPersonBean().getPersonId(id);

	}

	@Override
	public List<DataBank> getBanks() {
		
		return getCenterBean().getBanks();
		
	}

	@Override
	public List<DataCode> getCities() {

		return getCodeBeans().getCities();
	}

	@Override
	public List<DataCode> getCities(String stateCode) {

		if (stateCode == null) {
			return this.getCities();
		}

		return  getCodeBeans().getCitiesByState(stateCode);
	}

	@Override
	public List<DataMessageOption> getMessageOptions() {

		return getCodeBeans().getMessageOptions();
		
	}

	@Override
	public List<DataBloodType> getBloodTypes() {
		// Este metodo no deberia usarse mas
		List<DataBloodType> listResult = new ArrayList<>();
		
//		for(DataCode dataCode : getBloodLocal().getDonationABOTypes()){
//			
//			DataBloodType data = new DataBloodType();
//			data.setCode(dataCode.getCode());
//			data.setDisplayName(dataCode.getDisplayName());
//			listResult.add(data);
//			
//		}
		return listResult;
	}

	@Override
	public DataResponse sendMessage(MailData mailData) {
		
		return getAdvertismentBean().sendMessage(mailData); 
		
	}

	@Override
	public DataResponse sendCampaign(DataCampaign dataCampaign) {
		
		return getAdvertismentBean().sendCampaign(dataCampaign);

	}

	@Override
	public List<DataCampaign> getCampaigns(String cant) {
		
		return getAdvertismentBean().getCampaigns(cant);

	}

	@Override
	public DataCampaign getCampaign(String campaignId) {
		
		return getAdvertismentBean().getCampaign(campaignId);
		
	}

	@Override
	public List<DonationFilterData> getDonationsFilters() {
		List<DonationFilterData> filters = new ArrayList<DonationFilterData>();

		DonationFilterData f1 = new DonationFilterData();
		f1.setCode("0");
		f1.setDisplayName("Sexo");

		List<DonationFilterData> f1Options = new ArrayList<DonationFilterData>();

		DonationFilterData f11 = new DonationFilterData();
		f11.setCode("01");
		f11.setDisplayName("Hombre");
		f1Options.add(f11);

		DonationFilterData f12 = new DonationFilterData();
		f12.setCode("02");
		f12.setDisplayName("Mujer");
		f1Options.add(f12);

		f1.setOptions(f1Options);
		filters.add(f1);

		DonationFilterData f2 = new DonationFilterData();
		f2.setCode("1");
		f2.setDisplayName("Tipo Donante");

		List<DonationFilterData> f1Options2 = new ArrayList<DonationFilterData>();

		DonationFilterData f21 = new DonationFilterData();
		f21.setCode("11");
		f21.setDisplayName("Voluntario");
		f1Options2.add(f21);

		DonationFilterData f22 = new DonationFilterData();
		f22.setCode("12");
		f22.setDisplayName("Reposicion");
		f1Options2.add(f22);

		f2.setOptions(f1Options2);
		filters.add(f2);

		return filters;
	}

	@Override
	public List<TransfusionFilterData> getTransfusionsFilters() {

		List<TransfusionFilterData> filters = new ArrayList<TransfusionFilterData>();

		TransfusionFilterData f1 = new TransfusionFilterData();
		f1.setCode("0");
		f1.setDisplayName("Sexo");

		List<TransfusionFilterData> f1Options = new ArrayList<TransfusionFilterData>();

		TransfusionFilterData f11 = new TransfusionFilterData();
		f11.setCode("01");
		f11.setDisplayName("Hombre");
		f1Options.add(f11);

		TransfusionFilterData f12 = new TransfusionFilterData();
		f12.setCode("02");
		f12.setDisplayName("Mujer");
		f1Options.add(f12);

		f1.setOptions(f1Options);
		filters.add(f1);

		TransfusionFilterData f2 = new TransfusionFilterData();
		f2.setCode("1");
		f2.setDisplayName("Producto");

		List<TransfusionFilterData> f1Options2 = new ArrayList<TransfusionFilterData>();

		TransfusionFilterData f21 = new TransfusionFilterData();
		f21.setCode("11");
		f21.setDisplayName("Plaquetas");
		f1Options2.add(f21);

		TransfusionFilterData f22 = new TransfusionFilterData();
		f22.setCode("12");
		f22.setDisplayName("Plasma");
		f1Options2.add(f22);

		f2.setOptions(f1Options2);
		filters.add(f2);

		return filters;
	}

	@Override
	public List<DataBank> getBanksUser(String user) {

		if(user == null)
			return null;
		return getCenterBean().getBanksUser(user);
	}

	@Override
	public List<DataInstitution> getInstitutionsUser(String user) {
		
		if(user == null)
			return null;
		
		return getInstitutionBean().getInstitutionsUser(user);
		
	}

	@Override
	public List<DataPerson> getPersons() {
		
		return getPersonBean().getPersonsFilters(new HashMap<String,Object>());

	}

	@Override
	public List<DataProductType> getProducts() {

		return getCodeBeans().getProducts();

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
		
		return getCenterBean().getResponsibleTransfusionPersons(centerCode);
		
	}

	@Override
	public List<DataCode> getTransfusionsAnalysis() {

		return getCodeBeans().getTransfusionsAnalysis();
	}

	@Override
	public List<DataCode> getTransfusionsEvents() {

		return getCodeBeans().getTransfusionsEvents();
	}

	@Override
	public List<DataCode> getSeverities() {

		return getCodeBeans().getSeverities();
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
		
		return getCodeBeans().getDonationsAnalysis();
		
	}

	@Override
	public List<DataCode> getDonationsEvents() {
		
		return getCodeBeans().getDonationsEvents();
	}

	@Override
	public List<DataCode> getDonationABOTypes() {
		
		return getBloodLocal().getDonationABOTypes();
	}

	@Override
	public List<DataCode> getDonationDTTypes() {
		
		return getBloodLocal().getDonationDTTypes();
		
	}

	@Override
	public List<DataCode> getRejectionReasons() {
		
		return getCodeBeans().getRejectionReasons();
	}

	@Override
	public List<DataCode> getRejectionTypes() {
	
		return getCodeBeans().getRejectionTypes();
		
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
		List<DataBloodType> bloodTypes = this.getBloodTypes();
		
//		List<DataUnit> ret = new ArrayList<>();
		DataUnit d = null;
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		for (DataBloodType bt : bloodTypes) {
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
		
		return getCodeBeans().getDocumentsTypes();
		
	}

	@Override
	public List<DataCode> getCountries() {
		
		return getCodeBeans().getCountries();
		
	}

	@Override
	public List<DataCode> getStatesCodes() {
		
		return getCodeBeans().getStates();
	}

	@Override
	public List<DataCode> getCitiesCodes() {
		
		return getCodeBeans().getCities();
		
	}

	@Override
	public List<DataInstitution> getInstitutions() {
		
		return getInstitutionBean().getInstitutions();
		
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
		
		return getCodeBeans().getDonationsStates();
		
	}

	public IInstitutionBeanLocal getInstitutionBean() {
		
		if(institutionBean == null){
			
			try {
				
				institutionBean = InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/InstitutionBean!org.hemologica.salud.ejb.beans.impl.InstitutionBean");
				
			} catch (NamingException e) {
				
				logger.log(Level.SEVERE, e.getMessage(), e);
				
			}
		}
		return institutionBean;
	}

	public IBloodLocal getBloodLocal() {
			
		if(bloodLocal == null){
			
			try {
				
				bloodLocal = InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/BloodBean!org.hemologica.salud.ejb.beans.IBloodLocal");
				
			} catch (NamingException e) {
				
				logger.log(Level.SEVERE, e.getMessage(), e);
				
			}
		}
		return bloodLocal;
		
	}

	public CodesBeanLocal getCodeBeans() {
		
		if(codeBeans == null){
			
			try {
				
				codeBeans = InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/CodesBean!org.hemologica.salud.ejb.beans.impl.CodesBean");
				
			} catch (NamingException e) {

				logger.log(Level.SEVERE, e.getMessage(), e);

			}
		}
		return codeBeans;
	}
	
	public CentersBeanLocal getCenterBean() {
		
		if(centerBeans == null){
			
			try {
				
				centerBeans = InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/CentersBean!org.hemologica.salud.ejb.beans.CentersBeanLocal");
				
			} catch (NamingException e) {
				
				logger.log(Level.SEVERE, e.getMessage(), e);
				
			}
		}
		return centerBeans;
	}

	
	public PersonBeanLocal getPersonBean() {
		
		if(personBeans == null){
			
			try {
				
				personBeans = InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/PersonBean!org.hemologica.salud.ejb.beans.PersonBeanLocal");
				
			} catch (NamingException e) {
				
				logger.log(Level.SEVERE, e.getMessage(), e);
				
			}
		}
		return personBeans;
	}
	
	public AdvertismentBeanLocal getAdvertismentBean() {
		
		if(advertismentBean == null){
			
			try {
				
				advertismentBean = InitialContext.doLookup("java:global/Hemologica-Salud-Backend-ear/Hemologica-Salud-Backend-ejb/AdvertismentBean!org.hemologica.salud.ejb.beans.impl.AdvertismentBean");
				
			} catch (NamingException e) {
				
				logger.log(Level.SEVERE, e.getMessage(), e);
				
			}
		}
		return advertismentBean;
	}

	
}
