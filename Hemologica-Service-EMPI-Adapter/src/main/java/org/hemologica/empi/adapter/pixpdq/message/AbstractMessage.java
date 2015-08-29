package org.hemologica.empi.adapter.pixpdq.message;

import java.util.Map;

public abstract class AbstractMessage{
	
	private Map<String, String> values;
	
	public AbstractMessage(Map<String,String> values){
		this.setValues(values);
	}

	protected Map<String, String> getValues() {
		return values;
	}

	protected void setValues(Map<String, String> values) {
		this.values = values;
	}

}
