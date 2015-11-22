package org.hemologica.dao.impl;

import javax.persistence.EntityManager;
import org.hemologica.dao.IPersonRecordDAO;
import org.hemologica.dao.model.PersonsRecord;

public class PersonRecordDAOImpl extends GenericDAOImpl<PersonsRecord> implements IPersonRecordDAO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7889754275874936595L;
	
	public PersonRecordDAOImpl(EntityManager em) {
		super(em);
	}

}
