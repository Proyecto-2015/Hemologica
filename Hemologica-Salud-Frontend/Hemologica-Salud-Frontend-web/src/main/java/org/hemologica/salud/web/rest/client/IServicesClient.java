package org.hemologica.salud.web.rest.client;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.BloodTypeData;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataDonacion;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataState;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.MessageOptionData;

public interface IServicesClient {
	
	/**
	 * Intenta hacer login - Creo que esto se va con lo de JasigCas
	 * @param user
	 * @param password
	 * @return
	 * @throws IOException 
	 */
	public int login(String user, String password) throws IOException;
	
	/**
	 * Devuelve la lista de donaciones del usuario pasado como parametro.
	 * @param user
	 * @return
	 * @throws IOException 
	 */
	public List<DataDonacion> getMyDonations(String user) throws IOException;

	/**
	 * Devuelve la lista de transfusiones del usuario pasado como parametro.
	 * @param user
	 * @return
	 * @throws IOException 
	 */
	public List<DataTransfusion> getMyTransfusions(String user) throws IOException;
	
	/**
	 * Devuelve la informacion personal del usuario pasado por parametro 
	 * @param string
	 * @return
	 */
	public DataUser getDataUser(String string) throws IOException;

	/**
	 * Devuelve la informacion todos los bancos de sangre. 
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 * @throws URISyntaxException 
	 */
	public List<DataBank> getBanks() throws ClientProtocolException, IOException, URISyntaxException;
	
	/**
	 * Devuelve la informacion todos las ciudades.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCity> getCities() throws ClientProtocolException, IOException;
	
	/**
	 * Devuelve la informacion de todas las ciudades para un departamento dado.
	 * @param statesCode
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCity> getCities(String statesCode) throws ClientProtocolException, IOException;
	
	/**
	 * Devuelve la informacion todos los departamentos.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataState> getStates() throws ClientProtocolException, IOException;

	/**
	 * Devuelve las opciones de envio de mensajes.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<MessageOptionData> getMessageOptions() throws ClientProtocolException, IOException;

	/**
	 * Devuleve todos los tipos de sangre. Une la distincion entre ABO y R+
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<BloodTypeData> getBloodTypes() throws ClientProtocolException, IOException;
	
	/**
	 * Envia Mails a quien corresponda segun los datos en DAtaMail
	 * @param mailData
	 * @throws IOException 
	 */
	public DataResponse sendMessage(MailData mailData) throws IOException;

	/**
	 * Envia la campaña para que la puedan ver los ciudadanos
	 * @param mailData
	 * @throws IOException 
	 */
	public DataResponse getSendCampaign(DataCampaign campaign);
	
	/**
	 * Devuelve la cantidad de campañas pasadas por parametro por orden cronologico. Empezando por el dia de la fecha. 
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCampaign> getCampaigns(int cant) throws ClientProtocolException, IOException;

	/**
	 * Devuelve la campaña con id el pasado por parametro
	 * @param campaignId
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public DataCampaign getCampaign(String campaignId) throws ClientProtocolException, IOException;
}
