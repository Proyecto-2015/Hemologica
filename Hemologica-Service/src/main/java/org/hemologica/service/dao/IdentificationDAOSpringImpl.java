//package org.hemologica.service.dao;
//
//import java.util.ArrayList;
//import java.util.List;
//import org.hemologica.dao.IIdentificationDAO;
//import org.hemologica.dao.model.Identification;
//import org.hemologica.dao.model.IdentificationsHistory;
//import org.hemologica.dao.model.PersonsRecord;
//import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
//import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
//import org.springframework.transaction.annotation.Transactional;

//public class IdentificationDAOSpringImpl extends HibernateDaoSupport implements IIdentificationDAO {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	@Override
//	public Identification create(Identification entity) {
//		super.getHibernateTemplate().persist(entity);
//		return entity;
//	}
//
//	@Override
//	public Identification update(Identification entity) {
//		super.getHibernateTemplate().update(entity);
//		return entity;
//	}
//
//	@Override
//	public void delete(Identification entity) {
//		super.getHibernateTemplate().delete(entity);
//	}
//
//	@Override
//	public void refresh(Identification entity) {
//		super.getHibernateTemplate().refresh(entity);
//	}
//
//	@Override
//	public IdentificationsHistory create(IdentificationsHistory entity) {
//		super.getHibernateTemplate().persist(entity);
//		return entity;
//	}
//
//	@Override
//	public IdentificationsHistory update(IdentificationsHistory entity) {
//		super.getHibernateTemplate().update(entity);
//		return entity;
//	}
//
//	@Override
//	public void delete(IdentificationsHistory entity) {
//		super.getHibernateTemplate().delete(entity);
//
//	}
//
//	@Override
//	public void refresh(IdentificationsHistory entity) {
//		super.getHibernateTemplate().refresh(entity);
//
//	}
//
//	@Override
//	public Identification getIdentificationById(Integer id) {
//		return this.getHibernateTemplate().get(Identification.class, id);
//	}
//
//	@Override
//	public Identification getIdentificationByCode(String code) {
//		List<?> res = super.getHibernateTemplate()
//				.findByValueBean("SELECT i FROM Identification i WHERE i.identificationCode = :code", code);
//		if (res != null && res.size() > 0) {
//			return (Identification) res.get(0);
//		}
//		return null;
//	}
//
//	@Override
//	public IdentificationsHistory getIdentificationsHistoryById(Integer id) {
//		return this.getHibernateTemplate().get(IdentificationsHistory.class, id);
//	}
//
//	@Override
//	public IdentificationsHistory getIdentificationsHistoryByCode(String code) {
//		List<?> res = super.getHibernateTemplate()
//				.findByValueBean("SELECT i FROM IdentificationsHistory i WHERE i.identificationCode = :code", code);
//		if (res != null && res.size() > 0) {
//			return (IdentificationsHistory) res.get(0);
//		}
//		return null;
//	}
//
//	@Override
//	@Transactional
//	public void fix(Identification id, List<Identification> ids) {
//		
//		//Auxiliar para recorrer
//		IdentificationsHistory idH;
//		
//		//Cargo para que quede en el contexto de persistencia
//		id = this.getIdentificationById(id.getId());
//		
//		//Para cada id de los que tengo que arreglar
//		for (Identification idToFix : ids) {
//			
//			//Si no es el id que elegi
//			if (id.getId() != idToFix.getId()) {
//				
//				//Cargo para que quede en el contexto de persistencia
//				idToFix = this.getIdentificationById(idToFix.getId());
//				
//				//Actualizo los personrecords asociados al id que elegi
//				for (PersonsRecord record : idToFix.getPersonsRecords()) {
//					record.setIdentification(id);
//				}
//				
//				//Obtengo el id historico
//				idH = this.getIdentificationsHistoryByCode(idToFix.getIdentificacionCode());
//				
//				//si no esta, lo creo y lo guardo
//				if(idH == null){
//					idH = new IdentificationsHistory();
//					idH.setIdentification(id);
//					this.create(idH);
//					
//				//si esta, actualizo el id de referencia por las dudas
//				}else{
//					idH.setIdentification(id);
//					this.update(idH);
//				}
//			
//				//borrar identification
//				this.delete(idToFix);
//				
//			}
//			
//		}
//
//	}
//
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
//
//}
