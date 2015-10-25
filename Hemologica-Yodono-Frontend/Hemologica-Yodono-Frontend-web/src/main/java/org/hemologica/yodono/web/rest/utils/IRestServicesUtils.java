package org.hemologica.yodono.web.rest.utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;

public interface IRestServicesUtils {
	
	/**
	 * Realiza un llamado post al servicio web en url con el objeto en el contenido del mensaje
	 * @param url - ruta al servicio web
	 * @param o - Objeto
	 * @return Devuleve un String en formato JSON.
	 * @throws IOException 
	 */
	public String post(String url, Object o) throws IOException;
	
	/**
	 * Realiza un llamado get al servicio web en url con el objeto en el contenido del mensaje
	 * @param url - ruta al servicio web
	 * @param o - Objeto
	 * @return Devuleve un String en formato JSON.
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 * @throws URISyntaxException 
	 */
	public String get(String url, HashMap<String, String> parameters) throws ClientProtocolException, IOException, URISyntaxException;
	
	/**
	 * Realiza un llamado put al servicio web en url con el objeto en el contenido del mensaje
	 * @param url - ruta al servicio web
	 * @param o - Objeto
	 * @return Devuleve un String en formato JSON.
	 * @throws IOException 
	 */
	public String put(String url, Object o) throws IOException;
}
