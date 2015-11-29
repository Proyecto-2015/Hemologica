package org.hemologica.salud.ejb.beans.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hemologica.dao.enums.DataDonationStateEnum;
import org.hemologica.dao.model.CitiesCode;
import org.hemologica.dao.model.CountriesCode;
import org.hemologica.dao.model.DocumentsTypesCode;
import org.hemologica.dao.model.DonationEventsCode;
import org.hemologica.dao.model.DonationFailCausesCode;
import org.hemologica.dao.model.DonationFailTypeCode;
import org.hemologica.dao.model.DonationLaboratoyCode;
import org.hemologica.dao.model.EventSeverityCode;
import org.hemologica.dao.model.MessageSendOption;
import org.hemologica.dao.model.StatesCode;
import org.hemologica.dao.model.TransfusionEventsCode;
import org.hemologica.dao.model.TransfusionLaboratoryCode;
import org.hemologica.dao.model.UnitsType;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataMessageOption;
import org.hemologica.datatypes.DataProductType;
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

		for(DataDonationStateEnum a : DataDonationStateEnum.getStates()){
			
			DataCode dataCode = new DataCode();
			dataCode.setCode(a.getValue());
			dataCode.setDisplayName(a.getLabel());
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
}
