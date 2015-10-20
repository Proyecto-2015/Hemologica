package org.hemologica.dao;

import java.io.Serializable;

public interface IGenericDAO<T> extends Serializable{

	public T create(T entity);
	
	public T update(T entity);
	
	public void delete(T entity);
	
	public void refresh(T entity);
}
