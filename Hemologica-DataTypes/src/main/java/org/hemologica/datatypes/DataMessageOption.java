package org.hemologica.datatypes;

import java.io.Serializable;

public class DataMessageOption implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9176360583037903695L;
	
	private Long code;
	private String displayName;
	
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

}
