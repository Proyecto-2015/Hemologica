package org.hemologica.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hemologica.dao.IDocumentDAO;
import org.hemologica.dao.exceptions.DAOException;
import org.hemologica.dao.model.CountriesCode;
import org.hemologica.dao.model.Document;
import org.hemologica.dao.model.DocumentsTypesCode;

public class DocumentDAOImpl extends GenericDAOImpl<Document> implements IDocumentDAO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public DocumentDAOImpl(EntityManager em) {
		super(em);
	}


	@Override
	public boolean existDocument(Document d) throws DAOException {
		return this.find(d.getDocumentNumber(), d.getCountriesCode(), d.getDocumentsTypesCode()) != null;
	}


	@Override
	public Document find(String documentNumber, CountriesCode countryCode, DocumentsTypesCode docType)
			throws DAOException {

		try{
			
			Query q = this.em.createNamedQuery("Document.findDoc");
			q.setParameter("doc", documentNumber);
			q.setParameter("country", countryCode);
			q.setParameter("type", docType);
			List<Document> result = q.getResultList();
			if(result != null && result.size() > 0)
				return result.get(0);
			
		}catch(Exception ex){
			throw new DAOException(ex);
		}
		return null;
	}
	
	

	
}
