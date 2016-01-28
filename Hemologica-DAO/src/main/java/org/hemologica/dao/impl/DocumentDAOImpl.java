package org.hemologica.dao.impl;

import javax.persistence.EntityManager;

import org.hemologica.dao.IDocumentDAO;
import org.hemologica.dao.model.Document;

public class DocumentDAOImpl extends GenericDAOImpl<Document> implements IDocumentDAO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public DocumentDAOImpl(EntityManager em) {
		super(em);
	}

	
}
