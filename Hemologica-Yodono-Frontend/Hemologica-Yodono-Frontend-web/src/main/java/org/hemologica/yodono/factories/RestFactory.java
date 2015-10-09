package org.hemologica.yodono.factories;

import org.hemologica.yodono.web.rest.client.IServicesClient;
import org.hemologica.yodono.web.rest.client.ServicesClientImpl;
import org.hemologica.yodono.web.rest.utils.IRestServicesUtils;
import org.hemologica.yodono.web.rest.utils.RestServicesUtilsImpl;

public class RestFactory {
	
	private static IServicesClient servicesClient;
	private static IRestServicesUtils restServicesUtils;
	
	public static IRestServicesUtils getRestServicesUtils() {
		
		if(restServicesUtils == null){
			
			return new RestServicesUtilsImpl();
			
		}
		return restServicesUtils;
	}
	
	public static IServicesClient getServicesClient() {
		
		if(servicesClient == null){
			
			 return new ServicesClientImpl();
			 
		}
		return servicesClient;
	}
}
