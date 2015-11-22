//package org.hemologica.service.dao;
//
//import org.hemologica.dao.IPersonRecordDAO;
//import org.hemologica.dao.model.PersonsRecord;
//import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
//
//public class PersonRecordDAOSpringImpl extends HibernateDaoSupport implements IPersonRecordDAO{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//
//	@Override
//	public PersonsRecord create(PersonsRecord entity) {
//		super.getHibernateTemplate().persist(entity);
//		return entity;
//	}
//
//	@Override
//	public PersonsRecord update(PersonsRecord entity) {
//		super.getHibernateTemplate().update(entity);
//		return entity;
//	}
//
//	@Override
//	public void delete(PersonsRecord entity) {
//		super.getHibernateTemplate().delete(entity);
//	}
//
//	@Override
//	public void refresh(PersonsRecord entity) {
//		super.getHibernateTemplate().refresh(entity);
//	}
//
//	
//	
//}
