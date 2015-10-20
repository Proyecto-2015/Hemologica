package org.hemologica.empi.adapter;

import org.hemologica.empi.adapter.pixpdq.PDQAdapter;
import org.hemologica.empi.adapter.pixpdq.PIXAdapter;
import org.hemologica.empi.adapter.pixpdq.exception.PDQAdapterException;
import org.hemologica.empi.adapter.pixpdq.exception.PIXAdapterException;
import org.hemologica.empi.adapter.pixpdq.message.CreatePatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.CreatePatientResponse;
import org.hemologica.empi.adapter.pixpdq.message.MergePatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.MergePatientResponse;
import org.hemologica.empi.adapter.pixpdq.message.PDQQueryPatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.PDQQueryPatientResponse;
import org.hemologica.empi.adapter.pixpdq.message.PIXQueryPatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.PIXQueryPatientResponse;
import org.hemologica.empi.adapter.pixpdq.message.UpdatePatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.UpdatePatientResponse;

public interface IEMPIAdapter extends PDQAdapter, PIXAdapter{

	/**
	 * PIX Adapter methods
	 */
	public CreatePatientResponse create(CreatePatientRequest request) throws PIXAdapterException;

	public UpdatePatientResponse update(UpdatePatientRequest request) throws PIXAdapterException;

	public MergePatientResponse merge(MergePatientRequest request) throws PIXAdapterException;

	public PIXQueryPatientResponse query(PIXQueryPatientRequest request) throws PIXAdapterException;

	/**
	 * PDQ Adapter methods
	 */
	public PDQQueryPatientResponse query(PDQQueryPatientRequest request) throws PDQAdapterException;
	
}
