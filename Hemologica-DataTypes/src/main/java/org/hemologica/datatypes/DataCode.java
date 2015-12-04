package org.hemologica.datatypes;

import java.io.Serializable;

public class DataCode implements Serializable{

	private static final long serialVersionUID = 1L;
	private String code;
	private String displayName;
	private String description;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
