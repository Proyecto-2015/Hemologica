package org.hemologica.yodono.web.rest.client;

import java.io.IOException;
import java.util.List;

import org.hemologica.datatypes.DataDonacion;

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
	 * Devulve la lista de donaciones del usuario pasado como parametro.
	 * @param user
	 * @return
	 * @throws IOException 
	 */
	public List<DataDonacion> getMyDonations(String user) throws IOException;
	
}
