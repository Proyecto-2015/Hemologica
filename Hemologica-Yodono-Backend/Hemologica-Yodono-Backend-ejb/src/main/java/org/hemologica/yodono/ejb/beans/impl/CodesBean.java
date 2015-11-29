package org.hemologica.yodono.ejb.beans.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hemologica.dao.model.BloodTypes;
import org.hemologica.dao.model.CitiesCode;
import org.hemologica.dao.model.DonationEventsCode;
import org.hemologica.dao.model.DonationTypesCode;
import org.hemologica.dao.model.EventSeverityCode;
import org.hemologica.dao.model.StatesCode;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.factories.FactoryDAO;
import org.hemologica.yodono.ejb.beans.CodesBeanLocal;

/**
 * Session Bean implementation class CodesBean
 */
@Stateless
@LocalBean
public class CodesBean implements CodesBeanLocal {

	@PersistenceContext(unitName = "Hemologica-YodonoDS-PU")
	private EntityManager em;
	
    public CodesBean() {
        // TODO Auto-generated constructor stub
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
	public DataCode getBloodTypeCodeByCode(String code) {
		
		BloodTypes blood = FactoryDAO.getbloodDAO(em).getBloodTypeCodeByCode(code);
	
		DataCode data = new DataCode();
		data.setCode(blood.getBloodTypeCodeValue());
		data.setDisplayName(blood.getBloodTypeCodeLabel());
			
		return data;
	}

	@Override
	public DataCode getABOBloodTypeCodeByBloodSnomedCode(String code) {

		BloodTypes blood = FactoryDAO.getbloodDAO(em).getBloodTypeCodeBySnomedCodeId(code);
		
		DataCode data = new DataCode();
		data.setCode(blood.getBloodAboTypesCode().getBloodAboTypeCodeValue());
		data.setDisplayName(blood.getBloodAboTypesCode().getBloodAboTypeCodeLabel());
			
		return data;
		
	}

	@Override
	public DataCode getRHBloodTypeCodeByBloodSnomedCode(String code) {
		
		BloodTypes blood = FactoryDAO.getbloodDAO(em).getBloodTypeCodeBySnomedCodeId(code);
		
		DataCode data = new DataCode();
		data.setCode(blood.getBloodDTypesCode().getBloodDTypeCodeValue());
		data.setDisplayName(blood.getBloodDTypesCode().getBloodDTypeCodeLabel());
			
		return data;
	}

	@Override
	public DataCode getDonationTypeByCode(String donationType) {
		
		DonationTypesCode d = FactoryDAO.getCodesDAO(em).getDonationTypeByCode(donationType);
		
		DataCode data = new DataCode();
		data.setCode(d.getDonationTypeCodeValue());
		data.setDisplayName(d.getDonationTypeCodeLabel());
		
		return data;
	}

	@Override
	public DataCode getDonationTypeBySnomedCode(String donationType) {
		
		DonationTypesCode d = FactoryDAO.getCodesDAO(em).getDonationTypeBySnomedCode(donationType);
		
		DataCode data = new DataCode();
		data.setCode(d.getDonationTypeCodeValue());
		data.setDisplayName(d.getDonationTypeCodeLabel());
		
		return data;
	}

	@Override
	public DataCode getDonationEventBySnomedCode(String event) {
		
		DonationEventsCode donationEventsCode = FactoryDAO.getCodesDAO(em).getDonationEventBySnomedCode(event);
		
		DataCode eventCode = new DataCode();
		eventCode.setCode(donationEventsCode.getDonationEventCodeValue());
		eventCode.setDisplayName(donationEventsCode.getDonationEventCodeLabel());

		return eventCode;
	}

	@Override
	public DataCode getDonationSeverityBySnomedCode(String severity) {
		
		EventSeverityCode severityCode = FactoryDAO.getCodesDAO(em).getSeverityBySnomedCode(severity);
		
		DataCode eventCode = new DataCode();
		eventCode.setCode(severityCode.getEventSeverityCodeValue());
		eventCode.setDisplayName(severityCode.getEventSeverityCodeLabel());

		return eventCode;
	}

}
