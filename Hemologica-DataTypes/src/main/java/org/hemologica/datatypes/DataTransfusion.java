package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.List;

public class DataTransfusion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3440653129221915523L;
	
	private String id;
	private String name;
	private String date;
	private String time;
	private DataBank bank;
	private DataInstitution institution;
	private String volume;
	private DataPerson person;
	private DataInstitution donationinstitution;
	private String associatedDonation;
	private String productCode;
	private DataProductType dataProduct;
	private List<DataLaboratoryResult> laboratoryResults;
	private List<DataTransfusionEvent> events;
	private DataResponsiblePerson responsibleTransfusionPerson;
	
	
	public DataProductType getDataProduct() {
		
		return dataProduct;
	}
	public void setDataProduct(DataProductType dataProduct) {
		this.dataProduct = dataProduct;
	}
	public List<DataLaboratoryResult> getLaboratoryResults() {
		return laboratoryResults;
	}
	public void setLaboratoryResults(List<DataLaboratoryResult> laboratoryResults) {
		this.laboratoryResults = laboratoryResults;
	}
	public List<DataTransfusionEvent> getEvents() {
		return events;
	}
	public void setEvents(List<DataTransfusionEvent> events) {
		this.events = events;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public DataBank getBank() {
		return bank;
	}
	public void setBank(DataBank bank) {
		this.bank = bank;
	}
	public DataInstitution getInstitution() {
		return institution;
	}
	public void setInstitution(DataInstitution institution) {
		this.institution = institution;
	}
	public DataPerson getPerson() {
		return person;
	}
	public void setPerson(DataPerson person) {
		this.person = person;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public DataResponsiblePerson getResponsibleTransfusionPerson() {
		return responsibleTransfusionPerson;
	}
	public void setResponsibleTransfusionPerson(DataResponsiblePerson responsibleTransfusionPerson) {
		this.responsibleTransfusionPerson = responsibleTransfusionPerson;
	}
	public String getAssociatedDonation() {
		return associatedDonation;
	}
	public void setAssociatedDonation(String associatedDonation) {
		this.associatedDonation = associatedDonation;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public DataInstitution getDonationinstitution() {
		return donationinstitution;
	}
	public void setDonationinstitution(DataInstitution donationinstitution) {
		this.donationinstitution = donationinstitution;
	}
	
	
	
}
