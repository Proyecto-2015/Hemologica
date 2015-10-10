package org.hemologica.empi.adapter.pixpdq.message;

import java.io.Serializable;
import java.util.Map;

public class PDQQueryPatientRequest extends AbstractRequest implements Serializable{

	public PDQQueryPatientRequest(Map<String, String> values) {
		super(values);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6214302976623402611L;

}
