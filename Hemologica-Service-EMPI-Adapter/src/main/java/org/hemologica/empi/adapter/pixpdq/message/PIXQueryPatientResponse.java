package org.hemologica.empi.adapter.pixpdq.message;

import java.io.Serializable;
import java.util.Map;

public class PIXQueryPatientResponse extends AbstractResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5819165307010528844L;
	
	public PIXQueryPatientResponse(Map<String, String> values) {
		super(values);
	}

}
