package org.hemologica.datatypes;

import java.io.Serializable;

public class DataDonationFail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -43336076178896132L;

	
//	private String code;
//	private String displayName;
	private String date;
	private DataCode cause;
	private DataCode rejectionType;
	
	public DataDonationFail(){
		
	}
	
//	public String getCode() {
//		return code;
//	}
//	public void setCode(String code) {
//		this.code = code;
//	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
//	public String getDisplayName() {
//		return displayName;
//	}
//	public void setDisplayName(String displayName) {
//		this.displayName = displayName;
//	}
	public DataCode getCause() {
		return cause;
	}
	public void setCause(DataCode cause) {
		this.cause = cause;
	}

	public DataCode getRejectionType() {
		return rejectionType;
	}

	public void setRejectionType(DataCode rejectionType) {
		this.rejectionType = rejectionType;
	}
	
}
