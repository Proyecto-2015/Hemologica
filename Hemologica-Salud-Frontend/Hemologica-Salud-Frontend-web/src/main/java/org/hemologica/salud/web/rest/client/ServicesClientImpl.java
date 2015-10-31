package org.hemologica.salud.web.rest.client;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.client.ClientProtocolException;
import org.hemologica.constants.ConstansJson;
import org.hemologica.constants.ConstantsRest;
import org.hemologica.datatypes.BloodTypeData;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataState;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.LoginData;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.MessageOptionData;
import org.hemologica.salud.factories.RestFactory;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class ServicesClientImpl implements IServicesClient {

	private static final Logger logger = Logger.getLogger(ServicesClientImpl.class.getName());
	private String url = ConstantsRest.PATH_SERVICES_HEMOSALUD;
	
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
	public List<DataDonation> getMyDonations(String user) throws IOException {
		
		String urlDonations = url + ConstantsRest.PATH_DONATIONS;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_USER, "hola");
		
		String donacionesString = "";
		try {
			donacionesString = RestFactory.getRestServicesUtils().get(urlDonations, hash);
		} catch (URISyntaxException e) {
			logger.log( Level.SEVERE, "Error al llamar al servicio", e);
		}
		
		Type listType = new TypeToken<List<DataDonation>>(){}.getType();
		List<DataDonation> donaciones = new Gson().fromJson(donacionesString, listType);
		
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
			logger.log( Level.SEVERE, "Error al llamar al servicio", e);
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
			logger.log( Level.SEVERE, "Error al llamar al servicio", e);
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
			logger.log( Level.SEVERE, "Error al llamar al servicio IOException", e);
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
			logger.log( Level.SEVERE, "Error al llamar al servicio", e);
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
			logger.log( Level.SEVERE, "Error al llamar al servicio", e);
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
			logger.log( Level.SEVERE, "Error al llamar al servicio", e);
		}
		
		Type listType = new TypeToken<List<DataState>>(){}.getType();
		List<DataState> cities = new Gson().fromJson(statesString, listType);
		
		return cities;
	}

	@Override
	public List<MessageOptionData> getMessageOptions() throws ClientProtocolException, IOException {
		
		String urlMessages = url + ConstantsRest.PATH_CAMPAIGNS + "/" + ConstantsRest.PATH_CAMPAIGNS_MESSAGES_OPTIONS;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		
		String statesOptions = "";
		try {
			
			statesOptions = RestFactory.getRestServicesUtils().get(urlMessages, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log( Level.SEVERE, "Error al llamar al servicio", e);
		}
		
		Type listType = new TypeToken<List<MessageOptionData>>(){}.getType();
		List<MessageOptionData> options = new Gson().fromJson(statesOptions, listType);
		
		return options;
	}

	@Override
	public List<BloodTypeData> getBloodTypes() throws ClientProtocolException, IOException {
		
		String urlBloodTypes = url + ConstantsRest.PATH_CODES + "/" + ConstantsRest.PATH_BLOOD_TYPES;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		
		String bloodTypesString = "";
		try {
			
			bloodTypesString = RestFactory.getRestServicesUtils().get(urlBloodTypes, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log( Level.SEVERE, "Error al llamar al servicio", e);
		}
		
		Type listType = new TypeToken<List<BloodTypeData>>(){}.getType();
		List<BloodTypeData> bloodTypes = new Gson().fromJson(bloodTypesString, listType);
		
		return bloodTypes;
	}

	@Override
	public DataResponse sendMessage(MailData mailData) {
		
		String urlSendMessage = url + ConstantsRest.PATH_CAMPAIGNS + "/" + ConstantsRest.PATH_SEND_MESSAGE;
		
		String sendMessageString = "";
		try {
			
			sendMessageString = RestFactory.getRestServicesUtils().post(urlSendMessage, mailData);
			
		} catch (IOException e) {
			
			logger.log( Level.SEVERE, "Error al llamar al servicio", e);
		}
		
		DataResponse response = new Gson().fromJson(sendMessageString, DataResponse.class);
		
		return response;
		
	}

	@Override
	public DataResponse getSendCampaign(DataCampaign campaign) {
		
		String urlSendCampaign = url + ConstantsRest.PATH_CAMPAIGNS + "/" + ConstantsRest.PATH_SEND_CAMPAIGN;
		
		String sendMessageString = "";
		try {
			
			sendMessageString = RestFactory.getRestServicesUtils().post(urlSendCampaign, campaign);
			
		} catch (IOException e) {
			
			logger.log( Level.SEVERE, "Error al llamar al servicio", e);
		}
		
		DataResponse response = new Gson().fromJson(sendMessageString, DataResponse.class);
		
		return response;
	}
	
	@Override
	public List<DataCampaign> getCampaigns(int cant) throws ClientProtocolException, IOException {
		
		String urlCampaigns = url + ConstantsRest.PATH_CAMPAIGNS;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_CANT, Integer.toString(cant));
		
		String campaignsString = "";
		try {
			
			campaignsString = RestFactory.getRestServicesUtils().get(urlCampaigns, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCampaign>>(){}.getType();
		List<DataCampaign> campaigns = new Gson().fromJson(campaignsString, listType);
		
		return campaigns;
	}

	@Override
	public DataCampaign getCampaign(String campaignId) throws ClientProtocolException, IOException {
		
		String urlCampaign = url + ConstantsRest.PATH_CAMPAIGN;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_CAMPAIGN_ID, campaignId);
		
		String campaignString = "";
		try {
			
			campaignString = RestFactory.getRestServicesUtils().get(urlCampaign, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		DataCampaign campaign = new Gson().fromJson(campaignString, DataCampaign.class);
		
		return campaign;
	}

}