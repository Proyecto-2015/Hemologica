package org.hemologica.yodono.web.rest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.ws.rs.core.Response;

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

}
