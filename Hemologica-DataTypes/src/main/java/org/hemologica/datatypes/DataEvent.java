package org.hemologica.datatypes;

import java.io.Serializable;

import org.hemologica.constants.DataEventSeverityEnum;

public abstract class DataEvent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3438561495575100047L;
	
	private String code;
	private String display;
	private DataEventSeverityEnum severity;
	
	public DataEventSeverityEnum getSeverity() {
		return severity;
	}
	public void setSeverity(DataEventSeverityEnum severity) {
		this.severity = severity;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
