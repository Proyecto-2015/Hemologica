package org.hemologica.datatypes;

import java.io.Serializable;

public class DataDocumentType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2144963005633424428L;
	
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

