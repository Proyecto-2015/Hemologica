package org.hemologica.service.business;

import java.util.Map;

import org.hemologica.dao.model.Person;

public interface IPersonBean{
	
	
	public Person processCDAwithEMPIandDatabases(Map<String,String> data, String cda) throws Exception;

}
