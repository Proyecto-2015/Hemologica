package org.hemologica.service.business;

import java.util.Map;

import org.hemologica.empi.datatypes.Identifier;

public interface IPersonBean{
	
	
	public void processCDAwithEMPIandDatabases(Map<String,String> data, String cda) throws Exception;
	
}
