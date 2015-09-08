package org.hemologica.empi.adapter.pixpdq.message;

import java.io.Serializable;
import java.util.Map;

public class CreatePatientResponse extends AbstractResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5748181619748028527L;
	
	
	public CreatePatientResponse(Map<String, String> values) {
		super(values);
	}

}
