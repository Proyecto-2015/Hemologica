package org.hemologica.service.business;

import java.util.Map;

import org.hemologica.empi.datatypes.Identifier;

public interface IPersonBean{
	
	public Identifier getID(Map<String, String> data);
	
}
