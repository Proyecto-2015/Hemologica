package org.hemologica.empi.adapter.pixpdq.message;

import java.io.Serializable;
import java.util.Map;

public class UpdatePatientRequest extends AbstractRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6456878374749065239L;
	
	public UpdatePatientRequest(Map<String, String> values) {
		super(values);
	}

}
