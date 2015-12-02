package org.hemologica.datatypes;

import java.io.Serializable;

public class DataDonationFail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -43336076178896132L;

	private String date;
	private DataCode cause;
	private DataCode rejectionType;
	
	public DataDonationFail(){
		
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

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
