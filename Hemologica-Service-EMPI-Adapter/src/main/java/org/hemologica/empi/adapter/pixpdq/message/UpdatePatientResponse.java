package org.hemologica.empi.adapter.pixpdq.message;

import java.io.Serializable;
import java.util.Map;

public class UpdatePatientResponse extends AbstractResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5299541064717942030L;
	
	public UpdatePatientResponse(Map<String, String> values) {
		super(values);
	}

}
