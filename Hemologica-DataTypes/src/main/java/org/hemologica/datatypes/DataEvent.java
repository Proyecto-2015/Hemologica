package org.hemologica.datatypes;

import java.io.Serializable;

import org.hemologica.constants.DataEventSeverityEnum;

public abstract class DataEvent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3438561495575100047L;
	
	private DataCode event;
	private DataEventSeverityEnum severity;
	
	public DataEventSeverityEnum getSeverity() {
		return severity;
	}
	public void setSeverity(DataEventSeverityEnum severity) {
		this.severity = severity;
	}
	public DataCode getEvent() {
		return event;
	}
	public void setEvent(DataCode event) {
		this.event = event;
	}
	
	
	
}
