package org.hemologica.dao.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hemologica.dao.IIdentificationDAO;
import org.hemologica.dao.IPersonRecordDAO;
import org.hemologica.dao.converter.CryptoConverter;
import org.hemologica.dao.model.Identification;
import org.hemologica.dao.model.Person;
import org.hemologica.dao.model.PersonsRecord;
import org.hemologica.factories.FactoryDAO;

public class PersonRecordDAOImpl extends GenericDAOImpl<PersonsRecord> implements IPersonRecordDAO{

	
	private static final long serialVersionUID = 7889754275874936595L;
	
	public PersonRecordDAOImpl(EntityManager em) {
		super(em);
	}

	@SuppressWarnings("unchecked")
	public List<PersonsRecord> getCDAsUserId(Long userId) {
		
//		Query query = em.createNamedQuery("PersonsRecord.findByPersonId"); change 12-12-2015 bruno
		Query query = em.createNamedQuery("PersonsRecord.findByIdentificationRefCodes");
		Person person = em.find(Person.class, userId);
		List<String> ids = new ArrayList<String>();
		for(Identification i : person.getIdentifications()){
			ids.add(CryptoConverter.encrypt(i.getIdentificacionCode()));
		}
		query.setParameter("ids", ids);
		return (List<PersonsRecord>) query.getResultList();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PersonsRecord> getCDAsIdentificationId(Long identificationId) {
		
		Query query = em.createNamedQuery("PersonsRecord.findByIdentificationRefCode");
		IIdentificationDAO idDAO = FactoryDAO.getIIdentificationDAO(em);
		Identification id = idDAO.getIdentificationById(identificationId);
		query.setParameter("ids", CryptoConverter.encrypt(id.getIdentificacionCode()));
		return (List<PersonsRecord>) query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public PersonsRecord getCDAsRootExtension(String root, String extension) {
		
		Query query = em.createNamedQuery("PersonsRecord.findByRootExtension");
		query.setParameter("root", root);
		query.setParameter("extension", extension);
		List<PersonsRecord> prs = query.getResultList();
		return prs != null && prs.size() > 0 ? prs.get(0) : null;
	}

	
	
	
	
}
