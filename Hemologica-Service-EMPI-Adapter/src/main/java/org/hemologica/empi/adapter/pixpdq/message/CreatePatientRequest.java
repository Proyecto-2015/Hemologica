package org.hemologica.empi.adapter.pixpdq.message;

import java.io.Serializable;
import java.util.Map;

public class CreatePatientRequest extends AbstractRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -786022068912124779L;
	
	public CreatePatientRequest(Map<String, String> values) {
		super(values);
	}

}
