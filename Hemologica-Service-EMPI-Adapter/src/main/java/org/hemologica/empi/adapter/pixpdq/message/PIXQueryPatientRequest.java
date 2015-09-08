package org.hemologica.empi.adapter.pixpdq.message;

import java.io.Serializable;
import java.util.Map;

public class PIXQueryPatientRequest extends AbstractRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8019809617088498184L;
	
	public PIXQueryPatientRequest(Map<String, String> values) {
		super(values);
	}

}
