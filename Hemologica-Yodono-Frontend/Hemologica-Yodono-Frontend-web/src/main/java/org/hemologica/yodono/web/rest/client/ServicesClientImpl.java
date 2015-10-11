package org.hemologica.yodono.web.rest.client;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.hemologica.constants.ConstansJson;
import org.hemologica.datatypes.DataDonacion;
import org.hemologica.datatypes.LoginData;
import org.hemologica.yodono.factories.RestFactory;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class ServicesClientImpl implements IServicesClient {

	private Logger logger = Logger.getLogger(ServicesClientImpl.class);
	private String url = "http://localhost:8080/Hemologica-Yodono-Backend-web/services/";
	
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
			String respnse = (String) RestFactory.getRestServicesUtils().get(url, hash);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public List<DataDonacion> getMyDonations(String user) throws IOException {
		
		String urlDonations = url + "donations";
		
		HashMap<String , String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_USER, "hola");
		
		String donacionesString = "";
		try {
			donacionesString = RestFactory.getRestServicesUtils().get(urlDonations, hash);
		} catch (URISyntaxException e) {
			logger.error("Error al llamar al servicio", e);
		}
		
		Type listType = new TypeToken<List<DataDonacion>>(){}.getType();
		List<DataDonacion> donaciones = new Gson().fromJson(donacionesString, listType);
		
		return donaciones;
	}

}
