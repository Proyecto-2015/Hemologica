package org.hemologica.constants;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public enum DataEventSeverityEnum implements Serializable{

	MILD("mild", "event_mild"),
	MODERATE("moderate","event_moderate"),
	SEVERE("severe","event_severe");
	
	public String value;
	public String label;
	
	private DataEventSeverityEnum(String value, String label){
		this.value = value;
		this.label = label;
	}
	
	public static List<DataEventSeverityEnum> getStates(){
		List<DataEventSeverityEnum> ret = new ArrayList<DataEventSeverityEnum>();
		ret.add(MILD);
		ret.add(MODERATE);
		ret.add(SEVERE);
		return ret;
	}
	
}
