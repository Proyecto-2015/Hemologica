package org.hemologica.services.dao;

import org.hemologica.dao.IPersonDAO;
import org.hemologica.dao.model.Person;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class PersonDAOSpringImpl extends HibernateDaoSupport implements IPersonDAO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 269171786403624819L;
	
	@Override
	public Person create(Person entity) {
//		this.getHibernateTemplate().save(entity);
//		this.getHibernateTemplate().flush();
//		return this.getHibernateTemplate().get(Person.class, entity.getId());
		return null;
	}

	@Override
	public Person update(Person entity) {
//		this.getHibernateTemplate().update(entity);
//		this.getHibernateTemplate().flush();
//		return this.getHibernateTemplate().get(Person.class, entity.getId());
		return null;
	}

	@Override
	public void delete(Person entity) {
//		this.getHibernateTemplate().delete(entity);
	}

	@Override
	public void refresh(Person entity) {
//		this.getHibernateTemplate().refresh(entity);
	}

}
