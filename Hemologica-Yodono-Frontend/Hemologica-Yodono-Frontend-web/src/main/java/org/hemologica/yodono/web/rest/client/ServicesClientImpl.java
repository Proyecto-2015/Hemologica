package org.hemologica.yodono.web.rest.client;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.hemologica.datatypes.LoginData;
import org.hemologica.yodono.factories.RestFactory;

public class ServicesClientImpl implements IServicesClient {

	private String url = "http://localhost:8080/Hemologica-Yodono-Backend-web/services/login";
	
	@Override
	public int login(String user, String password) throws IOException {
		
		LoginData loginData = new LoginData();
		loginData.setUser(user);
		loginData.setPassword(password);
		
		String response = RestFactory.getRestServicesUtils().post(url, loginData);
		
		
		HashMap<String , String> hash = new HashMap<String, String>();
		hash.put("primero", "primerovalor");
		hash.put("segundo", "segundovalor");
		try {
			String respnse = RestFactory.getRestServicesUtils().get(url, hash);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

}
