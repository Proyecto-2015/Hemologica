/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hemologica.dao;

import javax.persistence.EntityManager;

/**
 *
 * @author bruno
 * @param <T> Entity class
 */
public class AbstractDAO<T> {
	
	protected EntityManager em;
	protected String user;
	protected String source;
	protected Class<T> entity;
	
	public AbstractDAO(EntityManager em, Class<T> entity, String user, String source){
		this.em = em;
		this.user = user;
		this.source = source;
		this.entity = entity;
	}
	
	public T findById(Object id){
		return this.em.find(this.entity, id);
	}
	
	public void persist(T o){
		this.em.persist(o);
	}
	
	public T merge(T o){
		return this.em.merge(o);
	}
	
	public void remove(T o){
		this.em.remove(o);
	}
	
	
}
