package org.hemologica.dao;

import java.util.List;

import org.hemologica.dao.model.Institution;

public interface IInstitutionDAO  extends IGenericDAO<Institution>{
	
	public List<Institution> getInstitutions();

}
