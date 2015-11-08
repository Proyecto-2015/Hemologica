package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.model.SelectItem;
import org.apache.http.client.ClientProtocolException;
import org.hemologica.constants.DataDonationStateEnum;
import org.hemologica.constants.DataEventSeverityEnum;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataBloodABOType;
import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataCountry;
import org.hemologica.datatypes.DataDocumentType;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.datatypes.DataDonationFail;
import org.hemologica.datatypes.DataDonationFailCause;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataLaboratoryResult;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.salud.factories.RestFactory;

import javax.annotation.PostConstruct;

public class ApplicationBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6967430387332405694L;
	private static final Logger logger = Logger.getLogger(ApplicationBB.class.getName());
	
	/**
	 * Identification Codes BEGIN
	 */
	
	private List<DataCity> cities;
	private List<DataCountry> countries;
	private List<DataDocumentType> documentTypes;
	
	private List<DataProductType> products;
	private List<DataBloodType> bloodTypes;
	private List<DataCode> transfusionAnalysis; 
	private List<DataCode> severities;
	private List<DataCode> transfusionEvents;
	
	/**
	 * Identification Codes END
	 */

	/**
	 * Donation Codes BEGIN
	 */
	
	private List<DataDonationStateEnum> donationStates;
	private List<DataDonationFail> donationFails;
	private List<DataDonationFailCause> donationFailCauses;
	private List<DataBloodABOType> donationABOTypes;
	private List<DataBloodType> donationDTypes;
	private List<DataDonationEvent> donationEvents;
	
	/**
	 * Se cambio por severities
	 */
//	private List<DataEventSeverityEnum> eventSeverities;
	
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
//		this.eventSeverities = DataEventSeverityEnum.getSeverities();
		try {
			
			this.products = RestFactory.getServicesClient().getProducts();
			this.bloodTypes = RestFactory.getServicesClient().getBloodTypes();
			this.transfusionAnalysis = RestFactory.getServicesClient().getTransfusionsAnalysis();
			this.severities = RestFactory.getServicesClient().getSeverities();
			this.transfusionEvents = RestFactory.getServicesClient().getTransfusionsEvents();
			
			
		} catch (ClientProtocolException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web: ClientProtocolException", e);
			
		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "Error al llamar al servicio web: IOException", e);
			
		}
	}

	public List<SelectItem> getItems(String code){
		
		if(code == null){
			return null;
		}
		
		return null;
	}
	
	public List<DataDonationStateEnum> getDonationStates(){
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

	public List<DataBloodType> getDonationDTypes() {
		return donationDTypes;
	}

	public void setDonationStates(List<DataDonationStateEnum> donationStates) {
		this.donationStates = donationStates;
	}

	public List<DataDonationEvent> getDonationEvents() {
		return donationEvents;
	}

	public void setDonationEvents(List<DataDonationEvent> donationEvents) {
		this.donationEvents = donationEvents;
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

	public List<DataProductType> getProducts() {
		return products;
	}

	public void setProducts(List<DataProductType> products) {
		this.products = products;
	}

	public List<DataBloodType> getBloodTypes() {
		return bloodTypes;
	}

	public void setBloodTypes(List<DataBloodType> bloodTypes) {
		this.bloodTypes = bloodTypes;
	}

	public List<DataCode> getTransfusionAnalysis() {
		return transfusionAnalysis;
	}

	public void setTransfusionAnalysis(List<DataCode> transfusionAnalysis) {
		this.transfusionAnalysis = transfusionAnalysis;
	}

	public List<DataCode> getSeverities() {
		return severities;
	}

	public void setSeverities(List<DataCode> severities) {
		this.severities = severities;
	}

	public List<DataCode> getTransfusionEvents() {
		return transfusionEvents;
	}

	public void setTransfusionEvents(List<DataCode> transfusionEvents) {
		this.transfusionEvents = transfusionEvents;
	}
	
}
