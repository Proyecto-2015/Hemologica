package org.hemologica.datatypes;

import java.io.Serializable;
import java.util.Date;

public class DataLaboratoryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7214257230098571156L;

	private String code;
	private String displayName;
	private Date date;
	private Boolean result;
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	
}

