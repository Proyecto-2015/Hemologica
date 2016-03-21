package org.hemologica.yodono.web.rest.client;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import org.apache.http.client.ClientProtocolException;
import org.apache.log4j.Logger;
import org.hemologica.constants.ConstansJson;
import org.hemologica.constants.ConstantsRest;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.LoginData;
import org.hemologica.yodono.factories.RestFactory;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ServicesClientImpl implements IServicesClient {

	private static final Logger logger = Logger.getLogger(ServicesClientImpl.class.getName());
	private String url = ConstantsRest.PATH_SERVICES_YO_DONO;

	@Override
	public int login(String user, String password) throws IOException {

		LoginData loginData = new LoginData();
		loginData.setUser(user);
		loginData.setPassword(password);

		@SuppressWarnings("unused")
		String response = RestFactory.getRestServicesUtils().post(url, loginData);

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("primero", "primerovalor");
		hash.put("segundo", "segundovalor");
		try {
			@SuppressWarnings("unused")
			String respnse = (String) RestFactory.getRestServicesUtils().get(url, hash);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public List<DataDonation> getMyDonations(String userId) throws IOException {

		String urlDonations = url + ConstantsRest.PATH_DONATIONS;

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_USER, userId);

		String donacionesString = "";
		try {
			donacionesString = RestFactory.getRestServicesUtils().get(urlDonations, hash);
		} catch (URISyntaxException e) {
			logger.error("Error al llamar al servicio", e);
		}

		Type listType = new TypeToken<List<DataDonation>>() {
		}.getType();
		List<DataDonation> donaciones = new Gson().fromJson(donacionesString, listType);

		return donaciones;
	}

	@Override
	public List<DataTransfusion> getMyTransfusions(String userId) throws IOException {

		String urlTransfusions = url + ConstantsRest.PATH_TRANSFUTIONS;

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_USER, userId);

		String transfusionesString = "";
		try {
			transfusionesString = RestFactory.getRestServicesUtils().get(urlTransfusions, hash);
		} catch (URISyntaxException e) {
			logger.error("Error al llamar al servicio", e);
		}

		Type listType = new TypeToken<List<DataTransfusion>>() {
		}.getType();
		List<DataTransfusion> transfusions = new Gson().fromJson(transfusionesString, listType);

		return transfusions;
	}
	
	@Override
	public DataPerson getDataUser(String userId) throws IOException {

		String urlUsers = url + ConstantsRest.PATH_USERS;

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_USER, userId);

		String userString = "";
		try {
			userString = RestFactory.getRestServicesUtils().get(urlUsers, hash);
		} catch (URISyntaxException e) {
			logger.error("Error al llamar al servicio", e);
		}

		DataPerson dataUser = new Gson().fromJson(userString, DataPerson.class);

		return dataUser;
	}

	@Override
	public List<DataBank> getBanks() throws URISyntaxException {

		String urlBanks = url + ConstantsRest.PATH_BANKS;

		HashMap<String, String> hash = new HashMap<String, String>();

		String banksString = "";
		try {
			banksString = RestFactory.getRestServicesUtils().get(urlBanks, hash);

		} catch (IOException e) {

			logger.error("Error al llamar al servicio IOException", e);

		}

		Type listType = new TypeToken<List<DataBank>>() {
		}.getType();
		List<DataBank> banks = new Gson().fromJson(banksString, listType);

		return banks;
	}

	@Override
	public List<DataCode> getCities() throws ClientProtocolException, IOException {

		String urlCities = url + ConstantsRest.PATH_CITIES;

		HashMap<String, String> hash = new HashMap<String, String>();

		String citiesString = "";
		try {

			citiesString = RestFactory.getRestServicesUtils().get(urlCities, hash);

		} catch (URISyntaxException e) {
			logger.error("Error al llamar al servicio", e);
		}

		Type listType = new TypeToken<List<DataCode>>() {
		}.getType();
		List<DataCode> cities = new Gson().fromJson(citiesString, listType);

		return cities;
	}

	@Override
	public List<DataCode> getCities(String statesCode) throws ClientProtocolException, IOException {

		String urlCities = url + ConstantsRest.PATH_CITIES_STATE;

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_STATE, statesCode);

		String citiesString = "";
		try {

			citiesString = RestFactory.getRestServicesUtils().get(urlCities, hash);

		} catch (URISyntaxException e) {

			logger.error("Error al llamar al servicio", e);

		}

		Type listType = new TypeToken<List<DataCode>>() {
		}.getType();
		List<DataCode> cities = new Gson().fromJson(citiesString, listType);

		return cities;
	}

	@Override
	public List<DataCode> getStates() throws ClientProtocolException, IOException {
		String urlStates = url + ConstantsRest.PATH_STATES;

		HashMap<String, String> hash = new HashMap<String, String>();

		String statesString = "";
		try {

			statesString = RestFactory.getRestServicesUtils().get(urlStates, hash);

		} catch (URISyntaxException e) {

			logger.error("Error al llamar al servicio", e);

		}

		Type listType = new TypeToken<List<DataCode>>() {
		}.getType();
		List<DataCode> cities = new Gson().fromJson(statesString, listType);

		return cities;
	}

	@Override
	public DataResponse updateUserData(DataPerson dataUser) throws ClientProtocolException, IOException {

		String urlUsers = url + ConstantsRest.PATH_USERS;

		String responseString = "";
		responseString = RestFactory.getRestServicesUtils().put(urlUsers, dataUser);

		DataResponse response = new Gson().fromJson(responseString, DataResponse.class);

		return response;

	}

	@Override
	public List<DataCampaign> getCampaigns(int cant) throws ClientProtocolException, IOException {

		String urlCampaigns = url + ConstantsRest.PATH_CAMPAIGNS;

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_CANT, Integer.toString(cant));

		String campaignsString = "";
		try {

			campaignsString = RestFactory.getRestServicesUtils().get(urlCampaigns, hash);

		} catch (URISyntaxException e) {

			logger.error("Error al llamar al servicio", e);

		}

		Type listType = new TypeToken<List<DataCampaign>>() {
		}.getType();
		List<DataCampaign> campaigns = new Gson().fromJson(campaignsString, listType);

		return campaigns;
	}

	@Override
	public DataCampaign getCampaign(String campaignId) throws ClientProtocolException, IOException {

		String urlCampaign = url + ConstantsRest.PATH_CAMPAIGN;

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_CAMPAIGN_ID, campaignId);

		String campaignString = "";
		try {

			campaignString = RestFactory.getRestServicesUtils().get(urlCampaign, hash);

		} catch (URISyntaxException e) {

			logger.error("Error al llamar al servicio", e);

		}

		DataCampaign campaign = new Gson().fromJson(campaignString, DataCampaign.class);

		return campaign;
	}

	@Override
	public List<DataCode> getCitiesCodes() throws ClientProtocolException, IOException {

		String urlService = url + ConstantsRest.PATH_CODES + "/" + ConstantsRest.PATH_CITIES;

		HashMap<String, String> hash = new HashMap<String, String>();
		String responseString = "";
		try {

			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);

		} catch (URISyntaxException e) {

			logger.error("Error al llamar al servicio", e);

		}

		Type listType = new TypeToken<List<DataCode>>() {
		}.getType();
		List<DataCode> responseObject = new Gson().fromJson(responseString, listType);

		return responseObject;
	}

	@Override
	public List<DataCode> getStatesCodes() throws ClientProtocolException, IOException {

		String urlService = url + ConstantsRest.PATH_CODES + "/" + ConstantsRest.PATH_STATES;

		HashMap<String, String> hash = new HashMap<String, String>();
		String responseString = "";
		try {

			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);

		} catch (URISyntaxException e) {

			logger.error("Error al llamar al servicio", e);

		}

		Type listType = new TypeToken<List<DataCode>>() {
		}.getType();
		List<DataCode> responseObject = new Gson().fromJson(responseString, listType);

		return responseObject;
	}

	@Override
	public DataUser getUserFirstAccess(String token) throws ClientProtocolException, IOException {

		String urlUsers = url + ConstantsRest.PATH_ACCOUNT_ENABLE;
		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("token", token);
		String responseString = "";
		try {
			responseString = RestFactory.getRestServicesUtils().get(urlUsers, hash);
		} catch (URISyntaxException e) {
			logger.error("Error al llamar al servicio", e);
		}

		DataUser response = new Gson().fromJson(responseString, DataUser.class);

		return response;
	}

	@Override
	public DataResponse updateUserFirstAccess(DataUser data) throws ClientProtocolException, IOException {

		String urlUsers = url + ConstantsRest.PATH_ACCOUNT_ENABLE;
		String responseString = "";
		responseString = RestFactory.getRestServicesUtils().post(urlUsers, data);
		DataResponse resp = new Gson().fromJson(responseString, DataResponse.class);
		return resp;
		
	}

}
