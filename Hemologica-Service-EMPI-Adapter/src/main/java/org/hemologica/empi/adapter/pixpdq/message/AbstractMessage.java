package org.hemologica.empi.adapter.pixpdq.message;

import java.io.Serializable;
import java.util.Map;

public abstract class AbstractMessage implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9111598070394860600L;
	
	private Map<String, String> values;
	
	public AbstractMessage(Map<String,String> values){
		this.setValues(values);
	}

	public Map<String, String> getValues() {
		return values;
	}

	public void setValues(Map<String, String> values) {
		this.values = values;
	}

}
