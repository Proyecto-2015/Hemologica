package org.hemologica.yodono.web.rest.client;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCampaign;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataResponse;
import org.hemologica.datatypes.DataTransfusion;
import org.hemologica.datatypes.DataUser;

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
	public List<DataDonation> getMyDonations(String user) throws IOException;

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
	public DataPerson getDataUser(String string) throws IOException;

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
	public List<DataCode> getCities() throws ClientProtocolException, IOException;
	
	/**
	 * Devuelve la informacion de todas las ciudades para un departamento dado.
	 * @param statesCode
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getCities(String statesCode) throws ClientProtocolException, IOException;
	
	/**
	 * Devuelve la informacion todos los departamentos.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getStates() throws ClientProtocolException, IOException;
	
	/**
	 * Actualiza la informacion del usuario en la base de datos.
	 * @param dataUser
	 * @return DataResponse con estado del llamado.
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public DataResponse updateUserData(DataPerson dataUser) throws ClientProtocolException, IOException;
	
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
	
	/**
	 * Devuelve las ciudades.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getCitiesCodes() throws ClientProtocolException, IOException;
	
	/**
	 * Devuelve loas departamentos.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getStatesCodes() throws ClientProtocolException, IOException;

	/**
	 * Obtengo la cuenta del usuario a partir del token para activar la cuenta
	 * @param token
	 * @return
	 */
	public DataUser getUserFirstAccess(String token) throws ClientProtocolException, IOException ;
	
	/**
	 * Actualizar datos de la cuenta del primer acceso
	 * @param data
	 */
	public DataResponse updateUserFirstAccess(DataUser data) throws ClientProtocolException, IOException ;
	
	
}
