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
	private String bank;
	private String institution;
	private String product;
	
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
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
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
	
	
}
