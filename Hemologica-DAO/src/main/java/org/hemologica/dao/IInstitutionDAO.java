package org.hemologica.dao;

import java.util.List;

import org.hemologica.dao.model.Institution;

public interface IInstitutionDAO  extends IGenericDAO<Institution>{
	
	public List<Institution> getInstitutions();

	public List<Institution> getInstitutionsUser(String user);

	public Institution findInstitutionByCode(String code);

}
