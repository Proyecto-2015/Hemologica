package org.hemologica.yodono.web.rest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;
import javax.ws.rs.core.Response;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataState;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.LoginData;


public class RestServicesImpl implements IRestServices {
	
	private static final Logger logger = Logger.getLogger(RestServicesImpl.class.getName()); 
	
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
//		d.setApproved(true);
		d.setBank("Banco de Sangre 1");
		d.setInstitution("Hospital de clinicas");
		d.setName("Pedro");
		d.setDonorType("Voluntario");
		d.setDate("10/10/2015");
		donaciones.add(d);
		
		DataDonation d3 = new DataDonation();
//		d3.setApproved(true);
		d3.setBank("Banco de Sangre 2");
		d3.setInstitution("Hospital Britanico");
		d3.setName("Pedro");
		d3.setDonorType("Voluntario");
		d3.setDate("28/02/2015");
		donaciones.add(d3);
		
		DataDonation d2 = new DataDonation();
//		d2.setApproved(false);
		d2.setBank("Banco de Sangre 2");
		d2.setInstitution("Hospital Pereira Rossell");
		d2.setName("Pedro2");
		d2.setDonorType("Reposición");
		d2.setDate("17/02/2014");
		donaciones.add(d2);
		
		DataDonation d4 = new DataDonation();
//		d4.setApproved(false);
		d4.setBank("Banco de Sangre 2");
		d4.setInstitution("Hospital de clinicas");
		d4.setName("Pedro");
		d4.setDonorType("Voluntario");
		d4.setDate("10/07/2013");
		donaciones.add(d4);
		
		return donaciones;
	}

	@Override
	public List<DataTransfusion> getTransfusions(String user) {
		List<DataTransfusion> transfusions = new ArrayList<DataTransfusion>();
		
		DataTransfusion t1 = new DataTransfusion();
		
		t1.setBank("Banco X");
		t1.setInstitution("Hospital de clinicas");
		t1.setName("Pedro");
		t1.setDate("10/02/2015");
		t1.setProduct("Plaquetas");
		transfusions.add(t1);
		
		DataTransfusion t2 = new DataTransfusion();
		
		t2.setBank("Banco X");
		t2.setInstitution("Hospital de clinicas");
		t2.setName("Pedro");
		t2.setDate("10/02/2015");
		t2.setProduct("Plaquetas");
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
		
		DataState state = getStates().get(0);
		dataUser.setState(state);
		
		DataCity city = getCities().get(0);
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
		db1.setInstitution("Institucion 1");
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
		db2.setInstitution("Institucion 2");
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
		db3.setInstitution("Institucion 3");
		db3.setAddress("Melilla 7356");
		db3.setEmail("infobanco3@hc.com");
		db3.setHour("Lunes a jueves de 8 - 20 hs y Sabados 8 - 12 ");
		db3.setInformation("Pedir hora por la pagina web bancoDesangre3.org.uy");
		db3.setTelephone("098765432");
		db3.setLatitude(-34.758027);
		db3.setLongitude( -56.272928);
		  
		banks.add(db3);
		return banks;
	}

	@Override
	public List<DataState> getStates() {
		
		List<DataState> cities = new ArrayList<DataState>();
		
		DataState dataCity = new DataState();
		dataCity.setCode("0");
		dataCity.setName("Montevideo");
		cities.add(dataCity);
		
		DataState dataCity2 = new DataState();
		dataCity2.setCode("1");
		dataCity2.setName("Canelones");
		cities.add(dataCity2);
		
		DataState dataCity3 = new DataState();
		dataCity3.setCode("2");
		dataCity3.setName("Maldonado");
		cities.add(dataCity3);
		
		return cities;
	}

	@Override
	public List<DataCity> getCities() {
		List<DataCity> cities = new ArrayList<DataCity>();
		
		DataCity dataCity = new DataCity();
		dataCity.setCode("1");
		dataCity.setName("Montevideo");
		cities.add(dataCity);
	
		DataCity dataCity2 = new DataCity();
		dataCity2.setCode("12");
		dataCity2.setName("Las piedras");
		cities.add(dataCity2);
		
		DataCity dataCity3 = new DataCity();
		dataCity3.setCode("22");
		dataCity3.setName("Solymar");
		cities.add(dataCity3);
		
		DataCity dataCity4 = new DataCity();
		dataCity4.setCode("32");
		dataCity4.setName("El pinar");
		cities.add(dataCity4);
	
	
		DataCity dataCity5 = new DataCity();
		dataCity5.setCode("13");
		dataCity5.setName("Punta del Este");
		cities.add(dataCity5);
		
		DataCity dataCity6 = new DataCity();
		dataCity6.setCode("23");
		dataCity6.setName("Piriapolis");
		cities.add(dataCity6);
		
		DataCity dataCity7 = new DataCity();
		dataCity7.setCode("33");
		dataCity7.setName("San Francisco");
		cities.add(dataCity7);
	
		return cities;
	}

	@Override
	public List<DataCity> getCities(String stateCode) {
		
		if(stateCode == null){
			return this.getCities();
		}
		
		List<DataCity> cities = new ArrayList<DataCity>();
	
		if(stateCode.equals("0")){
			DataCity dataCity = new DataCity();
			dataCity.setCode("1");
			dataCity.setName("Montevideo");
			cities.add(dataCity);
			
//			DataCity dataCity2 = new DataCity();
//			dataCity2.setId(2);
//			dataCity.setCode("2");
//			dataCity2.setName("Montevideo 2");
//			cities.add(dataCity2);
//			
//			DataCity dataCity3 = new DataCity();
//			dataCity3.setId(3);
//			dataCity.setCode("3");
//			dataCity3.setName("Montevideo 3");
//			cities.add(dataCity3);
		}
		if(stateCode.equals("1")){
			DataCity dataCity = new DataCity();
			dataCity.setCode("12");
			dataCity.setName("Las piedras");
			cities.add(dataCity);
			
			DataCity dataCity2 = new DataCity();
			dataCity.setCode("22");
			dataCity2.setName("Solymar");
			cities.add(dataCity2);
			
			DataCity dataCity3 = new DataCity();
			dataCity.setCode("32");
			dataCity3.setName("El pinar");
			cities.add(dataCity3);
		}
		if(stateCode.equals("2")){
			DataCity dataCity = new DataCity();
			dataCity.setCode("13");
			dataCity.setName("Punta del Este");
			cities.add(dataCity);
			
			DataCity dataCity2 = new DataCity();
			dataCity.setCode("23");
			dataCity2.setName("Piriapolis");
			cities.add(dataCity2);
			
			DataCity dataCity3 = new DataCity();
			dataCity.setCode("33");
			dataCity3.setName("San Francisco");
			cities.add(dataCity3);
		}
		
		return cities;
	}

	@Override
	public DataResponse updateUser(DataUser dataUser) {
		
		logger.info(dataUser.getAddress());
		logger.info(dataUser.getBirthdayDate());
		
		DataResponse dataResponse = new DataResponse();
		dataResponse.setCode(0);
		
		return dataResponse;
	}

	@Override
	public List<DataCampaign> getCampaigns(String cant) {
		List<DataCampaign> campaigns = new ArrayList<DataCampaign>();
		
		for(int i=1;i<7;i++){
			DataCampaign c1 = new DataCampaign();
			c1.setId(Integer.toString(i));
			c1.setTitle("Titulo " );
			c1.setSubtitle("Sub Titulo");
			
			c1.setText("Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. "
					+ "Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. "
					+ "Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. " );
			c1.setSummary("Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. " + i);
			
			c1.setDate("12/12/2015");
			campaigns.add(c1);
		}
		
		return campaigns;
	}

	@Override
	public DataCampaign getCampaign(String campaignId) {
		List<DataCampaign> campaigns = getCampaigns("");
		
		return campaigns.get(Integer.parseInt(campaignId)-1);
	}

}
