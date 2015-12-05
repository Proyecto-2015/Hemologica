package org.hemologica.dao;

import java.util.HashMap;
import java.util.List;

import org.hemologica.dao.model.Person;

public interface IPersonDAO extends IGenericDAO<Person>{
	
	/**
	 * whereFIlters son los where de la consulta sql.
	 * Ej: {(ci,"78956"),(telephone,98706)}
	 */
	List<Person> getPersonsFilters(HashMap<String, Object> whereFilters);

	Person getPersonsId(Long id);

}
