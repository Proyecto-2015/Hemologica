package org.hemologica.dao.impl;

import javax.persistence.EntityManager;

import org.hemologica.dao.IGenericDAO;
import org.hemologica.dao.model.Person;

public class PersonDAOImpl extends GenericDAOImpl<Person> implements IGenericDAO<Person>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7889754275874936595L;
	
	public PersonDAOImpl(EntityManager em) {
		super(em);
	}

}
