package org.hemologica.dao.impl;

import javax.persistence.EntityManager;

import org.hemologica.dao.IGenericDAO;

public abstract class GenericDAOImpl<T> implements IGenericDAO<T>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2784405517190179877L;
	
	protected EntityManager em;
	
	public GenericDAOImpl(EntityManager em){
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