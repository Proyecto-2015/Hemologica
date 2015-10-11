package org.hemologica.empi.adapter.pixpdq.message;

import java.io.Serializable;
import java.util.Map;

public class PDQQueryPatientRequest extends AbstractRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6214302976623402611L;
	
	/**
	 * 
	 * @param values. contiene los valores:
	 * - name
	 * - secondName
	 * - surname
	 * - secondSurname
	 * - sex
	 * - addressStreet
	 * - phone
	 * - birth
	 * - birthPlace
	 */
	public PDQQueryPatientRequest(Map<String, String> values) {
		super(values);
	}

	
	
	

}
