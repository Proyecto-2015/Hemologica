package org.hemologica.yodono.web.rest.client;

import java.io.IOException;
import java.util.List;

import org.hemologica.datatypes.DataDonacion;
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
	
}
