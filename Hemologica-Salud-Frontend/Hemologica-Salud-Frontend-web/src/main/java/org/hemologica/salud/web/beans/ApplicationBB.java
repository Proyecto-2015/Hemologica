package org.hemologica.salud.web.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hemologica.constants.DataDonationStateEnum;
import org.hemologica.constants.DataEventSeverityEnum;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataBloodABOType;
import org.hemologica.datatypes.DataBloodDType;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataCountry;
import org.hemologica.datatypes.DataDocumentType;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.datatypes.DataDonationFail;
import org.hemologica.datatypes.DataDonationFailCause;
import org.hemologica.datatypes.DataDonationState;
import org.hemologica.datatypes.DataInstitution;

import javax.annotation.PostConstruct;

public class ApplicationBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6967430387332405694L;
	
	/**
	 * Identification Codes BEGIN
	 */
	
	private List<DataCity> cities;
	private List<DataCountry> countries;
	private List<DataDocumentType> documentTypes;
	
	/**
	 * Identification Codes END
	 */

	/**
	 * Donation Codes BEGIN
	 */
	
	private List<DataDonationState> donationStates;
	private List<DataDonationFail> donationFails;
	private List<DataDonationFailCause> donationFailCauses;
	private List<DataBloodABOType> donationABOTypes;
	private List<DataBloodDType> donationDTypes;
	private List<DataDonationEvent> donationEvents;
	private List<DataEventSeverityEnum> eventSeverities;
	
	/**
	 * Donation Codes END
	 */
	
	/**
	 * Event codes BEGIN
	 */
	

	/**
	 * Event codes END
	 */
	
	/**
	 * Institutions BEGIN
	 */
	private List<DataBank> banks;
	private List<DataInstitution> institutions;
	/**
	 * Institutions END
	 */
	
	@PostConstruct
	public void init(){
		this.donationStates = DataDonationStateEnum.getStates();
		this.eventSeverities = DataEventSeverityEnum.getSeverities();
	}

	public List<SelectItem> getItems(String code){
		
		if(code == null){
			return null;
		}
		
		return null;
	}
	
	public List<DataDonationState> getDonationStates(){
		return this.donationStates;
	}

	public List<DataCity> getCities() {
		return cities;
	}

	public List<DataCountry> getCountries() {
		return countries;
	}

	public List<DataDocumentType> getDocumentTypes() {
		return documentTypes;
	}
	
	public List<DataDonationFail> getDonationFails() {
		return donationFails;
	}

	public List<DataDonationFailCause> getDonationFailCauses() {
		return donationFailCauses;
	}

	public List<DataBloodABOType> getDonationABOTypes() {
		return donationABOTypes;
	}

	public List<DataBloodDType> getDonationDTypes() {
		return donationDTypes;
	}

	public void setDonationStates(List<DataDonationState> donationStates) {
		this.donationStates = donationStates;
	}

	public List<DataDonationEvent> getDonationEvents() {
		return donationEvents;
	}

	public void setDonationEvents(List<DataDonationEvent> donationEvents) {
		this.donationEvents = donationEvents;
	}

	public List<DataEventSeverityEnum> getEventSeverities() {
		return eventSeverities;
	}

	public List<DataInstitution> getInstitutions() {
		return institutions;
	}

	public void setInstitutions(List<DataInstitution> institutions) {
		this.institutions = institutions;
	}

	public List<DataBank> getBanks() {
		return banks;
	}

	public void setBanks(List<DataBank> banks) {
		this.banks = banks;
	}

}
