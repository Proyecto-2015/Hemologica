package org.hemologica.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hemologica.dao.ICodesDAO;
import org.hemologica.dao.model.CitiesCode;
import org.hemologica.dao.model.CountriesCode;
import org.hemologica.dao.model.DocumentsTypesCode;
import org.hemologica.dao.model.DonationEventsCode;
import org.hemologica.dao.model.DonationFailCausesCode;
import org.hemologica.dao.model.DonationFailTypeCode;
import org.hemologica.dao.model.DonationLaboratoyCode;
import org.hemologica.dao.model.MessageSendOption;
import org.hemologica.dao.model.ResponsibleTransfusionPerson;
import org.hemologica.dao.model.StatesCode;
import org.hemologica.dao.model.TransfusionEventsCode;
import org.hemologica.dao.model.TransfusionLaboratoryCode;
import org.hemologica.dao.model.UnitsType;

public class CodesDAOImpl implements ICodesDAO{

	protected EntityManager em;
	
	public CodesDAOImpl(EntityManager em ) {
		
		this.em = em;

	}
	
	@SuppressWarnings("unchecked")
	public List<MessageSendOption> getMessageOptions() {
		
		Query query = em.createNamedQuery("MessageSendOption.findAll");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<UnitsType> getProducts() {
		
		Query query = em.createNamedQuery("UnitsType.findAll");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<DocumentsTypesCode> getDocumentsTypes() {
		
		Query query = em.createNamedQuery("DocumentsTypesCode.findAll");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<CountriesCode> getCountries() {

		Query query = em.createNamedQuery("CountriesCode.findAll");
		return query.getResultList();
 
	}

	@SuppressWarnings("unchecked")
	public List<StatesCode> getStatesCode() {
		
		Query query = em.createNamedQuery("StatesCode.findAll");
		return query.getResultList();
		
	}

	@SuppressWarnings("unchecked")
	public List<CitiesCode> getCities() {
		
		Query query = em.createNamedQuery("CitiesCode.findAll");
		return query.getResultList();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<CitiesCode> getCitiesByState(String stateCode) {
		
		Query query = em.createNamedQuery("CitiesCode.getCitiesByStateCode");
		query.setParameter("code", stateCode);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<DonationFailTypeCode> getRejectionTypes() {
		
		Query query = em.createNamedQuery("DonationFailTypeCode.findAll");
		return query.getResultList();
		
	}

	@SuppressWarnings("unchecked")
	public List<DonationFailCausesCode> getRejectionReasons() {
		
		Query query = em.createNamedQuery("DonationFailCausesCode.findAll");
		return query.getResultList();
		
	}

	@SuppressWarnings("unchecked")
	public List<DonationLaboratoyCode> getDonationsAnalysis() {
		
		Query query = em.createNamedQuery("DonationLaboratoyCode.findAll");
		return query.getResultList();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<DonationEventsCode> getDonationsEvents() {
		
		Query query = em.createNamedQuery("DonationEventsCode.findAll");
		return query.getResultList();
		
	}

	@SuppressWarnings("unchecked")
	public List<ResponsibleTransfusionPerson> getResponsibleTransfusionPerson() {
		
		Query query = em.createNamedQuery("ResponsibleTransfusionPerson.findAll");
		return query.getResultList();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<ResponsibleTransfusionPerson> getResponsibleTransfusionPerson(String centerCode) {
		
		Query query = em.createNamedQuery("ResponsibleTransfusionPerson.getResponsibleByCenter");
		query.setParameter("code", centerCode);
		return query.getResultList();
		
	}

	@SuppressWarnings("unchecked")
	public List<TransfusionLaboratoryCode> getTransfusionsAnalysis() {
		
		Query query = em.createNamedQuery("TransfusionLaboratoryCode.findAll");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<TransfusionEventsCode> getTransfusionsEvents() {
		
		Query query = em.createNamedQuery("TransfusionEventsCode.findAll");
		return query.getResultList();
		
	}

	public CitiesCode getCitiesByCode(String code) {
		
		Query query = em.createNamedQuery("CitiesCode.getCitiesByCode");
		query.setParameter("code", code);
		return (CitiesCode) query.getSingleResult();
	}

	public StatesCode getStatesCodeByCode(String code) {
		Query query = em.createNamedQuery("StatesCode.findByCode");
		query.setParameter("code", code);
		return (StatesCode) query.getSingleResult();
	}

}
