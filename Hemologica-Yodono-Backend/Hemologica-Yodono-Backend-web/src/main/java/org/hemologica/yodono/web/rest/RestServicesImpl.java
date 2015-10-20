package org.hemologica.yodono.web.rest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.ws.rs.core.Response;

import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataDonacion;
import org.hemologica.datatypes.DataState;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.LoginData;


public class RestServicesImpl implements IRestServices {
	
	
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
	public List<DataDonacion> getDonations(String user) {
		
		List<DataDonacion> donaciones = new ArrayList<DataDonacion>();
		
		DataDonacion d = new DataDonacion();
		d.setApproved(true);
		d.setBank("Banco X");
		d.setInstitution("Hospital de clinicas");
		d.setName("Pedro");
		d.setDonorType("Voluntario");
		d.setDate("10/02/2015");
		donaciones.add(d);
		
		DataDonacion d3 = new DataDonacion();
		d3.setApproved(true);
		d3.setBank("Banco X");
		d3.setInstitution("Hospital de clinicas");
		d3.setName("Pedro");
		d3.setDonorType("Voluntario");
		d3.setDate("10/02/2015");
		donaciones.add(d3);
		
		DataDonacion d2 = new DataDonacion();
		d2.setApproved(false);
		d2.setBank("Banco X2");
		d2.setInstitution("Hospital de clinicas2");
		d2.setName("Pedro2");
		d2.setDonorType("Voluntario2");
		d2.setDate("10/02/2014");
		donaciones.add(d2);
		
		
		
		DataDonacion d4 = new DataDonacion();
		d4.setApproved(false);
		d4.setBank("Banco X2");
		d4.setInstitution("Hospital de clinicas2");
		d4.setName("Pedro2");
		d4.setDonorType("Voluntario2");
		d4.setDate("10/02/2014");
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
		db1.setName("Banco 1");
		db1.setInstitution("Institucion 1");
		db1.setAddress("Direccion 1");
		db1.setEmail("email 1");
		db1.setHour("hora 1");
		db1.setInformation("informacion 1");
		db1.setTelephone("telefono 1");
		db1.setLatitude(-34.898930);
		db1.setLongitude(-56.165753);
		banks.add(db1);
		  
		  
		DataBank db2 = new DataBank();
		db2.setCode("2");
		db2.setName("Banco 2");
		db2.setInstitution("Institucion 2");
		db2.setAddress("Direccion 2");
		db2.setEmail("email 2");
		db2.setHour("hora 2");
		db2.setInformation("informacion 2");
		db2.setTelephone("telefono 2");
		db2.setLatitude(-34.871729);
		db2.setLongitude(-56.188868);
		  
		banks.add(db2);
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
		
		if(stateCode == null){
			return this.getCities();
		}
		
		List<DataCity> cities = new ArrayList<DataCity>();
	
		if(stateCode.equals("0")){
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
		if(stateCode.equals("1")){
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
		if(stateCode.equals("2")){
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

}
