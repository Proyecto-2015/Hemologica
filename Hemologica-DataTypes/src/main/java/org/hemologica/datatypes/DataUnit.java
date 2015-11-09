package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.Date;

public class DataUnit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5470280587666900962L;

	
	private Long id;
	private Long donationId;
	private String code;
	private String institution;
	private String institutionCode;
	private DataProductType productType;
	private DataBloodType bloodType;
	private String dueDate;
	private Boolean active;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDonationId() {
		return donationId;
	}
	public void setDonationId(Long donationId) {
		this.donationId = donationId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getInstitutionCode() {
		return institutionCode;
	}
	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}
	public DataProductType getProductType() {
		return productType;
	}
	public void setProductType(DataProductType productType) {
		this.productType = productType;
	}
	public DataBloodType getBloodType() {
		return bloodType;
	}
	public void setBloodType(DataBloodType bloodType) {
		this.bloodType = bloodType;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
}
