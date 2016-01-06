package org.hemologica.salud.ejb.beans.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
import org.hemologica.dao.model.ResultsCode;
import org.hemologica.dao.model.SearchFilterCode;
import org.hemologica.dao.model.StatesCode;
import org.hemologica.dao.model.TransfusionEventsCode;
import org.hemologica.dao.model.TransfusionFilterCode;
import org.hemologica.dao.model.TransfusionLaboratoryCode;
import org.hemologica.dao.model.UnitsType;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataMessageOption;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataSearchFilter;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.TransfusionFilterData;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.salud.ejb.beans.CodesBeanLocal;

/**
 * Session Bean implementation class CodesBean
 */
@Stateless
@LocalBean
public class CodesBean implements CodesBeanLocal {

	
	@PersistenceContext(unitName = "Hemologica-Salud-PU")
	private EntityManager em;
	
    public CodesBean() {
        // TODO Auto-generated constructor stub
    }
    
    public List<DataMessageOption> getMessageOptions() {
		
    	List<DataMessageOption> listReturn = new ArrayList<>();
		List<MessageSendOption> list = FactoryDAO.getCodesDAO(em).getMessageOptions();
		
		for(MessageSendOption m : list){
			
			DataMessageOption data = new DataMessageOption();
			data.setCode(m.getId());
			data.setDisplayName(m.getLabel());
			listReturn.add(data);
		}
		
		return listReturn;
		
	}
    
    @Override
	public List<DataProductType> getProducts() {
		
		List<DataProductType> listReturn = new ArrayList<>();
		List<UnitsType> list = FactoryDAO.getCodesDAO(em).getProducts();
		
		for(UnitsType unit :list){
			
			DataProductType data = new DataProductType();
			data.setCode(unit.getUnitTypeCodeValue());
			data.setDisplay(unit.getUnitTypeCodeLabel());
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<DataCode> getDocumentsTypes() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<DocumentsTypesCode> list = FactoryDAO.getCodesDAO(em).getDocumentsTypes();
		
		for(DocumentsTypesCode unit :list){
			
			DataCode data = new DataCode();
			data.setCode(unit.getDocumentsTypeCodeValue());
			data.setDisplayName(unit.getDocumentsTypeCodeLabel());
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<DataCode> getCountries() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<CountriesCode> list = FactoryDAO.getCodesDAO(em).getCountries();
		
		for(CountriesCode unit :list){
			
			DataCode data = new DataCode();
			data.setCode(unit.getCountryCodeValue());
			data.setDisplayName(unit.getCountryCodeLabel());
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<DataCode> getStates() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<StatesCode> list = FactoryDAO.getCodesDAO(em).getStatesCode();
		
		for(StatesCode unit :list){
			
			DataCode data = new DataCode();
			data.setCode(unit.getStateCode());
			data.setDisplayName(unit.getStateDisplayName());
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<DataCode> getCities() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<CitiesCode> list = FactoryDAO.getCodesDAO(em).getCities();
		
		for(CitiesCode unit :list){
			
			DataCode data = new DataCode();
			data.setCode(unit.getCityCode());
			data.setDisplayName(unit.getCityDisplayName());
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<DataCode> getCitiesByState(String stateCode) {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<CitiesCode> list = FactoryDAO.getCodesDAO(em).getCitiesByState(stateCode);
		
		for(CitiesCode unit :list){
			
			DataCode data = new DataCode();
			data.setCode(unit.getCityCode());
			data.setDisplayName(unit.getCityDisplayName());
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<DataCode> getDonationsStates() {
		
		List<DataCode> dataCodes = new ArrayList<>();
		
		List<DonationStateCode> list = FactoryDAO.getCodesDAO(em).getDonationsStates();

		for(DonationStateCode a : list){
			
			DataCode dataCode = new DataCode();
			dataCode.setCode(a.getDonationStateCodeValue());
			dataCode.setDisplayName(a.getDonationStateCodeLabel());
			dataCodes.add(dataCode);
			
		}
		return dataCodes;
		
	}

	@Override
	public List<DataCode> getRejectionTypes() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<DonationFailTypeCode> list = FactoryDAO.getCodesDAO(em).getRejectionTypes();
		
		for(DonationFailTypeCode unit :list){
			
			DataCode data = new DataCode();
			data.setCode(unit.getDonationFailCodeValue());
			data.setDisplayName(unit.getDonationFailCodeLabel());
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<DataCode> getRejectionReasons() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<DonationFailCausesCode> list = FactoryDAO.getCodesDAO(em).getRejectionReasons();
		
		for(DonationFailCausesCode unit :list){
			
			DataCode data = new DataCode();
			data.setCode(unit.getDonationFailCauseCodeValue());
			data.setDisplayName(unit.getDonationFailCauseCodeLabel());
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<DataCode> getDonationsAnalysis() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<DonationLaboratoyCode> list = FactoryDAO.getCodesDAO(em).getDonationsAnalysis();
		
		for(DonationLaboratoyCode unit :list){
			
			DataCode data = new DataCode();
			data.setCode(unit.getDonationLaboratoyCodeValue());
			data.setDisplayName(unit.getDonationLaboratoyCodeLabel());
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<DataCode> getDonationsEvents() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<DonationEventsCode> list = FactoryDAO.getCodesDAO(em).getDonationsEvents();
		
		for(DonationEventsCode unit :list){
			
			DataCode data = new DataCode();
			data.setCode(unit.getDonationEventCodeValue());
			data.setDisplayName(unit.getDonationEventCodeLabel());
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<DataCode> getSeverities() {
		
		List<DataCode> dataCodes = new ArrayList<>();
		for(EventSeverityCode a : FactoryDAO.getCodesDAO(em).getSeverities()){
			
			DataCode dataCode = new DataCode();
			dataCode.setCode(a.getEventSeverityCodeValue());
			dataCode.setDisplayName(a.getEventSeverityCodeLabel());
			dataCodes.add(dataCode);
			
		}
		return dataCodes;
	}

	@Override
	public List<DataCode> getTransfusionsAnalysis() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<TransfusionLaboratoryCode> list = FactoryDAO.getCodesDAO(em).getTransfusionsAnalysis();
		
		for(TransfusionLaboratoryCode unit :list){
			
			DataCode data = new DataCode();
			data.setCode(unit.getTransfusionLaboratoryCodeValue());
			data.setDisplayName(unit.getTransfusionLaboratoryCodeLabel());
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<DataCode> getTransfusionsEvents() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<TransfusionEventsCode> list = FactoryDAO.getCodesDAO(em).getTransfusionsEvents();
		
		for(TransfusionEventsCode unit :list){
			
			DataCode data = new DataCode();
			data.setCode(unit.getTransfusionEventCodeValue());
			data.setDisplayName(unit.getTransfusionEventCodeLabel());
			listReturn.add(data);
			
		}
		return listReturn;
	}
	
	@Override
	public DataCode getBloodTypeCodeByCode(String code) {
		
		BloodTypes blood = FactoryDAO.getbloodDAO(em).getBloodTypeCodeByCode(code);
	
		DataCode data = new DataCode();
		if(blood != null){
			data.setCode(blood.getBloodTypeCodeValue());
			data.setDisplayName(blood.getBloodTypeCodeLabel());
		}
		return data;
	}

	@Override
	public DataCode getABOBloodTypeCodeByBloodSnomedCode(String code) {

		BloodTypes blood = FactoryDAO.getbloodDAO(em).getBloodTypeCodeBySnomedCodeId(code);
		
		DataCode data = new DataCode();
		if(blood != null){
			data.setCode(blood.getBloodAboTypesCode().getBloodAboTypeCodeValue());
			data.setDisplayName(blood.getBloodAboTypesCode().getBloodAboTypeCodeLabel());
		}
		return data;
		
	}

	@Override
	public DataCode getRHBloodTypeCodeByBloodSnomedCode(String code) {
		
		BloodTypes blood = FactoryDAO.getbloodDAO(em).getBloodTypeCodeBySnomedCodeId(code);
		
		DataCode data = new DataCode();
		if(blood != null){
			data.setCode(blood.getBloodDTypesCode().getBloodDTypeCodeValue());
			data.setDisplayName(blood.getBloodDTypesCode().getBloodDTypeCodeLabel());
		}
		return data;
	}

	@Override
	public DataCode getDonationTypeByCode(String donationType) {
		
		DonationTypesCode d = FactoryDAO.getCodesDAO(em).getDonationTypeByCode(donationType);
		
		DataCode data = new DataCode();
		if(d!= null){
			data.setCode(d.getDonationTypeCodeValue());
			data.setDisplayName(d.getDonationTypeCodeLabel());
		}
		return data;
	}

	@Override
	public DataCode getDonationTypeBySnomedCode(String donationType) {
		
		DonationTypesCode d = FactoryDAO.getCodesDAO(em).getDonationTypeBySnomedCode(donationType);
		
		DataCode data = new DataCode();
		if(d != null){
			data.setCode(d.getDonationTypeCodeValue());
			data.setDisplayName(d.getDonationTypeCodeLabel());
		}
		return data;
	}

	@Override
	public DataCode getDonationEventBySnomedCode(String event) {
		
		DonationEventsCode donationEventsCode = FactoryDAO.getCodesDAO(em).getDonationEventBySnomedCode(event);
		
		DataCode eventCode = new DataCode();
		
		if(donationEventsCode != null){
			eventCode.setCode(donationEventsCode.getDonationEventCodeValue());
			eventCode.setDisplayName(donationEventsCode.getDonationEventCodeLabel());
		}
		return eventCode;
	}

	@Override
	public DataCode getSeverityBySnomedCode(String severity) {
		
		EventSeverityCode severityCode = FactoryDAO.getCodesDAO(em).getSeverityBySnomedCode(severity);
		
		DataCode eventCode = new DataCode();
		if(severityCode != null){
			
			eventCode.setCode(severityCode.getEventSeverityCodeValue());
			eventCode.setDisplayName(severityCode.getEventSeverityCodeLabel());
			
		}
		return eventCode; 
	}

	@Override
	public DataCode getDonationsAnalysisBySnomedCode(String analisisCode) {
		
		DonationLaboratoyCode severityCode = FactoryDAO.getCodesDAO(em).getDonationsAnalysisBySnomedCode(analisisCode);
		
		DataCode eventCode = new DataCode();
		if(severityCode != null){
			eventCode.setCode(severityCode.getDonationLaboratoyCodeValue());
			eventCode.setDisplayName(severityCode.getDonationLaboratoyCodeLabel());
		}
		return eventCode;
	}

	@Override
	public boolean getBooleanResultBySnomedCode(String resultCode) {
		
		ResultsCode severityCode = FactoryDAO.getCodesDAO(em).getBooleanResultBySnomedCode(resultCode);
		
		return severityCode.isBooleanValue();
	}

	@Override
	public DataCode getRejectionCauseBySnomedCode(String rejectionCode) {
		
		DonationFailCausesCode failCauses = FactoryDAO.getCodesDAO(em).getRejectionCauseBySnomedCode(rejectionCode);
		
		DataCode eventCode = new DataCode();
		if(failCauses != null){
			eventCode.setCode(failCauses.getDonationFailCauseCodeValue());
			eventCode.setDisplayName(failCauses.getDonationFailCauseCodeLabel());
		}
		return eventCode;
	}

	@Override
	public DataCode getRejectionTypesBySnomedCode(String rejectionType) {
		
		DonationFailTypeCode failCauses = FactoryDAO.getCodesDAO(em).getRejectionTypesBySnomedCode(rejectionType);
		
		DataCode eventCode = new DataCode();
		if(failCauses != null){
			eventCode.setCode(failCauses.getDonationFailCodeValue());
			eventCode.setDisplayName(failCauses.getDonationFailCodeLabel());
		}
		return eventCode;
	}

	@Override
	public DataProductType getProductBySnomedCode(String componentCode) {
		
		UnitsType failCauses = FactoryDAO.getCodesDAO(em).getProductBySnomedCode(componentCode);
		
		if(failCauses != null){
		
			DataProductType eventCode = new DataProductType();
			eventCode.setCode(failCauses.getUnitTypeCodeValue());
			eventCode.setDisplay(failCauses.getUnitTypeCodeLabel());
			return eventCode;
		}
		return null;
		
	}

	@Override
	public DataCode getTransfusionEventBySnomedCode(String event) {
		
		TransfusionEventsCode donationEventsCode = FactoryDAO.getCodesDAO(em).getTransfusionEventBySnomedCode(event);
		
		DataCode eventCode = new DataCode();
		
		if(donationEventsCode != null){
			eventCode.setCode(donationEventsCode.getTransfusionEventCodeValue());
			eventCode.setDisplayName(donationEventsCode.getTransfusionEventCodeLabel());
		}
		return eventCode;
	}

	@Override
	public DataCode getTransfusionAnalysisBySnomedCode(String executeXPathString) {
		
		TransfusionLaboratoryCode donationEventsCode = FactoryDAO.getCodesDAO(em).getTransfusionAnalysisBySnomedCode(executeXPathString);
		
		DataCode eventCode = new DataCode();
		if(donationEventsCode != null){
			eventCode.setCode(donationEventsCode.getTransfusionLaboratoryCodeValue());
			eventCode.setDisplayName(donationEventsCode.getTransfusionLaboratoryCodeLabel());
		}
		return eventCode;
	}

	@Override
	public List<DataCode> getBloodTypes() {

		List<DataCode> listReturn = new ArrayList<>();
		List<BloodTypes> list = FactoryDAO.getCodesDAO(em).getBloodTypes();
		
		for(BloodTypes bloodType :list){
			
			DataCode data = new DataCode();
			data.setCode(bloodType.getBloodTypeCodeValue());
			data.setDisplayName(bloodType.getBloodTypeCodeLabel());
			listReturn.add(data);
			
		}
		return listReturn;

	}

	@Override
	public List<DonationFilterData> getDonationsFilters() {
		
		List<DonationFilterData> listReturn = new ArrayList<>();
		List<DonationFilterCode> list = FactoryDAO.getCodesDAO(em).getDonationsFilters();
		
		for(DonationFilterCode filter :list){
			
			DonationFilterData data = new DonationFilterData();
			data.setCode(filter.getDonationFilterCodesValue());
			data.setDisplayName(filter.getDonationFilterCodesLabel());
			
			List<DonationFilterData> listOptions = new ArrayList<>();
			
			if(filter.getDonationFilterCodesSql()!= null && !filter.getDonationFilterCodesSql().equals("")){
				
				List<Object[]> options = FactoryDAO.getCodesDAO(em).executeSQL(filter.getDonationFilterCodesSql());
				for(Object[] optionItem : options){
					
					String value = null,label = null;
					if(optionItem[0] != null){
						value = (String) optionItem[0];
					}
					if(optionItem[1]  != null){
						label = (String) optionItem[1];
					}
					DonationFilterData dataCode = new DonationFilterData();
					dataCode.setCode(value);
					dataCode.setDisplayName(label);
					listOptions.add(dataCode);	
				}
			}
			data.setOptions(listOptions);
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<TransfusionFilterData> getTransfusionsFilters() {
		
		List<TransfusionFilterData> listReturn = new ArrayList<>();
		List<TransfusionFilterCode> list = FactoryDAO.getCodesDAO(em).getTransfusionsFilters();
		
		for(TransfusionFilterCode filter :list){
			
			TransfusionFilterData data = new TransfusionFilterData();
			data.setCode(filter.getTransfusionFilterCodesValue());
			data.setDisplayName(filter.getTransfusionFilterCodesLabel());
			
			List<TransfusionFilterData> listOptions = new ArrayList<>();
			
			if(filter.getTransfusionFilterCodesSql()!= null && !filter.getTransfusionFilterCodesSql().equals("")){
				
				List<Object[]> options = FactoryDAO.getCodesDAO(em).executeSQL(filter.getTransfusionFilterCodesSql());
				for(Object[] optionItem : options){
					
					String value = null,label = null;
					if(optionItem[0] != null){
						value = (String) optionItem[0];
					}
					if(optionItem[1]  != null){
						label = (String) optionItem[1];
					}
					TransfusionFilterData dataCode = new TransfusionFilterData();
					dataCode.setCode(value);
					dataCode.setDisplayName(label);
					listOptions.add(dataCode);	
				}
			}
			data.setOptions(listOptions);
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<DataCode> getDonationTypes() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<DonationTypesCode> list = FactoryDAO.getCodesDAO(em).getDonationTypes();
		
		for(DonationTypesCode bloodType :list){
			
			DataCode data = new DataCode();
			data.setCode(bloodType.getDonationTypeCodeValue());
			data.setDisplayName(bloodType.getDonationTypeCodeLabel());
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<DataCode> getDonorTypes() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<DonationDonorTypesCode> list = FactoryDAO.getCodesDAO(em).getDonorTypes();
		
		for(DonationDonorTypesCode bloodType :list){
			
			DataCode data = new DataCode();
			data.setCode(bloodType.getDonationDonorTypeCodeValue());
			data.setDisplayName(bloodType.getDonationDonorTypeCodeLabel());
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<DataCode> getGenderCodes() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<GenderCode> list = FactoryDAO.getCodesDAO(em).getGenderCodes();
		
		for(GenderCode bloodType :list){
			
			DataCode data = new DataCode();
			data.setCode(bloodType.getGenderCodeValue());
			data.setDisplayName(bloodType.getGenderCodeLabel());
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public List<DataCode> getResultsCodes() {
		
		List<DataCode> listReturn = new ArrayList<>();
		List<ResultsCode> list = FactoryDAO.getCodesDAO(em).getResultsCodes();
		
		for(ResultsCode bloodType :list){
			
			DataCode data = new DataCode();
			data.setCode(bloodType.getResultsCodeValue());
			data.setDisplayName(bloodType.getResultsCodeLabel());
			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public DataCode getResultBySnomedCode(String executeXPathString) {
		
		ResultsCode result = FactoryDAO.getCodesDAO(em).getResultBySnomedCode(executeXPathString);

		DataCode data = new DataCode();
		if(result != null){
			data.setCode(result.getResultsCodeValue());
			data.setDisplayName(result.getResultsCodeLabel());
		}
		return data;
	}

	@Override
	public String getNewCDAid() {
		
		Long cdaId = FactoryDAO.getCodesDAO(em).getNewCDAid();
		
		return String.valueOf(cdaId);
		
	}

	@Override
	public String getNewHcCDAid() {
		
		Long cdaId = FactoryDAO.getCodesDAO(em).getNewHcCDAid();
		
		return String.valueOf(cdaId);
	}

	@Override
	public DataCode getBloodTypeCodeBySnomedCode(String bloodType) {
		
		BloodTypes result = FactoryDAO.getCodesDAO(em).getBloodTypeCodeBySnomedCode(bloodType);

		DataCode data = new DataCode();
		
		if(result != null){
			data.setCode(result.getBloodTypeCodeValue());
			data.setDisplayName(result.getBloodTypeCodeLabel());
		}
		return data;
	}

	@Override
	public List<DataSearchFilter> getSearchFilters() {
		
		List<DataSearchFilter> listReturn = new ArrayList<>();
		List<SearchFilterCode> list = FactoryDAO.getCodesDAO(em).getSearchFilters();
		
		for(SearchFilterCode filter :list){
			
			DataSearchFilter data = new DataSearchFilter();
			data.setCode(filter.getSearchFilterCodesValue());
			data.setDisplayName(filter.getSearchFilterCodesLabel());

			listReturn.add(data);
			
		}
		return listReturn;
	}

	@Override
	public DataCode getGenderCodeById(String genderCode) {
		
		GenderCode gender = FactoryDAO.getCodesDAO(em).getGenderCodeById(genderCode);
		
		DataCode data = new DataCode();
		if(gender != null){
			
			data.setCode(gender.getGenderCodeValue());
			data.setDisplayName(gender.getGenderCodeLabel());
			
		}
		return data;
	}

	@Override
	public DataCode getDonorTypeById(String donorType) {
		
		DonationDonorTypesCode donorTypeCode = FactoryDAO.getCodesDAO(em).getDonorTypeById(donorType);
		
		DataCode data = new DataCode();
		if(donorTypeCode != null){
			
			data.setCode(donorTypeCode.getDonationDonorTypeCodeValue());
			data.setDisplayName(donorTypeCode.getDonationDonorTypeCodeLabel());
			
		}
		return data;
	}
}
