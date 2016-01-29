package org.hemologica.dao;

import org.hemologica.dao.exceptions.DAOException;
import org.hemologica.dao.model.CountriesCode;
import org.hemologica.dao.model.Document;
import org.hemologica.dao.model.DocumentsTypesCode;

public interface IDocumentDAO extends IGenericDAO<Document>{

	public boolean existDocument(Document d) throws DAOException;
	
	public Document find(String documentNumber, CountriesCode countryCode, DocumentsTypesCode docType) throws DAOException;
	
}
