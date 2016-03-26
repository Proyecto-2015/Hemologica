package org.hemologica.dao.impl;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.hemologica.dao.IIdentificationDAO;
import org.hemologica.dao.IPersonRecordDAO;
import org.hemologica.dao.converter.CryptoConverter;
import org.hemologica.dao.model.Identification;
import org.hemologica.dao.model.Person;
import org.hemologica.dao.model.PersonsRecord;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.dao.utils.XMLUtils;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

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

	@SuppressWarnings("unchecked")
	@Override
	public int getCountDistintics(List<String[]> ids) {
		
		String queryString = "select count(1) from ( select count(1), person_record_identification_id from persons_records r where (persons_record_cda_extension, persons_record_cda_root) in (" ; 
		
		for(String[] item : ids){
			
			queryString+= "('" + item[0]+ "' , '" + item[1]+ "'),";
			
		}
		
		queryString = queryString.substring(0, queryString.length() -1);
		
		queryString += " ) group by person_record_identification_id ) as cdas ";		
		Query query = em.createNativeQuery(queryString);

		List<BigInteger> ret = query.getResultList();
		return ret != null && !ret.isEmpty() ? ret.get(0).intValue(): 0;
	}

	@Override
	public int getCountDistinticsXML(List<String> idsXML) {
		
		if(idsXML == null || idsXML.size() == 0){
			
			return 0;
		}
		
		
		try {
			
			List<String[]> ids = new ArrayList<>();
			String[] item;
			Document idDoc;
			for(String id : idsXML){
			
					idDoc = XMLUtils.stringToDocument(id);
				
				item = new String[2];
				item[0] = XMLUtils.executeXPathString(idDoc, "/id/@extension");
				item[1] = XMLUtils.executeXPathString(idDoc, "/id/@root");
				ids.add(item);
			}
			
			return this.getCountDistintics(ids);
			
		} catch (SAXException | IOException | ParserConfigurationException e) {
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return 0;
	}

	
	
	
	
}
