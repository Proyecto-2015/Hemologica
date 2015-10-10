package org.hemologica.empi.adapter.pixpdq;

import org.hemologica.empi.adapter.pixpdq.exception.PDQAdapterException;
import org.hemologica.empi.adapter.pixpdq.message.PDQQueryPatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.PDQQueryPatientResponse;


public interface PDQAdapter {

	public PDQQueryPatientResponse query(PDQQueryPatientRequest request) throws PDQAdapterException;
	
}
