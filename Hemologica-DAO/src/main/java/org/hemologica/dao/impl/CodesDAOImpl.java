package org.hemologica.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hemologica.constants.Constants;
import org.hemologica.dao.ICodesDAO;
import org.hemologica.dao.model.BloodTypes;
import org.hemologica.dao.model.CitiesCode;
import org.hemologica.dao.model.CountriesCode;
import org.hemologica.dao.model.DocumentsTypesCode;
import org.hemologica.dao.model.DonationDonorTypesCode;
import org.hemologica.dao.model.DonationEventsCode;
import org.hemologica.dao.model.DonationFailCausesCode;
import org.hemologica.dao.model.DonationFailTypeCode;
import org.hemologica.dao.model.DonationFilterCode;
import org.hemologica.dao.model.DonationLaboratoyCode;
import org.hemologica.dao.model.DonationStateCode;
import org.hemologica.dao.model.DonationTypesCode;
import org.hemologica.dao.model.EventSeverityCode;
import org.hemologica.dao.model.GenderCode;
import org.hemologica.dao.model.MessageSendOption;
import org.hemologica.dao.model.ResponsibleTransfusionPerson;
import org.hemologica.dao.model.ResultsCode;
import org.hemologica.dao.model.SearchFilterCode;
import org.hemologica.dao.model.Sequencer;
import org.hemologica.dao.model.StatesCode;
import org.hemologica.dao.model.TransfusionEventsCode;
import org.hemologica.dao.model.TransfusionFilterCode;
import org.hemologica.dao.model.TransfusionLaboratoryCode;
import org.hemologica.dao.model.UnitsType;
import org.hemologica.factories.FactoryDAO;

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
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (CitiesCode) list.get(0) : null;
	}

	public StatesCode getStatesCodeByCode(String code) {
		Query query = em.createNamedQuery("StatesCode.findByCode");
		query.setParameter("code", code);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (StatesCode) list.get(0) : null;
	}

	public DonationTypesCode getDonationTypeByCode(String donationCode) {
		
		Query query = em.createNamedQuery("DonationTypesCode.findById");
		query.setParameter("code", donationCode);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (DonationTypesCode) list.get(0) : null;
	}

	public DonationTypesCode getDonationTypeBySnomedCode(String donationCode) {
		
		Query query = em.createNamedQuery("DonationTypesCode.findBySnomedCode");
		query.setParameter("code", donationCode);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (DonationTypesCode) list.get(0) : null;
	}

	@SuppressWarnings("unchecked")
	public List<EventSeverityCode> getSeverities() {
		
		Query query = em.createNamedQuery("EventSeverityCode.findAll");
		return query.getResultList();
	}
	
	public EventSeverityCode getSeverityBySnomedCode(String severityCode) {
		
		Query query = em.createNamedQuery("EventSeverityCode.findBySnomedCode");
		query.setParameter("code", severityCode);
		
		List<?> list = query.getResultList();
		
		return (!list.isEmpty()) ? (EventSeverityCode) list.get(0) : null;
	}

	public DonationEventsCode getDonationEventBySnomedCode(String event) {
		
		Query query = em.createNamedQuery("DonationEventsCode.findBySnomedCode");
		query.setParameter("code", event);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (DonationEventsCode) list.get(0) : null;
	}

	public DonationLaboratoyCode getDonationsAnalysisBySnomedCode(String analisisCode) {
		
		Query query = em.createNamedQuery("DonationLaboratoyCode.findBySnomedCode");
		query.setParameter("code", analisisCode);

		List<?> list = query.getResultList();		
		return (!list.isEmpty()) ? (DonationLaboratoyCode) list.get(0) : null;
		
	}

	public ResultsCode getBooleanResultBySnomedCode(String resultCode) {
		
		Query query = em.createNamedQuery("ResultsCode.findBySnomedCode");
		query.setParameter("code", resultCode);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (ResultsCode) list.get(0) : null;
	}

	public DonationFailCausesCode getRejectionCauseBySnomedCode(String rejectionCode) {
		
		Query query = em.createNamedQuery("DonationFailCausesCode.findBySnomedCode");
		query.setParameter("code", rejectionCode);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (DonationFailCausesCode) list.get(0) : null;
	}

	public DonationFailTypeCode getRejectionTypesBySnomedCode(String rejectionType) {
		
		Query query = em.createNamedQuery("DonationFailTypeCode.findBySnomedCode");
		query.setParameter("code", rejectionType);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (DonationFailTypeCode) list.get(0) : null;
	}

	public UnitsType getProductBySnomedCode(String componentCode) {
		
		Query query = em.createNamedQuery("UnitsType.findBySnomedCode");
		query.setParameter("code", componentCode);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (UnitsType) list.get(0) : null;
	}

	public TransfusionEventsCode getTransfusionEventBySnomedCode(String event) {
		
		Query query = em.createNamedQuery("TransfusionEventsCode.findBySnomedCode");
		query.setParameter("code", event);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (TransfusionEventsCode) list.get(0) : null;
	}

	public TransfusionLaboratoryCode getTransfusionAnalysisBySnomedCode(String executeXPathString) {
		
		Query query = em.createNamedQuery("TransfusionLaboratoryCode.findBySnomedCode");
		query.setParameter("code", executeXPathString);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (TransfusionLaboratoryCode) list.get(0) : null;
	}

	@SuppressWarnings("unchecked")
	public List<BloodTypes> getBloodTypes() {
		
		Query query = em.createNamedQuery("BloodTypes.findAll");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<DonationStateCode> getDonationsStates() {
		
		Query query = em.createNamedQuery("DonationStateCode.findAll");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<DonationFilterCode> getDonationsFilters() {
		
		Query query = em.createNamedQuery("DonationFilterCode.findAll");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Object[]> executeSQL(String sql) {
		
		Query query = em.createNativeQuery(sql);
		return query.getResultList();
	}

	public DonationFilterCode getDonationsFilterById(String code) {
		
		Query query = em.createNamedQuery("DonationFilterCode.findById");
		query.setParameter("code", code);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (DonationFilterCode) list.get(0) : null;
		
	}

	@SuppressWarnings("unchecked")
	public List<TransfusionFilterCode> getTransfusionsFilters() {
		
		Query query = em.createNamedQuery("TransfusionFilterCode.findAll");
		return query.getResultList();
	}
	
	public TransfusionFilterCode getTransfusionFilterById(String code) {
		
		Query query = em.createNamedQuery("TransfusionFilterCode.findById");
		query.setParameter("code", code);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (TransfusionFilterCode) list.get(0) : null;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<DonationDonorTypesCode> getDonorTypes() {
		
		Query query = em.createNamedQuery("DonationDonorTypesCode.findAll");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<DonationTypesCode> getDonationTypes() {
		
		Query query = em.createNamedQuery("DonationTypesCode.findAll");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<GenderCode> getGenderCodes() {
		
		Query query = em.createNamedQuery("GenderCode.findAll");
		return query.getResultList();
	}

	public DonationEventsCode getDonationsEventById(String code) {
		
		Query query = em.createNamedQuery("DonationEventsCode.findById");
		query.setParameter("code", code);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (DonationEventsCode) list.get(0) : null;
	}

	public EventSeverityCode getSeverityById(String code) {
		
		Query query = em.createNamedQuery("EventSeverityCode.findById");
		query.setParameter("code", code);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (EventSeverityCode) list.get(0) : null;
	}

	public DonationFailCausesCode getRejectionCauseById(String code) {
		
		Query query = em.createNamedQuery("DonationFailCausesCode.findBySnomedById");
		query.setParameter("code", code);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (DonationFailCausesCode) list.get(0) : null;
	}

	public DonationFailTypeCode getRejectionTypesById(String code) {
		
		Query query = em.createNamedQuery("DonationFailTypeCode.findBySnomedById");
		query.setParameter("code", code);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (DonationFailTypeCode) list.get(0) : null;
	}

	public DonationLaboratoyCode getDonationsAnalysisById(String code) {
		
		Query query = em.createNamedQuery("DonationLaboratoyCode.findById");
		query.setParameter("code", code);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (DonationLaboratoyCode) list.get(0) : null;
	}

	public ResultsCode getSnomedCodeByBooleanResult(Boolean result) {

		Query query = em.createNamedQuery("ResultsCode.findSnomedCodeByBooleanCode");
		query.setParameter("code", result);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (ResultsCode) list.get(0) : null;
	}

	public UnitsType getProductById(String code) {
		
		Query query = em.createNamedQuery("UnitsType.findById");
		query.setParameter("code", code);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (UnitsType) list.get(0) : null;
	}

	public TransfusionEventsCode getTransfusionEventById(String code) {
		
		Query query = em.createNamedQuery("TransfusionEventsCode.findById");
		query.setParameter("code", code);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (TransfusionEventsCode) list.get(0) : null;
	}

	public TransfusionLaboratoryCode getTransfusionAnalysisById(String code) {
		
		Query query = em.createNamedQuery("TransfusionLaboratoryCode.findById");
		query.setParameter("code", code);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (TransfusionLaboratoryCode) list.get(0) : null;
	}

	@SuppressWarnings("unchecked")
	public List<ResultsCode> getResultsCodes() {
		
		Query query = em.createNamedQuery("ResultsCode.findAll");
		return query.getResultList();
	}

	public ResultsCode getResultById(String result) {
		
		Query query = em.createNamedQuery("ResultsCode.findById");
		query.setParameter("code", result);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (ResultsCode) list.get(0) : null;
	}

	public ResultsCode getResultBySnomedCode(String executeXPathString) {
		
		Query query = em.createNamedQuery("ResultsCode.findBySnomedCode");
		query.setParameter("code", executeXPathString);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (ResultsCode) list.get(0) : null;
	}

	public Long getNewCDAid() {
		
		Query query = em.createNamedQuery("Sequencer.findById");
		query.setParameter("code", Constants.OID_HEMOLOGICA_CDA);
		Sequencer sequence= (Sequencer) query.getSingleResult();
			
		Long cdaId = sequence.getSequencerNumber();
		sequence.setSequencerNumber(sequence.getSequencerNumber()+1);
		FactoryDAO.getSequencerDAO(em).update(sequence);
		
		return cdaId;
	}

	public Long getNewHcCDAid() {
		
		Query query = em.createNamedQuery("Sequencer.findById");
		query.setParameter("code", Constants.OID_HCE_HEMOLOGICA_CDA);
		Sequencer sequence= (Sequencer) query.getSingleResult();
			
		Long cdaId = sequence.getSequencerNumber();
		sequence.setSequencerNumber(sequence.getSequencerNumber()+1);
		FactoryDAO.getSequencerDAO(em).update(sequence);
		
		return cdaId;
	}

	public BloodTypes getBloodTypeCodeBySnomedCode(String bloodType) {
		
		Query query = em.createNamedQuery("BloodTypes.findBySnomedCodeId");
		query.setParameter("code", bloodType);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (BloodTypes) list.get(0) : null;
	}

	@SuppressWarnings("unchecked")
	public List<SearchFilterCode> getSearchFilters() {
		
		Query query = em.createNamedQuery("SearchFilterCode.findAll");
		return query.getResultList();
		
	}

	public SearchFilterCode getSearchFilterByCode(String code) {
		
		Query query = em.createNamedQuery("SearchFilterCode.findByCode");
		query.setParameter("code", code);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (SearchFilterCode) list.get(0) : null;
	}

	public GenderCode getGenderCodeById(String genderCode) {
		
		Query query = em.createNamedQuery("GenderCode.findById");
		query.setParameter("code", genderCode);
		
		List<?> list = query.getResultList();
		return (!list.isEmpty()) ? (GenderCode) list.get(0) : null;
	}

}
