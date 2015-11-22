package org.hemologica.service.business;

import java.util.Map;

import org.hemologica.empi.datatypes.Identifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


public interface IPersonBean{
	
	
	public Identifier getID(Map<String, String> data);
	
}
