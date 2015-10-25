package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.List;

public class DataDonacion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4260250837335930498L;
	
	private String name;
	private String date;
	private String bank;
	private String institution;
	private String donorType;
	private boolean approved; 
	
	
	private List<DataLaboratoryResult> labResults;
	
	
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
	public String getDonorType() {
		return donorType;
	}
	public void setDonorType(String donorType) {
		this.donorType = donorType;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public List<DataLaboratoryResult> getLabResults() {
		return labResults;
	}
	public void setLabResults(List<DataLaboratoryResult> labResults) {
		this.labResults = labResults;
	}
	
}
