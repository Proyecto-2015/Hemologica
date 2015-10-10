package org.hemologica.dao;

import javax.persistence.EntityManager;

public abstract class AbstractDAO<T>{
	
	protected EntityManager em;
	
	public AbstractDAO(EntityManager em){
		this.em = em;
	}
	
	public T create(T entity){
		this.em.persist(entity);
		return entity;
	}
	
	public T update(T entity){
		this.em.merge(entity);
		return entity;
	}
	
	public void delete(T entity){
		this.em.remove(entity);
	}
	
	public void refresh(T entity){
		this.em.refresh(entity);
	}
	
}