package org.hemologica.dao;

import java.util.List;
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
import org.hemologica.dao.model.StatesCode;
import org.hemologica.dao.model.TransfusionEventsCode;
import org.hemologica.dao.model.TransfusionFilterCode;
import org.hemologica.dao.model.TransfusionLaboratoryCode;
import org.hemologica.dao.model.UnitsType;

public interface ICodesDAO {
	
	public List<Object[]> executeSQL(String sql);
	
	public List<MessageSendOption> getMessageOptions();
	
	public List<UnitsType> getProducts();
	
	public List<DocumentsTypesCode> getDocumentsTypes();
	
	public List<CountriesCode> getCountries();
	
	public List<StatesCode> getStatesCode();
	
	public List<CitiesCode> getCities();

	public List<CitiesCode> getCitiesByState(String stateCode);

	public List<DonationFailTypeCode> getRejectionTypes();

	public List<DonationFailCausesCode> getRejectionReasons();

	public List<DonationLaboratoyCode> getDonationsAnalysis();

	public List<DonationEventsCode> getDonationsEvents();

	public List<ResponsibleTransfusionPerson> getResponsibleTransfusionPerson(String centerCode);

	public List<TransfusionLaboratoryCode> getTransfusionsAnalysis();

	public List<TransfusionEventsCode> getTransfusionsEvents();

	public CitiesCode getCitiesByCode(String code);

	public StatesCode getStatesCodeByCode(String code);

	public DonationTypesCode getDonationTypeByCode(String donationType);

	public DonationTypesCode getDonationTypeBySnomedCode(String donationType);

	public List<EventSeverityCode> getSeverities();

	public DonationEventsCode getDonationEventBySnomedCode(String event);

	public EventSeverityCode getSeverityBySnomedCode(String severity);

	public DonationLaboratoyCode getDonationsAnalysisBySnomedCode(String analisisCode);

	public ResultsCode getBooleanResultBySnomedCode(String resultCode);

	public DonationFailCausesCode getRejectionCauseBySnomedCode(String rejectionCode);

	public DonationFailTypeCode getRejectionTypesBySnomedCode(String rejectionType);

	public UnitsType getProductBySnomedCode(String componentCode);

	public TransfusionEventsCode getTransfusionEventBySnomedCode(String event);

	public TransfusionLaboratoryCode getTransfusionAnalysisBySnomedCode(String executeXPathString);

	public List<BloodTypes> getBloodTypes();

	public List<DonationStateCode> getDonationsStates();

	public List<DonationFilterCode> getDonationsFilters();

	public DonationFilterCode getDonationsFilterById(String code);

	public List<TransfusionFilterCode> getTransfusionsFilters();
	
	public TransfusionFilterCode getTransfusionFilterById(String code);

	public List<DonationDonorTypesCode> getDonorTypes();

	public List<DonationTypesCode> getDonationTypes();

	public List<GenderCode> getGenderCodes();

	public DonationEventsCode getDonationsEventById(String code);

	public EventSeverityCode getSeverityById(String code);

	public DonationFailCausesCode getRejectionCauseById(String code);

	public DonationFailTypeCode getRejectionTypesById(String code);

	public DonationLaboratoyCode getDonationsAnalysisById(String code);

	public ResultsCode getSnomedCodeByBooleanResult(Boolean result);
	
	public ResultsCode getResultById(String result);

	public UnitsType getProductById(String code);

	public TransfusionEventsCode getTransfusionEventById(String code);

	public TransfusionLaboratoryCode getTransfusionAnalysisById(String code);

	public List<ResultsCode> getResultsCodes();

	public ResultsCode getResultBySnomedCode(String executeXPathString);

	public Long getNewCDAid();

	public Long getNewHcCDAid();

	public BloodTypes getBloodTypeCodeBySnomedCode(String bloodType);

	public List<SearchFilterCode> getSearchFilters();

	public SearchFilterCode getSearchFilterByCode(String code);

	public GenderCode getGenderCodeById(String genderCode);

	public DocumentsTypesCode getDocumentsTypeByCode(String documentTypeS);

	public CountriesCode getCountryByCode(String documentCountryS);

}
