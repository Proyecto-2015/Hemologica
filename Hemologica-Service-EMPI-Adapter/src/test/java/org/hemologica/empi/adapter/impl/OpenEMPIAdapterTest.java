package org.hemologica.empi.adapter.impl;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.hemologica.empi.adapter.connection.IConnection;
import org.hemologica.empi.adapter.connection.MLLPConnection;
import org.hemologica.empi.adapter.pixpdq.exception.PIXAdapterException;
import org.hemologica.empi.adapter.pixpdq.message.CreatePatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.CreatePatientResponse;
import org.hemologica.empi.adapter.pixpdq.message.PIXQueryPatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.PIXQueryPatientResponse;
import org.hemologica.empi.adapter.pixpdq.message.UpdatePatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.UpdatePatientResponse;
import org.junit.Test;

import ca.uhn.hl7v2.parser.PipeParser;

public class OpenEMPIAdapterTest {

//	@Test
//	public void testOpenEMPIAdapter() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testCreate() {

//		Map<String, String > context = new HashMap<String, String>();
//		context.put("sendingApplication", "HEMOLOGICA_SEND");
//		context.put("sendingFacility", "HEMOLOGICA");
//		context.put("receivingApplication", "EMPI_RECEIVE");
//		context.put("receivingFacility", "EMPI");
//		context.put("aa_namespace", "HEMOLOGICA");
//		context.put("aa_universal_id", "2.16.858.0.0.1.10.2.3.1.1.1");
//		context.put("aa_universal_id_type", "OID");
//		IConnection connection = new MLLPConnection("localhost", 3600);
//		OpenEMPIAdapter adapter = new OpenEMPIAdapter(connection, context, new PipeParser());
//		
//		Map<String,String> values = new HashMap<String, String>();
//		values.put("patientIdentifier", "HEMO-200");
//		values.put("name", "Bruno");
//		values.put("surname", "Strasser");
//		
//		CreatePatientRequest request = new CreatePatientRequest(values);
//		try {
//			
//			CreatePatientResponse response = adapter.create(request);
//			values = response.getValues();
//			String msg = values.get("response");
//			
//		} catch (PIXAdapterException e) {
//			e.printStackTrace();
//			fail(e.getMessage());
//		}
		
	}

	@Test
	public void testUpdate() {

//		Map<String, String > context = new HashMap<String, String>();
//		context.put("sendingApplication", "HEMOLOGICA_SEND");
//		context.put("sendingFacility", "HEMOLOGICA");
//		context.put("receivingApplication", "EMPI_RECEIVE");
//		context.put("receivingFacility", "EMPI");
//		context.put("aa_namespace", "HEMOLOGICA");
//		context.put("aa_universal_id", "2.16.858.0.0.1.10.2.3.1.1.1");
//		context.put("aa_universal_id_type", "OID");
//		IConnection connection = new MLLPConnection("localhost", 3600);
//		OpenEMPIAdapter adapter = new OpenEMPIAdapter(connection, context, new PipeParser());
//		
//		Map<String,String> values = new HashMap<String, String>();
//		values.put("patientIdentifier", "HEMO-200");
//		values.put("name", "Bruno");
//		values.put("surname", "Mazza");
//		
//		UpdatePatientRequest request = new UpdatePatientRequest(values);
//		try {
//			
//			UpdatePatientResponse response = adapter.update(request);
//			values = response.getValues();
//			String msg = values.get("response");
//			
//		} catch (PIXAdapterException e) {
//			e.printStackTrace();
//			fail(e.getMessage());
//		}
		
	}

	@Test
	public void testMerge() {
//		fail("Not yet implemented");
	}

	@Test
	public void testQuery() {
		
//		Map<String, String > context = new HashMap<String, String>();
//		context.put("sendingApplication", "HEMOLOGICA_SEND");
//		context.put("sendingFacility", "HEMOLOGICA");
//		context.put("receivingApplication", "EMPI_RECEIVE");
//		context.put("receivingFacility", "EMPI");
//		context.put("aa_namespace", "HEMOLOGICA");
//		context.put("aa_universal_id", "2.16.858.0.0.1.10.2.3.1.1.1");
//		context.put("aa_universal_id_type", "OID");
//		IConnection connection = new MLLPConnection("localhost", 3600);
//		OpenEMPIAdapter adapter = new OpenEMPIAdapter(connection, context, new PipeParser());
//		
//		Map<String,String> values = new HashMap<String, String>();
//		values.put("identifier", "HEMO-111");
//		values.put("domain", "HEMOLOGICA");
//		
//		PIXQueryPatientRequest request = new PIXQueryPatientRequest(values);
//		try {
//			
//			PIXQueryPatientResponse response = adapter.query(request);
//			values = response.getValues();
//			String msg = values.get("response");
//			
//		} catch (PIXAdapterException e) {
//			e.printStackTrace();
//			fail(e.getMessage());
//		}
	
	}

}
