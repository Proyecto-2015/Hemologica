package org.hemologica.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hemologica.dao.IPersonRecordDAO;
import org.hemologica.dao.model.PersonsRecord;

public class PersonRecordDAOImpl extends GenericDAOImpl<PersonsRecord> implements IPersonRecordDAO{

	
	private static final long serialVersionUID = 7889754275874936595L;
	
	public PersonRecordDAOImpl(EntityManager em) {
		super(em);
	}

	@SuppressWarnings("unchecked")
	public List<PersonsRecord> getCDAsUserId(Long userId) {
		
		Query query = em.createNamedQuery("PersonsRecord.findByIdentificationCode");
		query.setParameter("id", userId);
		return (List<PersonsRecord>) query.getResultList();
		
	}
}
