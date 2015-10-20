package org.hemologica.services.business;

import java.util.Map;

import org.hemologica.empi.datatypes.Identifier;

public interface PersonBean{
	
	public Identifier getID(Map<String, String> data);
	
}
