package org.hemologica.dao.enums;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public enum DataEventSeverityEnum implements Serializable{

	MILD("mild", "event_mild"),
	MODERATE("moderate","event_moderate"),
	SEVERE("severe","event_severe");
	
	private String value;
	private String label;
	
	

	private DataEventSeverityEnum(String value, String label){
		this.value = value;
		this.label = label;
	}
	
	public static List<DataEventSeverityEnum> getSeverities(){
		List<DataEventSeverityEnum> ret = new ArrayList<DataEventSeverityEnum>();
		ret.add(MILD);
		ret.add(MODERATE);
		ret.add(SEVERE);
		return ret;
	}
	
	public String getValue() {
		return value;
	}

	public String getLabel() {
		return label;
	}
	
}

