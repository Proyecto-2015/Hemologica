package org.hemologica.yodono.web.rest;

import javax.ws.rs.core.Response;
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

}
