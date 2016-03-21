package org.hemologica.salud.web.rest.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataBank;
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
import org.hemologica.datatypes.DataTransfusionsStatistics;
import org.hemologica.datatypes.DataTransfusionsStatisticsResults;
import org.hemologica.datatypes.DataUnit;
import org.hemologica.datatypes.DataUnitInfo;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.DataDonationsStatistics;
import org.hemologica.datatypes.DataDonationsStatisticsResults;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.MailData;
import org.hemologica.datatypes.DataMessageOption;
import org.hemologica.datatypes.DataOmsStatistics;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.datatypes.DataSearchFilter;
import org.hemologica.datatypes.TransfusionFilterData;

@RequestScoped
public interface IServicesClient {
	
	/**
	 * Devuelve la lista de donaciones del usuario pasado como parametro.
	 * @param user
	 * @return
	 * @throws IOException 
	 */
	public List<DataDonation> getMyDonations(Long user) throws IOException;

	/**
	 * Devuelve la lista de transfusiones del usuario pasado como parametro.
	 * @param user
	 * @return
	 * @throws IOException 
	 */
	public List<DataTransfusion> getMyTransfusions(Long user) throws IOException;
	
	/**
	 * Devuelve la informacion personal del usuario pasado por parametro 
	 * @param string
	 * @return
	 */
	public DataPerson getDataUser(String user) throws IOException;
	
	
	

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
	public DataStock getBanks(DataBank bankCode, DataInstitution institution, String productCode, String bloodTypeCodeRH, String bloodTypeCodeABO, Integer count) throws ClientProtocolException, IOException, URISyntaxException;
	
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
	public List<DataCode> getBloodTypes() throws ClientProtocolException, IOException;
	
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
	public DataUnitInfo getUnitInfo(String code, String institutionCode) throws ClientProtocolException, IOException;
	
	/**
	 * Devuelve los estados de una donacion.
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getDonationState() throws ClientProtocolException, IOException;

	/**
	 * Devuelve las estadisticas para los filtros pasado por parametros.
	 * @param statictic
	 * @return
	 */
	public DataDonationsStatisticsResults getDonationsStatistics(DataDonationsStatistics statictic);

	/**
	 * Devuelve las estadisticas para los filtros pasado por parametros.
	 * @param statictic
	 * @return
	 */
	public DataTransfusionsStatisticsResults getTransfusionsStatistics(DataTransfusionsStatistics statictic);

	/**
	 * Devuelve los tipos de donaciones
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getDonationTypes() throws ClientProtocolException, IOException;

	/**
	 * Devuelve los tipos de donantes
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getDonorTypes() throws ClientProtocolException, IOException;
	
	/**
	 * agrega la donacion
	 * @param dataDonacion
	 * @return
	 */
	public DataResponse addDonation(DataDonation dataDonacion);
	
	/**
	 * agrega la transfusion
	 * @param dataDonacion
	 * @return
	 */
	public DataResponse addTransfusion(DataTransfusion dataTransfusion);

	/**
	 * Devuelve los generos 
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getGenderCodes() throws ClientProtocolException, IOException;
	
	/**
	 * Devuelve los valores positivo y negativo 
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataCode> getResultsCodes() throws ClientProtocolException, IOException;
	
	/**
	 * Devuelve los bancos con que el centro que de la persona que esta logueada tiene convenios 
	 * @return
	 * @throws URISyntaxException 
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataBank> getArrangementBanks(String string) throws URISyntaxException;

	/**
	 * Devuelve las instituciones con que el centro que la persona que esta logueada tiene convenios 
	 * @return
	 * @throws URISyntaxException 
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataInstitution> getArrangementInstitutions(String string) throws URISyntaxException;

	/**
	 * Devuelve el File con los datos de la OMS. 
	 * @param statictic
	 * @return
	 */
	public InputStream getOmsStatistics(DataOmsStatistics statictic);

	/**
	 * Devuelve las personas que cumplen con los filtros pasados.
	 * @param filterName
	 * @param filterDocumentNumber
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataPerson> getPersons(String filterName, String filterDocumentNumber) throws ClientProtocolException, IOException;

	/**
	 * Devuelve los filtros para la busqueda de donaciones y tranfusiones
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataSearchFilter> getSearchFilters() throws ClientProtocolException, IOException;

	/**
	 * Devuelve las donaciones para los filtros pasados por parametro.
	 * @param filters
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataDonation> getDonations(List<DataSearchFilter> filters) throws ClientProtocolException, IOException;

	/**
	 * Devuelve las transfusiones para los filtros pasados por parametro.
	 * @param filters
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public List<DataTransfusion> getTransfusions(List<DataSearchFilter> filters) throws IOException;
}
