package org.hemologica.salud.web.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.model.SelectItem;
import org.apache.http.client.ClientProtocolException;
import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataSearchFilter;
import org.hemologica.datatypes.DonationFilterData;
import org.hemologica.datatypes.TransfusionFilterData;
import org.hemologica.datatypes.DataMessageOption;
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
	
	private List<DataCode> cities;
	private List<DataCode> states;
	private List<DataCode> countries;
	private List<DataCode> documentTypes;
	
	private List<DataProductType> products;
	private List<DataCode> transfusionAnalysis;
	private List<DataCode> donationAnalysis;
	
	private List<DataCode> severities;
	private List<DataCode> transfusionEvents;
	private List<DataCode> donationsEvents;
	
	private List<DataCode> rejectionTypes;
	private List<DataCode> rejectionReasons;
	
	private List<DataMessageOption> messageOptions;
	private List<DataCode> donorTypes;
	private List<DataCode> donationTypes;
	private List<DataCode> results;
	private List<DataCode> donationStates;
	private List<DataCode> donationABOTypes;
	private List<DataCode> donationDTypes;
	private List<DataCode> bloodTypes;
	private List<DataCode> gender;
	private List<DataDonationEvent> donationEvents;
	private List<DataBank> banks;
	private List<DataInstitution> institutions;
	private List<DonationFilterData> donationsFilters;
	private List<TransfusionFilterData> transfusionsFilters;
	
	private List<DataSearchFilter> searchFilters;

	
	@PostConstruct
	public void init(){
		
		try {
			
			this.donationsFilters = RestFactory.getServicesClient().getDonationsFilters();
			this.transfusionsFilters = RestFactory.getServicesClient().getTransfusionsFilters();
			
			this.donationStates = RestFactory.getServicesClient().getDonationState();
			this.institutions = RestFactory.getServicesClient().getInstitutions();
			this.products = RestFactory.getServicesClient().getProducts();
			this.bloodTypes = RestFactory.getServicesClient().getBloodTypes();
			this.transfusionAnalysis = RestFactory.getServicesClient().getTransfusionsAnalysis();
			this.donationAnalysis  = RestFactory.getServicesClient().getDonationAnalysis();
			
			this.severities = RestFactory.getServicesClient().getSeverities();
			this.transfusionEvents = RestFactory.getServicesClient().getTransfusionsEvents();
			this.donationsEvents = RestFactory.getServicesClient().getDonationsEvents();
			this.donationTypes = RestFactory.getServicesClient().getDonationTypes();
			this.donorTypes = RestFactory.getServicesClient().getDonorTypes();
			
			this.donationABOTypes = RestFactory.getServicesClient().getDonationABOTypes();
			this.donationDTypes = RestFactory.getServicesClient().getDonationDTTypes();
			this.rejectionReasons = RestFactory.getServicesClient().getRejectionReasons();
			this.rejectionTypes = RestFactory.getServicesClient().getRejectionTypes();
			
			this.cities = RestFactory.getServicesClient().getCitiesCodes();
			this.states = RestFactory.getServicesClient().getStatesCodes();
			this.countries = RestFactory.getServicesClient().getCountries();
			this.documentTypes = RestFactory.getServicesClient().getDocumentsTypes();
			
			this.messageOptions = RestFactory.getServicesClient().getMessageOptions();
			this.gender = RestFactory.getServicesClient().getGenderCodes();
			
			this.results = RestFactory.getServicesClient().getResultsCodes();
			this.searchFilters = RestFactory.getServicesClient().getSearchFilters();
			
			
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
	
	public List<DataCode> getDonationStates(){
		return this.donationStates;
	}

	public List<DataCode> getDonationABOTypes() {
		return donationABOTypes;
	}

	public List<DataCode> getDonationDTypes() {
		return donationDTypes;
	}

	public void setDonationStates(List<DataCode> donationStates) {
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

	public List<DataCode> getBloodTypes() {
		return bloodTypes;
	}

	public void setBloodTypes(List<DataCode> bloodTypes) {
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

	public List<DataCode> getDonationAnalysis() {
		return donationAnalysis;
	}

	public void setDonationAnalysis(List<DataCode> donationAnalysis) {
		this.donationAnalysis = donationAnalysis;
	}

	public List<DataCode> getDonationsEvents() {
		return donationsEvents;
	}

	public void setDonationsEvents(List<DataCode> donationsEvents) {
		this.donationsEvents = donationsEvents;
	}

	public List<DataCode> getRejectionTypes() {
		return rejectionTypes;
	}

	public void setRejectionTypes(List<DataCode> rejectionTypes) {
		this.rejectionTypes = rejectionTypes;
	}

	public List<DataCode> getRejectionReasons() {
		return rejectionReasons;
	}

	public void setRejectionReasons(List<DataCode> rejectionReasons) {
		this.rejectionReasons = rejectionReasons;
	}

	public void setDonationABOTypes(List<DataCode> donationABOTypes) {
		this.donationABOTypes = donationABOTypes;
	}

	public void setDonationDTypes(List<DataCode> donationDTypes) {
		this.donationDTypes = donationDTypes;
	}

	public List<DataCode> getStates() {
		return states;
	}

	public void setStates(List<DataCode> states) {
		this.states = states;
	}

	public void setCities(List<DataCode> cities) {
		this.cities = cities;
	}

	public void setCountries(List<DataCode> countries) {
		this.countries = countries;
	}

	public void setDocumentTypes(List<DataCode> documentTypes) {
		this.documentTypes = documentTypes;
	}

	public List<DataCode> getCountries() {
		return countries;
	}

	public List<DataCode> getCities() {
		return cities;
	}

	public List<DataCode> getDocumentTypes() {
		return documentTypes;
	}

	public List<DataMessageOption> getMessageOptions() {
		return messageOptions;
	}

	public void setMessageOptions(List<DataMessageOption> messageOptions) {
		this.messageOptions = messageOptions;
	}

	public List<DonationFilterData> getDonationsFilters() {
		return donationsFilters;
	}

	public void setDonationsFilters(List<DonationFilterData> donationsFilters) {
		this.donationsFilters = donationsFilters;
	}

	public List<TransfusionFilterData> getTransfusionsFilters() {
		return transfusionsFilters;
	}

	public void setTransfusionsFilters(List<TransfusionFilterData> transfusionsFilters) {
		this.transfusionsFilters = transfusionsFilters;
	}

	public List<DataCode> getDonorTypes() {
		return donorTypes;
	}

	public void setDonorTypes(List<DataCode> donorTypes) {
		this.donorTypes = donorTypes;
	}

	public List<DataCode> getDonationTypes() {
		return donationTypes;
	}

	public void setDonationTypes(List<DataCode> donationTypes) {
		this.donationTypes = donationTypes;
	}

	public List<DataCode> getGender() {
		return gender;
	}

	public void setGender(List<DataCode> gender) {
		this.gender = gender;
	}

	public List<DataCode> getResults() {
		return results;
	}

	public void setResults(List<DataCode> results) {
		this.results = results;
	}

	public List<DataSearchFilter> getSearchFilters() {
		return searchFilters;
	}

	public void setSearchFilters(List<DataSearchFilter> searchFilters) {
		this.searchFilters = searchFilters;
	}

}
