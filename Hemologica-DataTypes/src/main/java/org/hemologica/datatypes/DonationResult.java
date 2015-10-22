package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.Date;

public class DonationResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9023483717165649475L;
	
	private String donationId;
	private String personDocument;
	private String personCompleteName;
	private Date donationDate;
	private String donationState;
	
	public DonationResult(){}
	
	public DonationResult(String donationId, 
			String personDocument, 
			String personCompleteName, 
			Date donationDate, 
			String donationState){
		
		this.donationId = donationId;
		this.personDocument = personDocument;
		this.personCompleteName = personCompleteName;
		this.donationDate = donationDate;
		this.donationState = donationState;
	}
	
	public String getDonationId() {
		return donationId;
	}
	public void setDonationId(String donationId) {
		this.donationId = donationId;
	}
	public String getPersonDocument() {
		return personDocument;
	}
	public void setPersonDocument(String personDocument) {
		this.personDocument = personDocument;
	}
	public String getPersonCompleteName() {
		return personCompleteName;
	}
	public void setPersonCompleteName(String personCompleteName) {
		this.personCompleteName = personCompleteName;
	}
	public Date getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
	}
	public String getDonationState() {
		return donationState;
	}
	public void setDonationState(String donationState) {
		this.donationState = donationState;
	}
	
	
	

}
