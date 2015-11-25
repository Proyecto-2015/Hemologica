package org.hemologica.dao;

import java.util.List;
import org.hemologica.dao.model.Center;

public interface ICenterDAO extends IGenericDAO<Center>{
	
	public List<Center> getBanks();

	public List<Center> getBanksUser(String user);

}
