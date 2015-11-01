package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.List;

public class DataTransfusion implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3440653129221915523L;
	
	
	private String name;
	private String date;
	private DataBank bank;
	private DataInstitution institution;
	private String product;
	private String volume;
	
	private DataPerson person;
	private DataProduct dataProduct;
	private List<DataLaboratoryResult> laboratoryResults;
	private List<DataTransfusionEvent> events;
	
	public DataProduct getDataProduct() {
		return dataProduct;
	}
	public void setDataProduct(DataProduct dataProduct) {
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
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
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
	
	
}
