package org.hemologica.salud.web.rest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;
import javax.ws.rs.core.Response;

import org.hemologica.constants.DataDonationStateEnum;
import org.hemologica.constants.DataEventSeverityEnum;
import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataDonationDonorType;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.datatypes.DataPerson;
<<<<<<< HEAD
import org.hemologica.datatypes.DataProduct;
=======
>>>>>>> c87f32e28f65557f094113da4da545dc94c5a91e
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataState;
import org.hemologica.datatypes.DataStock;
import org.hemologica.datatypes.DataStockProductType;
import org.hemologica.datatypes.DataStockProductTypeBloodType;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataTransfusionEvent;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.LoginData;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.MessageOptionData;
import org.hemologica.datatypes.TransfusionFilterData;

public class RestServicesImpl implements IRestServices {

	private Logger logger = Logger.getLogger(RestServicesImpl.class.getName());

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

		d.setState(DataDonationStateEnum.MADE);

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
		d3.setState(DataDonationStateEnum.REJECTED);
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
		d2.setState(DataDonationStateEnum.MADE);
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
		d4.setState(DataDonationStateEnum.REJECTED);
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

		DataTransfusionEvent dte = new DataTransfusionEvent();
		dte.setCode("0");
		dte.setDisplay("Evento adverso 1");
		dte.setSeverity(DataEventSeverityEnum.MODERATE);

		DataTransfusionEvent dte1 = new DataTransfusionEvent();
		dte1.setCode("1");
		dte1.setDisplay("Evento adverso 2");
		dte1.setSeverity(DataEventSeverityEnum.SEVERE);

		List<DataTransfusionEvent> dteList = new ArrayList<>();
		dteList.add(dte1);
		dteList.add(dte);

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
	public DataUser getUser(String user) {

		DataUser dataUser = new DataUser();
		dataUser.setFirstName("Paula");
		dataUser.setSecondName("segundo");
		dataUser.setFirstLastName("Roche");
		dataUser.setSecondLastName("De Polsi");
		dataUser.setDocumentType("CI");
		dataUser.setDocumentNumber("46714299");
		dataUser.setTelephone("099876678");

		Calendar c = Calendar.getInstance();
		c.set(1989, 9, 14);
		dataUser.setBirthdayDate("14/10/1989");

		DataState state = new DataState();
		state.setId(1);
		state.setName("Montevideo state");
		dataUser.setState(state);

		DataCity city = new DataCity();
		city.setId(1);
		city.setName("Montevideo city");

		dataUser.setCity(city);
		dataUser.setAddress("Rivera 2711");
		dataUser.setEmail("pula14@gmail.com");

		dataUser.setAllowNotificationAbleToDonate(true);
		dataUser.setAllowNotificationNeedDonor(false);

		return dataUser;
	}

	@Override
	public List<DataBank> getBanks() {

		List<DataBank> banks = new ArrayList<>();
		DataBank db1 = new DataBank();
		db1.setCode("1");
		db1.setName("Banco de Sangre 1");

		DataInstitution di1 = new DataInstitution();
		di1.setName("Institucion 1");

		db1.setInstitution(di1);

		db1.setAddress("Av Italia 345");
		db1.setEmail("infobanco1@hc.com");
		db1.setHour("Lunes a viernes de 8 - 18 hs ");
		db1.setInformation("Se dan 40 numeros a partir de las 8 am.");
		db1.setTelephone("12345678");
		db1.setLatitude(-34.898930);
		db1.setLongitude(-56.165753);
		banks.add(db1);

		DataBank db2 = new DataBank();
		db2.setCode("2");
		db2.setName("Banco de Sangre 2");

		DataInstitution di = new DataInstitution();
		di.setName("Institucion 2");

		db2.setInstitution(di);
		db2.setAddress("Rivera 567");
		db2.setEmail("infobanco2@hc.com");
		db2.setHour("Lunes a viernes de 8 - 20 hs y Sabados 8 - 12 ");
		db2.setInformation("Pedir hora por telefono");
		db2.setTelephone("098765432");
		db2.setLatitude(-34.871729);
		db2.setLongitude(-56.188868);

		banks.add(db2);

		DataBank db3 = new DataBank();
		db3.setCode("3");
		db3.setName("Banco de Sangre 3");
		DataInstitution di3 = new DataInstitution();
		di3.setName("Institucion 3");

		db3.setInstitution(di3);
		db3.setAddress("Melilla 7356");
		db3.setEmail("infobanco3@hc.com");
		db3.setHour("Lunes a jueves de 8 - 20 hs y Sabados 8 - 12 ");
		db3.setInformation("Pedir hora por la pagina web bancoDesangre3.org.uy");
		db3.setTelephone("098765432");
		db3.setLatitude(-34.758027);
		db3.setLongitude(-56.272928);

		banks.add(db3);
		return banks;
	}

	@Override
	public List<DataState> getStates() {

		List<DataState> cities = new ArrayList<DataState>();

		DataState dataCity = new DataState();
		dataCity.setCode("0");
		dataCity.setName("Montevideo 111");
		cities.add(dataCity);

		DataState dataCity2 = new DataState();
		dataCity2.setCode("2");
		dataCity2.setName("Montevideo 122");
		cities.add(dataCity2);

		DataState dataCity3 = new DataState();
		dataCity3.setCode("3");
		dataCity3.setName("Montevideo 133");
		cities.add(dataCity3);

		return cities;
	}

	@Override
	public List<DataCity> getCities() {
		List<DataCity> cities = new ArrayList<DataCity>();

		DataCity dataCity = new DataCity();
		dataCity.setId(1);
		dataCity.setCode("1");
		dataCity.setName("Montevideo 1");
		cities.add(dataCity);

		DataCity dataCity2 = new DataCity();
		dataCity2.setId(2);
		dataCity.setCode("2");
		dataCity2.setName("Montevideo 2");
		cities.add(dataCity2);

		DataCity dataCity3 = new DataCity();
		dataCity3.setId(3);
		dataCity.setCode("3");
		dataCity3.setName("Montevideo 3");
		cities.add(dataCity3);

		DataCity dataCity4 = new DataCity();
		dataCity4.setId(4);
		dataCity.setCode("4");
		dataCity4.setName("Montevideo 12");
		cities.add(dataCity4);

		DataCity dataCity5 = new DataCity();
		dataCity5.setId(2);
		dataCity.setCode("5");
		dataCity5.setName("Montevideo 22");
		cities.add(dataCity5);

		DataCity dataCity6 = new DataCity();
		dataCity6.setId(3);
		dataCity.setCode("6");
		dataCity6.setName("Montevideo 32");
		cities.add(dataCity6);

		DataCity dataCity7 = new DataCity();
		dataCity7.setId(1);
		dataCity.setCode("7");
		dataCity7.setName("Montevideo 13");
		cities.add(dataCity7);

		DataCity dataCity8 = new DataCity();
		dataCity8.setId(2);
		dataCity.setCode("8");
		dataCity8.setName("Montevideo 23");
		cities.add(dataCity8);

		DataCity dataCity9 = new DataCity();
		dataCity9.setId(3);
		dataCity.setCode("9");
		dataCity9.setName("Montevideo 33");
		cities.add(dataCity9);

		return cities;
	}

	@Override
	public List<DataCity> getCities(String stateCode) {

		if (stateCode == null) {
			return this.getCities();
		}

		List<DataCity> cities = new ArrayList<DataCity>();

		if (stateCode.equals("0")) {
			DataCity dataCity = new DataCity();
			dataCity.setId(1);
			dataCity.setCode("1");
			dataCity.setName("Montevideo 1");
			cities.add(dataCity);

			DataCity dataCity2 = new DataCity();
			dataCity2.setId(2);
			dataCity.setCode("2");
			dataCity2.setName("Montevideo 2");
			cities.add(dataCity2);

			DataCity dataCity3 = new DataCity();
			dataCity3.setId(3);
			dataCity.setCode("3");
			dataCity3.setName("Montevideo 3");
			cities.add(dataCity3);
		}
		if (stateCode.equals("1")) {
			DataCity dataCity = new DataCity();
			dataCity.setId(1);
			dataCity.setCode("12");
			dataCity.setName("Montevideo 12");
			cities.add(dataCity);

			DataCity dataCity2 = new DataCity();
			dataCity2.setId(2);
			dataCity.setCode("22");
			dataCity2.setName("Montevideo 22");
			cities.add(dataCity2);

			DataCity dataCity3 = new DataCity();
			dataCity3.setId(3);
			dataCity.setCode("32");
			dataCity3.setName("Montevideo 32");
			cities.add(dataCity3);
		}
		if (stateCode.equals("2")) {
			DataCity dataCity = new DataCity();
			dataCity.setId(1);
			dataCity.setCode("13");
			dataCity.setName("Montevideo 13");
			cities.add(dataCity);

			DataCity dataCity2 = new DataCity();
			dataCity2.setId(2);
			dataCity.setCode("23");
			dataCity2.setName("Montevideo 23");
			cities.add(dataCity2);

			DataCity dataCity3 = new DataCity();
			dataCity3.setId(3);
			dataCity.setCode("33");
			dataCity3.setName("Montevideo 33");
			cities.add(dataCity3);
		}

		return cities;
	}

	@Override
	public List<MessageOptionData> getMessageOptions() {
		List<MessageOptionData> options = new ArrayList<>();

		MessageOptionData o1 = new MessageOptionData();
		o1.setCode("0");
		o1.setDisplayName("Todos");
		options.add(o1);

		MessageOptionData o2 = new MessageOptionData();
		o2.setCode("1");
		o2.setDisplayName("Solo Habilitados");
		options.add(o2);

		return options;
	}

	@Override
<<<<<<< HEAD
	public List<DataBloodType> getBloodTypes() {
		List<DataBloodType>  options = new ArrayList<>();
			
		DataBloodType o1 = new DataBloodType();
		o1.setCode("0");
		o1.setDisplayName("AB+");
		options.add(o1);
		
		DataBloodType o2 = new DataBloodType();
		o2.setCode("1");
		o2.setDisplayName("AB-");
		options.add(o2);
		
		DataBloodType o3 = new DataBloodType();
		o3.setCode("2");
		o3.setDisplayName("0+");
		options.add(o3);
		
		DataBloodType o4 = new DataBloodType();
=======
	public List<BloodTypeData> getBloodTypes() {
		List<BloodTypeData> options = new ArrayList<>();

		BloodTypeData o1 = new BloodTypeData();
		o1.setCode("0");
		o1.setDisplayName("AB+");
		options.add(o1);

		BloodTypeData o2 = new BloodTypeData();
		o2.setCode("1");
		o2.setDisplayName("AB-");
		options.add(o2);

		BloodTypeData o3 = new BloodTypeData();
		o3.setCode("2");
		o3.setDisplayName("0+");
		options.add(o3);

		BloodTypeData o4 = new BloodTypeData();
>>>>>>> c87f32e28f65557f094113da4da545dc94c5a91e
		o4.setCode("3");
		o4.setDisplayName("0-");
		options.add(o4);

		return options;
	}

	@Override
	public DataResponse sendMessage(MailData mailData) {
		DataResponse response = new DataResponse();

		logger.info(mailData.getSubject());
		logger.info(mailData.getText());
		logger.info(mailData.getBloodType().getDisplayName());
		logger.info(mailData.getMessageOption().getDisplayName());

		response.setCode(0);
		return response;
	}

	@Override
	public DataResponse sendCampaign(DataCampaign dataCampaign) {

		DataResponse response = new DataResponse();

		logger.info(dataCampaign.getText());
		logger.info(dataCampaign.getTitle());
		logger.info(dataCampaign.getSummary());
		logger.info(dataCampaign.getSubtitle());
		logger.info(dataCampaign.getDate());

		response.setCode(0);
		return response;
	}

	@Override
	public List<DataCampaign> getCampaigns(String cant) {
		List<DataCampaign> campaigns = new ArrayList<DataCampaign>();

		int cantInt = Integer.valueOf(cant);

		for (int i = 1; i <= cantInt; i++) {
			DataCampaign c1 = new DataCampaign();
			c1.setId(Integer.toString(i));
			c1.setTitle("Titulo ");
			c1.setSubtitle("Sub Titulo");

			c1.setText(
					"Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. "
							+ "Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. "
							+ "Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. ");
			c1.setSummary(
					"Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. "
							+ i);

			c1.setDate("12/12/2015");
			campaigns.add(c1);
		}

		return campaigns;
	}

	@Override
	public DataCampaign getCampaign(String campaignId) {
		List<DataCampaign> campaigns = getCampaigns("7");

		return campaigns.get(Integer.parseInt(campaignId) - 1);
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

		return getBanks();
	}

	@Override
	public List<DataInstitution> getInstitutionsUser(String user) {

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

		banks.add(db2);

		return banks;
	}

	@Override
	public List<DataPerson> getPersons() {

		List<DataPerson> persons = new ArrayList<>();

		DataPerson d1 = new DataPerson();
		d1.setId("1");
		d1.setDocumentType("Cedula de Identidad");
		d1.setDocumentNumber("46714299");
		d1.setFirstName("Paula");
		d1.setSecondName("Paula");
		d1.setFirstLastName("Roche");
		d1.setSecondLastName("De Polsi");
		d1.setAbleToDonate(true);

		DataBloodType dtb = new DataBloodType();
		dtb.setCode("0");
		dtb.setDisplayName("AB+");
		d1.setBloodType(dtb);
		persons.add(d1);

		DataPerson d2 = new DataPerson();
		d2.setId("2");
		d2.setDocumentType("Cedula de Identidad 2");
		d2.setDocumentNumber("46714299");
		d2.setFirstName("Paula2");
		d2.setSecondName("Paula2");
		d2.setFirstLastName("Roche2");
		d2.setSecondLastName("De Polsi2");
		d2.setAbleToDonate(false);
		DataBloodType dtb2 = new DataBloodType();
		dtb2.setCode("1");
		dtb2.setDisplayName("AB-");
		d2.setBloodType(dtb2);
		persons.add(d2);

		DataPerson d3 = new DataPerson();
		d3.setId("3");
		d3.setDocumentType("Cedula de Identidad3");
		d3.setDocumentNumber("46714299");
		d3.setFirstName("Paula3");
		d3.setSecondName("Paula3");
		d3.setFirstLastName("Roche3");
		d3.setSecondLastName("De Polsi3");
		d3.setAbleToDonate(true);

		DataBloodType dtb3 = new DataBloodType();
		dtb3.setCode("1");
		dtb3.setDisplayName("AB-");
		d3.setBloodType(dtb3);
		persons.add(d2);

		persons.add(d3);

		return persons;
	}

	@Override
<<<<<<< HEAD
	public List<DataProductType> getProducts() {
		List<DataProductType> products = new ArrayList<>();
		
		DataProductType dp1 = new DataProductType();
		dp1.setCode("0");
		dp1.setDisplay("Plaquetas");
		
		DataProductType dp2 = new DataProductType();
		dp2.setCode("1");
		dp2.setDisplay("Plasma");
		
		
		products.add(dp1);
		products.add(dp2);
		return products;
=======
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
>>>>>>> c87f32e28f65557f094113da4da545dc94c5a91e
	}

}
