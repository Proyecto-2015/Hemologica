package org.hemologica.salud.web.rest.client;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import org.apache.http.client.ClientProtocolException;
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
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.DataMessageOption;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.datatypes.TransfusionFilterData;

@RequestScoped
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
	 * Devuelve la informacion todos los bancos de sangre que cumplan con el criterio de busqueda. 
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 * @throws URISyntaxException 
	 */
	public List<DataBank> getBanks(String bankCode, String productTypeCode, String bloodTypeCodeRH, String bloodTypeCodeABO, Integer count) throws ClientProtocolException, IOException, URISyntaxException;
	
	/**
	 * Devuelve el stock del banco con el code ingresado
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	public DataStock getBankStock(String code) throws ClientProtocolException, IOException, URISyntaxException;
	
	
	/**
	 * Devuelve el stock nacional
	 * @param code
	 * @return
	 * @throws URISyntaxException
	 */
	public List<DataStockProductType> getNationalStock() throws ClientProtocolException, IOException, URISyntaxException;
	
	
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
	public List<DataMessageOption> getMessageOptions() throws ClientProtocolException, IOException;

	/**
	 * Devuleve todos los tipos de sangre. Une la distincion entre ABO y R+
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataBloodType> getBloodTypes() throws ClientProtocolException, IOException;
	
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

	/**
	 * Devuelve las instituciones a las que pertenece el usuario
	 * @param campaignId
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataInstitution> getInstitution(String string) throws ClientProtocolException, IOException;

	/**
	 * Devuelve los bancos a los que pertenece el usuario
	 * @param campaignId
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataBank> getBanks(String string) throws ClientProtocolException, IOException;

	/**
	 * Devuelve los filtros habilitados para las donaciones
	 * @param campaignId
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DonationFilterData> getDonationsFilters() throws ClientProtocolException, IOException;
	
	/**
	 * Devuelve los filtros habilitados para las transfusiones
	 * @param campaignId
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<TransfusionFilterData> getTransfusionsFilters() throws ClientProtocolException, IOException;
	
	/**
	 * Devuelve los datos de las personas registradas en hemologica
	 * @param campaignId
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataPerson> getPersons() throws ClientProtocolException, IOException;

	/**
	 * Devuelve los tipos de productos.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataProductType> getProducts() throws ClientProtocolException, IOException;

	/**
	 * Devuelve los responsables de realizar transfusiones en el banco pasado por parametro. 
	 * @param bank
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataResponsiblePerson> getResponsibleTransfusionPersons(DataBank bank) throws ClientProtocolException, IOException;

	/**
	 * DEvulve los nombres de los analisis de las transfusiones
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getTransfusionsAnalysis() throws ClientProtocolException, IOException;
	
	/**
	 * Devuelve los tipos de severidad.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getSeverities() throws ClientProtocolException, IOException;

	/**
	 * Devuelve los tipos de eventos de las transfusiones.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getTransfusionsEvents() throws ClientProtocolException, IOException;
	
	
	/**
	 * Devuelve las unidades de los bancos de sangre
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public DataUnit getUnit() throws ClientProtocolException, IOException;
	

	/**
	 * Devuelve los tipos de analisis de laboratorio de las donaciones.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getDonationAnalysis() throws ClientProtocolException, IOException;

	/**
	 * Devuelve los tipos de eventos adversos de las donaciones.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getDonationsEvents() throws ClientProtocolException, IOException;

	/**
	 * Devuelve los typos de sangre ABO
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getDonationABOTypes() throws ClientProtocolException, IOException;

	/**
	 * Devuelve los tipos de sangre RH
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getDonationDTTypes() throws ClientProtocolException, IOException;

	/**
	 * Devuelve los motivos de rechazo de una donacion.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getRejectionReasons() throws ClientProtocolException, IOException;

	/**
	 * Devuelve los tipos de rechazo de una donacion.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getRejectionTypes() throws ClientProtocolException, IOException;

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
	 * Devuelve los paises.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getCountries() throws ClientProtocolException, IOException;
	
	/**
	 * Devuelve los tipos de documentos.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getDocumentsTypes() throws ClientProtocolException, IOException;
	
	/**
	 * Devuelve todas las instituciones del sistema.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataInstitution> getInstitutions() throws ClientProtocolException, IOException;

	/**
	 * Devuelve la informacion completa de una unidad dado su codigo
	 * @param code
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public DataUnitInfo getUnitInfo(String code) throws ClientProtocolException, IOException;
}
