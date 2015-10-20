package org.hemologica.yodono.web.rest.client;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.log4j.Logger;
import org.hemologica.constants.ConstansJson;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataDonacion;
import org.hemologica.datatypes.DataState;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.LoginData;
import org.hemologica.yodono.constants.ConstantsRest;
import org.hemologica.yodono.factories.RestFactory;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class ServicesClientImpl implements IServicesClient {

	private Logger logger = Logger.getLogger(ServicesClientImpl.class);
	private String url = ConstantsRest.PATH_SERVICES;
	
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
		
		String urlDonations = url + ConstantsRest.PATH_DONATIONS;
		
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

	@Override
	public List<DataTransfusion> getMyTransfusions(String user) throws IOException {
		
		String urlTransfusions = url + ConstantsRest.PATH_TRANSFUTIONS;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_USER, "hola");
		
		String transfusionesString = "";
		try {
			transfusionesString = RestFactory.getRestServicesUtils().get(urlTransfusions, hash);
		} catch (URISyntaxException e) {
			logger.error("Error al llamar al servicio", e);
		}
		
		Type listType = new TypeToken<List<DataTransfusion>>(){}.getType();
		List<DataTransfusion> transfusions = new Gson().fromJson(transfusionesString, listType);
		
		return transfusions;
	}

	@Override
	public DataUser getDataUser(String user) throws IOException {
		
		String urlUsers = url + ConstantsRest.PATH_USERS;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_USER, "hola");
		
		String userString = "";
		try {
			userString = RestFactory.getRestServicesUtils().get(urlUsers, hash);
		} catch (URISyntaxException e) {
			logger.error("Error al llamar al servicio", e);
		}
		
		DataUser dataUser = new Gson().fromJson(userString, DataUser.class);
		
		return dataUser;
	}

	@Override
	public List<DataBank> getBanks() throws URISyntaxException{
		
		String urlBanks = url + ConstantsRest.PATH_BANKS;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		
		String banksString = "";
		try {
			banksString = RestFactory.getRestServicesUtils().get(urlBanks, hash);
			
		} catch (IOException e) {
			
			logger.error("Error al llamar al servicio IOException", e);
			
		}
		
		Type listType = new TypeToken<List<DataBank>>(){}.getType();
		List<DataBank> banks = new Gson().fromJson(banksString, listType);
		
		return banks;
	}
	

	@Override
	public List<DataCity> getCities() throws ClientProtocolException, IOException {
		
		String urlCities = url + ConstantsRest.PATH_CITIES;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		
		String citiesString = "";
		try {
			
			citiesString = RestFactory.getRestServicesUtils().get(urlCities, hash);
			
		} catch (URISyntaxException e) {
			logger.error("Error al llamar al servicio", e);
		}
		
		Type listType = new TypeToken<List<DataCity>>(){}.getType();
		List<DataCity> cities = new Gson().fromJson(citiesString, listType);
		
		return cities;
	}

	@Override
	public List<DataCity> getCities(String statesCode) throws ClientProtocolException, IOException {
		
		String urlCities = url + ConstantsRest.PATH_CITIES;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_STATE, statesCode);
		
		String citiesString = "";
		try {
			
			citiesString = RestFactory.getRestServicesUtils().get(urlCities, hash);
			
		} catch (URISyntaxException e) {
			
			logger.error("Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCity>>(){}.getType();
		List<DataCity> cities = new Gson().fromJson(citiesString, listType);
		
		return cities;
	}
	

	@Override
	public List<DataState> getStates() throws ClientProtocolException, IOException {
		String urlStates = url + ConstantsRest.PATH_STATES;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		
		String statesString = "";
		try {
			
			statesString = RestFactory.getRestServicesUtils().get(urlStates, hash);
			
		} catch (URISyntaxException e) {
			
			logger.error("Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataState>>(){}.getType();
		List<DataState> cities = new Gson().fromJson(statesString, listType);
		
		return cities;
	}

}
