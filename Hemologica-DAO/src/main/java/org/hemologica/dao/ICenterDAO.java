package org.hemologica.dao;

import java.util.List;
import org.hemologica.dao.model.Center;

public interface ICenterDAO extends IGenericDAO<Center>{
	
	public List<Center> getBanks();
	
	public Center getBankById(String bankId);

	public List<Center> getBanksByInstitutionId(String code);

}
