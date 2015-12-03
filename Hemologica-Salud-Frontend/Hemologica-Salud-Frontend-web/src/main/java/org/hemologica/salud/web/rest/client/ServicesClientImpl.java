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
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataState;
import org.hemologica.datatypes.DataStock;
import org.hemologica.datatypes.DataStockProductType;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataUnit;
import org.hemologica.datatypes.DataUnitInfo;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.DataDonationsStatistics;
import org.hemologica.datatypes.DataDonationsStatisticsResults;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.DataMessageOption;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.datatypes.TransfusionFilterData;
import org.hemologica.salud.factories.RestFactory;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class ServicesClientImpl implements IServicesClient {

	private static final Logger logger = Logger.getLogger(ServicesClientImpl.class.getName());
	private String url = ConstantsRest.PATH_SERVICES_HEMOSALUD;

	@Override
	public List<DataDonation> getMyDonations(String user) throws IOException {

		String urlDonations = url + ConstantsRest.PATH_DONATIONS;

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_USER, user);

		String donacionesString = "";
		try {
			donacionesString = RestFactory.getRestServicesUtils().get(urlDonations, hash);
		} catch (URISyntaxException e) {
			logger.log(Level.SEVERE, "Error al llamar al servicio", e);
		}

		Type listType = new TypeToken<List<DataDonation>>() {
		}.getType();
		List<DataDonation> donaciones = new Gson().fromJson(donacionesString, listType);

		return donaciones;
	}

	@Override
	public List<DataTransfusion> getMyTransfusions(String user) throws IOException {

		String urlTransfusions = url + ConstantsRest.PATH_TRANSFUTIONS;

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_USER, user);

		String transfusionesString = "";
		try {
			transfusionesString = RestFactory.getRestServicesUtils().get(urlTransfusions, hash);
		} catch (URISyntaxException e) {
			logger.log(Level.SEVERE, "Error al llamar al servicio", e);
		}

		Type listType = new TypeToken<List<DataTransfusion>>() {
		}.getType();
		List<DataTransfusion> transfusions = new Gson().fromJson(transfusionesString, listType);

		return transfusions;
	}

	@Override
	public DataUser getDataUser(String user) throws IOException {

		String urlUsers = url + ConstantsRest.PATH_USERS;

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_USER, "hola");

		String userString = "";
		try {
			userString = RestFactory.getRestServicesUtils().get(urlUsers, hash);
		} catch (URISyntaxException e) {
			logger.log(Level.SEVERE, "Error al llamar al servicio", e);
		}

		DataUser dataUser = new Gson().fromJson(userString, DataUser.class);

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
			logger.log(Level.SEVERE, "Error al llamar al servicio IOException", e);
		}

		Type listType = new TypeToken<List<DataBank>>() {
		}.getType();
		List<DataBank> banks = new Gson().fromJson(banksString, listType);

		return banks;
	}

	@Override
	public DataStock getBankStock(String code) throws ClientProtocolException, IOException, URISyntaxException {

		String urlBanks = url + ConstantsRest.PATH_BANKS_STOCK;

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_BANK, code);

		String stockString = "";
		try {
			stockString = RestFactory.getRestServicesUtils().get(urlBanks, hash);

		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error al llamar al servicio IOException", e);
		}

		DataStock stock = new Gson().fromJson(stockString, DataStock.class);
		return stock;
	}

	@Override
	public List<DataCity> getCities() throws ClientProtocolException, IOException {

		String urlCities = url + ConstantsRest.PATH_CITIES;

		HashMap<String, String> hash = new HashMap<String, String>();

		String citiesString = "";
		try {

			citiesString = RestFactory.getRestServicesUtils().get(urlCities, hash);

		} catch (URISyntaxException e) {
			logger.log(Level.SEVERE, "Error al llamar al servicio", e);
		}

		Type listType = new TypeToken<List<DataCity>>() {
		}.getType();
		List<DataCity> cities = new Gson().fromJson(citiesString, listType);

		return cities;
	}

	@Override
	public List<DataCity> getCities(String statesCode) throws ClientProtocolException, IOException {

		String urlCities = url + ConstantsRest.PATH_CITIES;

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_STATE, statesCode);

		String citiesString = "";
		try {

			citiesString = RestFactory.getRestServicesUtils().get(urlCities, hash);

		} catch (URISyntaxException e) {
			logger.log(Level.SEVERE, "Error al llamar al servicio", e);
		}

		Type listType = new TypeToken<List<DataCity>>() {
		}.getType();
		List<DataCity> cities = new Gson().fromJson(citiesString, listType);

		return cities;
	}

	@Override
	public List<DataState> getStates() throws ClientProtocolException, IOException {
		String urlStates = url + ConstantsRest.PATH_STATES;

		HashMap<String, String> hash = new HashMap<String, String>();

		String statesString = "";
		try {

			statesString = RestFactory.getRestServicesUtils().get(urlStates, hash);

		} catch (URISyntaxException e) {
			logger.log(Level.SEVERE, "Error al llamar al servicio", e);
		}

		Type listType = new TypeToken<List<DataState>>() {
		}.getType();
		List<DataState> cities = new Gson().fromJson(statesString, listType);

		return cities;
	}

	@Override
	public List<DataMessageOption> getMessageOptions() throws ClientProtocolException, IOException {

		String urlMessages = url + ConstantsRest.PATH_CAMPAIGNS + "/" + ConstantsRest.PATH_CAMPAIGNS_MESSAGES_OPTIONS;

		HashMap<String, String> hash = new HashMap<String, String>();

		String statesOptions = "";
		try {

			statesOptions = RestFactory.getRestServicesUtils().get(urlMessages, hash);

		} catch (URISyntaxException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio", e);
		}

		Type listType = new TypeToken<List<DataMessageOption>>() {
		}.getType();
		List<DataMessageOption> options = new Gson().fromJson(statesOptions, listType);

		return options;
	}

	@Override
	public List<DataBloodType> getBloodTypes() throws ClientProtocolException, IOException {

		String urlBloodTypes = url + ConstantsRest.PATH_CODES + "/" + ConstantsRest.PATH_BLOOD_TYPES;

		HashMap<String, String> hash = new HashMap<String, String>();

		String bloodTypesString = "";
		try {

			bloodTypesString = RestFactory.getRestServicesUtils().get(urlBloodTypes, hash);

		} catch (URISyntaxException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio", e);
		}

		Type listType = new TypeToken<List<DataBloodType>>() {
		}.getType();
		List<DataBloodType> bloodTypes = new Gson().fromJson(bloodTypesString, listType);

		return bloodTypes;
	}

	@Override
	public DataResponse sendMessage(MailData mailData) {

		String urlSendMessage = url + ConstantsRest.PATH_CAMPAIGNS + "/" + ConstantsRest.PATH_SEND_MESSAGE;

		String sendMessageString = "";
		try {

			sendMessageString = RestFactory.getRestServicesUtils().post(urlSendMessage, mailData);

		} catch (IOException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio", e);
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

			logger.log(Level.SEVERE, "Error al llamar al servicio", e);
		}

		DataResponse response = new Gson().fromJson(sendMessageString, DataResponse.class);

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

			logger.log(Level.SEVERE, "Error al llamar al servicio", e);

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

			logger.log(Level.SEVERE, "Error al llamar al servicio", e);

		}

		DataCampaign campaign = new Gson().fromJson(campaignString, DataCampaign.class);

		return campaign;
	}

	@Override
	public List<DataInstitution> getInstitution(String userId) throws ClientProtocolException, IOException {

		String urlService = url + ConstantsRest.PATH_USERS + "/" + ConstantsRest.PATH_INSTITUTIONS;

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_USER, userId);

		String responseString = "";
		try {

			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);

		} catch (URISyntaxException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio", e);

		}

		Type listType = new TypeToken<List<DataInstitution>>() {
		}.getType();
		List<DataInstitution> responseObject = new Gson().fromJson(responseString, listType);

		return responseObject;
	}

	@Override
	public List<DataBank> getBanks(String userId) throws ClientProtocolException, IOException {

		String urlService = url + ConstantsRest.PATH_USERS + "/" + ConstantsRest.PATH_BANKS;

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_USER, userId);

		String responseString = "";
		try {

			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);

		} catch (URISyntaxException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio", e);

		}

		Type listType = new TypeToken<List<DataBank>>() {
		}.getType();
		List<DataBank> responseObject = new Gson().fromJson(responseString, listType);

		return responseObject;
	}

	@Override
	public List<DonationFilterData> getDonationsFilters() throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_CODES + "/" + ConstantsRest.PATH_DONATIONS_FILTERS;

		HashMap<String, String> hash = new HashMap<String, String>();

		String responseString = "";
		try {

			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);

		} catch (URISyntaxException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio", e);

		}

		Type listType = new TypeToken<List<DonationFilterData>>() {
		}.getType();
		List<DonationFilterData> responseObject = new Gson().fromJson(responseString, listType);

		return responseObject;
	}

	@Override
	public List<TransfusionFilterData> getTransfusionsFilters() throws ClientProtocolException, IOException {

		String urlService = url + ConstantsRest.PATH_USERS + ConstantsRest.PATH_DONATIONS_FILTERS;

		HashMap<String, String> hash = new HashMap<String, String>();

		String responseString = "";
		try {

			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);

		} catch (URISyntaxException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio", e);

		}

		Type listType = new TypeToken<List<TransfusionFilterData>>() {
		}.getType();
		List<TransfusionFilterData> responseObject = new Gson().fromJson(responseString, listType);

		return responseObject;
	}

	@Override
	public List<DataPerson> getPersons() throws ClientProtocolException, IOException {

		String urlService = url + ConstantsRest.PATH_PERSONS;

		HashMap<String, String> hash = new HashMap<String, String>();

		String responseString = "";
		try {

			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);

		} catch (URISyntaxException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio", e);

		}

		Type listType = new TypeToken<List<DataPerson>>() {
		}.getType();
		List<DataPerson> responseObject = new Gson().fromJson(responseString, listType);

		return responseObject;
	}

	@Override
	public List<DataStockProductType> getNationalStock()
			throws ClientProtocolException, IOException, URISyntaxException {

		String urlService = url + ConstantsRest.PATH_NATIONAL_STOCK;

		HashMap<String, String> hash = new HashMap<String, String>();

		String responseString = "";
		try {

			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);

		} catch (URISyntaxException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio", e);

		}

		Type listType = new TypeToken<List<DataStockProductType>>(){}.getType();
		List<DataStockProductType> responseObject = new Gson().fromJson(responseString, listType);

		return responseObject;
	}

	@Override
	public List<DataProductType> getProducts() throws ClientProtocolException, IOException {
		String urlService = url + ConstantsRest.PATH_CODES +"/" + ConstantsRest.PATH_PRODUCTS;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataProductType>>(){}.getType();
		List<DataProductType> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public List<DataBank> getBanks(String bankCode, String productCode, String bloodTypeCodeRH, String bloodTypeCodeABO, Integer count)
			throws ClientProtocolException, IOException, URISyntaxException {
		

		String urlBanks = url + ConstantsRest.PATH_BANKS_QUERY;
		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_BANK, bankCode);
		hash.put(ConstansJson.JSON_PRODUCT_TYPE, productCode);
		hash.put(ConstansJson.JSON_BLOOD_TYPE_ABO, bloodTypeCodeRH);
		hash.put(ConstansJson.JSON_BLOOD_TYPE_RH, bloodTypeCodeABO);
		if(count != null){ hash.put(ConstansJson.JSON_COUNT, count.toString());};
		String banksString = "";
		try {
			banksString = RestFactory.getRestServicesUtils().get(urlBanks, hash);

		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error al llamar al servicio IOException", e);
		}

		Type listType = new TypeToken<List<DataBank>>() {
		}.getType();
		List<DataBank> banks = new Gson().fromJson(banksString, listType);

		return banks;
		
		
		
	}

	@Override
	public List<DataResponsiblePerson> getResponsibleTransfusionPersons(DataBank bank) throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_PERSONS + "/"+ ConstantsRest.PATH_RESPONSIBLE_TRENSFUSION;
		
		if(bank == null){
			
			return null;
		}
		
		HashMap<String , String> hash = new HashMap<String, String>();
		hash.put(ConstansJson.JSON_BANK, bank.getCode());
		
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataResponsiblePerson>>(){}.getType();
		List<DataResponsiblePerson> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
		
	}

	@Override
	public List<DataCode> getTransfusionsAnalysis() throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_TRANSFUSIONS_ANALYSIS;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCode>>(){}.getType();
		List<DataCode> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public List<DataCode> getSeverities() throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_SEVERITIES;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCode>>(){}.getType();
		List<DataCode> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public List<DataCode> getTransfusionsEvents() throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_TRANSFUSIONS_EVENTS;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCode>>(){}.getType();
		List<DataCode> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public DataUnit getUnit() throws ClientProtocolException, IOException {
		
		
		String urlService = url + ConstantsRest.PATH_UNITS;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
//		Type listType = new TypeToken<List<DataUnit>>(){}.getType();
		DataUnit responseObject= new Gson().fromJson(responseString, DataUnit.class);
		
		return responseObject;
		
	}

	@Override
	public List<DataCode> getDonationAnalysis() throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_DONATIONS_ANALYSIS;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCode>>(){}.getType();
		List<DataCode> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public List<DataCode> getDonationsEvents() throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_DONATIONS_EVENTS;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCode>>(){}.getType();
		List<DataCode> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public List<DataCode> getDonationABOTypes() throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_BLOOD_TYPES_ABO;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCode>>(){}.getType();
		List<DataCode> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public List<DataCode> getDonationDTTypes() throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_BLOOD_TYPES_RH;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCode>>(){}.getType();
		List<DataCode> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public List<DataCode> getRejectionReasons() throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_REJECTION_REASONS;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCode>>(){}.getType();
		List<DataCode> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public List<DataCode> getRejectionTypes() throws ClientProtocolException, IOException {
		String urlService = url + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_REJECTION_TYPES;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCode>>(){}.getType();
		List<DataCode> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public List<DataCode> getCitiesCodes() throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_CITIES;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCode>>(){}.getType();
		List<DataCode> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public List<DataCode> getStatesCodes() throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_STATES;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCode>>(){}.getType();
		List<DataCode> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public List<DataCode> getCountries() throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_COUNTRIES;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCode>>(){}.getType();
		List<DataCode> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public List<DataCode> getDocumentsTypes() throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_DOCUMENTS_TYPE;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCode>>(){}.getType();
		List<DataCode> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public List<DataInstitution> getInstitutions() throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_INSTITUTIONS;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataInstitution>>(){}.getType();
		List<DataInstitution> responseObject= new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public DataUnitInfo getUnitInfo(String code) throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_UNIT_INFO;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		
		DataUnitInfo responseObject = new Gson().fromJson(responseString, DataUnitInfo.class);
		
		return responseObject;
	}

	@Override
	public List<DataCode> getDonationState() throws ClientProtocolException, IOException {
		
		String urlService = url + ConstantsRest.PATH_CODES +"/"+ ConstantsRest.PATH_DONATION_STATES;
		
		HashMap<String , String> hash = new HashMap<String, String>();
		String responseString = "";
		try {
			
			responseString = RestFactory.getRestServicesUtils().get(urlService, hash);
			
		} catch (URISyntaxException e) {
			
			logger.log(Level.SEVERE,"Error al llamar al servicio", e);
			
		}
		
		Type listType = new TypeToken<List<DataCode>>(){}.getType();
		List<DataCode> responseObject = new Gson().fromJson(responseString, listType);
		
		return responseObject;
	}

	@Override
	public DataDonationsStatisticsResults getDonationsStatistics(DataDonationsStatistics statictic) {
		
		String urlSendMessage = url + ConstantsRest.PATH_STATISTICS ;

		String sendMessageString = "";
		try {

			sendMessageString = RestFactory.getRestServicesUtils().post(urlSendMessage, statictic);

		} catch (IOException e) {

			logger.log(Level.SEVERE, "Error al llamar al servicio", e);
		}

		DataDonationsStatisticsResults response = new Gson().fromJson(sendMessageString, DataDonationsStatisticsResults.class);

		return response;
	}

}
