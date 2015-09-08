package org.hemologica.empi.adapter.impl;

import java.io.IOException;
import java.io.PipedInputStream;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.hemologica.empi.adapter.connection.IConnection;
import org.hemologica.empi.adapter.message.MessageFactory;
import org.hemologica.empi.adapter.message.MessageFactoryException;
import org.hemologica.empi.adapter.pixpdq.PDQAdapter;
import org.hemologica.empi.adapter.pixpdq.PIXAdapter;
import org.hemologica.empi.adapter.pixpdq.exception.PIXAdapterException;
import org.hemologica.empi.adapter.pixpdq.message.CreatePatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.CreatePatientResponse;
import org.hemologica.empi.adapter.pixpdq.message.MergePatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.MergePatientResponse;
import org.hemologica.empi.adapter.pixpdq.message.PIXQueryPatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.PIXQueryPatientResponse;
import org.hemologica.empi.adapter.pixpdq.message.UpdatePatientRequest;
import org.hemologica.empi.adapter.pixpdq.message.UpdatePatientResponse;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.Parser;

public class OpenEMPIAdapter implements PIXAdapter, PDQAdapter {

	private IConnection connection;
	private MessageFactory messageFactory;
	private Parser parser;

	public OpenEMPIAdapter(IConnection connection, Map<String, String> context, Parser parser) {
		this.connection = connection;
		this.messageFactory = new MessageFactory(context);
		this.parser = parser;

	}

	/**
	 * PIX Adapter methods
	 */
	public CreatePatientResponse create(CreatePatientRequest request) throws PIXAdapterException {

		try {

			Message message = messageFactory.create_ADT_A01(request.getValues());
			String msgReq = parser.encode(message);
			connection.connect();
			String msgResp = connection.sendMessage(msgReq, true);
			Map<String,String> values = new HashMap<String, String>();
			values.put("request", msgReq);
			values.put("response", msgResp);
			CreatePatientResponse resp = new CreatePatientResponse(values);
//			resp.setResponse(message);
			return resp;

		} catch (MessageFactoryException e) {
			throw new PIXAdapterException(e);
		} catch (UnknownHostException e) {
			throw new PIXAdapterException(e);
		} catch (IOException e) {
			throw new PIXAdapterException(e);
		} catch (HL7Exception e) {
			throw new PIXAdapterException(e);
		} catch (Exception e) {
			throw new PIXAdapterException(e);
		}

	}

	public UpdatePatientResponse update(UpdatePatientRequest request) throws PIXAdapterException {

		try {

			Message message = messageFactory.create_ADT_A01(request.getValues());
			String msgReq = parser.encode(message);
			connection.connect();
			String msgResp = connection.sendMessage(msgReq, true);
			message = parser.parse(msgResp);
			Map<String,String> values = new HashMap<String, String>();
			values.put("request", msgReq);
			values.put("response", msgResp);
			UpdatePatientResponse resp = new UpdatePatientResponse(values);
//			resp.setResponse(message);
			return resp;

		} catch (MessageFactoryException e) {
			throw new PIXAdapterException(e);
		} catch (UnknownHostException e) {
			throw new PIXAdapterException(e);
		} catch (IOException e) {
			throw new PIXAdapterException(e);
		} catch (HL7Exception e) {
			throw new PIXAdapterException(e);
		} catch (Exception e) {
			throw new PIXAdapterException(e);
		}

	}

	public MergePatientResponse merge(MergePatientRequest request) throws PIXAdapterException {
		

		try {

			Message message = messageFactory.create_ADT_A01(request.getValues());
			String msgReq = parser.encode(message);
			connection.connect();
			String msgResp = connection.sendMessage(msgReq, true);
			message = parser.parse(msgResp);
			Map<String,String> values = new HashMap<String, String>();
			values.put("request", msgReq);
			values.put("response", msgResp);
			MergePatientResponse resp = new MergePatientResponse(values);
//			resp.setResponse(message);
			return resp;

		} catch (MessageFactoryException e) {
			throw new PIXAdapterException(e);
		} catch (UnknownHostException e) {
			throw new PIXAdapterException(e);
		} catch (IOException e) {
			throw new PIXAdapterException(e);
		} catch (HL7Exception e) {
			throw new PIXAdapterException(e);
		} catch (Exception e) {
			throw new PIXAdapterException(e);
		}
	}

	public PIXQueryPatientResponse query(PIXQueryPatientRequest request) throws PIXAdapterException {
		try {

			Message message = messageFactory.create_ADT_A01(request.getValues());
			String msgReq = parser.encode(message);
			connection.connect();
			String msgResp = connection.sendMessage(msgReq, true);
			message = parser.parse(msgResp);
			Map<String,String> values = new HashMap<String, String>();
			values.put("request", msgReq);
			values.put("response", msgResp);
			PIXQueryPatientResponse resp = new PIXQueryPatientResponse(values);
//			resp.setResponse(message);
			return resp;

		} catch (MessageFactoryException e) {
			throw new PIXAdapterException(e);
		} catch (UnknownHostException e) {
			throw new PIXAdapterException(e);
		} catch (IOException e) {
			throw new PIXAdapterException(e);
		} catch (HL7Exception e) {
			throw new PIXAdapterException(e);
		} catch (Exception e) {
			throw new PIXAdapterException(e);
		}
	}

	/**
	 * PDQ Adapter methods
	 */

}
