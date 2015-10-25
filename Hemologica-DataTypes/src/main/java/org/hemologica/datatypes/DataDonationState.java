package org.hemologica.datatypes;

import java.io.Serializable;

public class DataDonationState implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3224603718726115909L;
	
	private String code;
	private String displayName;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

}
