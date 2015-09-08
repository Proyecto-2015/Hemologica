package org.hemologica.empi.adapter.pixpdq.message;

import java.io.Serializable;
import java.util.Map;

public class MergePatientRequest extends AbstractRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5398451035912499006L;
	
	public MergePatientRequest(Map<String, String> values) {
		super(values);
	}



}
