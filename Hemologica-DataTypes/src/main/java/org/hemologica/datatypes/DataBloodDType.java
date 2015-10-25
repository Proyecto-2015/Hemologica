package org.hemologica.datatypes;

import java.io.Serializable;

public class DataBloodDType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2877220618048351894L;
	
	private String code;
	private String displayName;
	
	
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
}
