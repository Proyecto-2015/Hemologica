package org.hemologica.datatypes;

import java.io.Serializable;

public abstract class DataEvent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3438561495575100047L;
	
	private DataCode event;
	private DataCode severity;
	
	
	public DataCode getSeverity() {
		return severity;
	}
	
	public void setSeverity(DataCode severity) {
		this.severity = severity;
	}
	
	public DataCode getEvent() {
		return event;
	}
	
	public void setEvent(DataCode event) {
		this.event = event;
	}
	
	
	
}
