package org.hemologica.service.dao;

import org.hemologica.dao.IPersonDAO;
import org.hemologica.dao.model.Person;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class PersonDAOSpringImpl extends HibernateDaoSupport implements IPersonDAO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Override
	public Person create(Person entity) {
		super.getHibernateTemplate().persist(entity);
		return entity;
	}

	@Override
	public Person update(Person entity) {
		super.getHibernateTemplate().update(entity);
		return entity;
	}

	@Override
	public void delete(Person entity) {
		super.getHibernateTemplate().delete(entity);
	}

	@Override
	public void refresh(Person entity) {
		super.getHibernateTemplate().refresh(entity);
	}

	
	
}
