package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.Date;

import org.hemologica.constants.DataDonationRejectionType;

public class DataDonationFail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -43336076178896132L;

	
	private String code;
	private String displayName;
	private Date date;
	private DataDonationFailCause cause;
	private DataDonationRejectionType rejectionType;
	
	public DataDonationFail(){
		this.cause = new DataDonationFailCause();
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public DataDonationFailCause getCause() {
		return cause;
	}
	public void setCause(DataDonationFailCause cause) {
		this.cause = cause;
	}

	public DataDonationRejectionType getRejectionType() {
		return rejectionType;
	}

	public void setRejectionType(DataDonationRejectionType rejectionType) {
		this.rejectionType = rejectionType;
	}
	
}
