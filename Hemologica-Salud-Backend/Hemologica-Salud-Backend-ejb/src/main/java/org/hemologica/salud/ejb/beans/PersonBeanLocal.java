package org.hemologica.salud.ejb.beans;

import java.util.HashMap;
import java.util.List;
import javax.ejb.Local;
import org.hemologica.datatypes.DataPerson;

@Local
public interface PersonBeanLocal {
	
	List<DataPerson> getPersonsFilters(HashMap<String, Object> whereFilters);

	DataPerson getPersonId(String id);

	
}
