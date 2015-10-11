package org.hemologica.yodono.web.rest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.ws.rs.core.Response;
import org.hemologica.datatypes.DataDonacion;
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
		
		DataDonacion d2 = new DataDonacion();
		d2.setApproved(true);
		d2.setBank("Banco X2");
		d2.setInstitution("Hospital de clinicas2");
		d2.setName("Pedro2");
		d2.setDonorType("Voluntario2");
		d2.setDate("10/02/2014");
		donaciones.add(d2);
		
		return donaciones;
	}

}
