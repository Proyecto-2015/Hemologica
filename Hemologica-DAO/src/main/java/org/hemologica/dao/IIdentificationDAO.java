package org.hemologica.dao;

import java.util.List;

import org.hemologica.dao.model.Identification;
import org.hemologica.dao.model.IdentificationsHistory;


public interface IIdentificationDAO{

	public Identification getIdentificationById(Long id);
	
	public Identification getIdentificationByCode(String code);
	
	public Identification create(Identification entity);
	
	public Identification update(Identification entity);
	
	public void delete(Identification entity);
	
	public void refresh(Identification entity);
	
	public IdentificationsHistory getIdentificationsHistoryById(Long id);
	
	public IdentificationsHistory getIdentificationsHistoryByCode(String code);
	
	public IdentificationsHistory create(IdentificationsHistory entity);
	
	public IdentificationsHistory update(IdentificationsHistory entity);
	
	public void delete(IdentificationsHistory entity);
	
	public void refresh(IdentificationsHistory entity);
	
	public void fix(Identification id, List<Identification> ids);
	
	public void fixIdentifiersWithDatabase(Identification id, List<Identification> ids);
	
}
