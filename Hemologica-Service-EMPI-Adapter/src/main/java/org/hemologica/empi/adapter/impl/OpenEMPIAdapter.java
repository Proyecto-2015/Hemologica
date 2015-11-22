package org.hemologica.empi.adapter.impl;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.hemologica.empi.adapter.IEMPIAdapter;
import org.hemologica.empi.adapter.connection.IConnection;
import org.hemologica.empi.adapter.message.MessageFactory;
import org.hemologica.empi.adapter.message.MessageFactoryException;
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
import org.hemologica.empi.datatypes.Identifier;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.Parser;

public class OpenEMPIAdapter implements IEMPIAdapter {

	private IConnection pixConnection;
	private IConnection pdqConnection;
	private MessageFactory messageFactory;
	private Parser parser;

	public OpenEMPIAdapter(IConnection pixConnection, IConnection pdqConnection, Map<String, String> context, Parser parser) {
		this.pixConnection = pixConnection;
		this.pdqConnection = pdqConnection;
		this.messageFactory = new MessageFactory(context);
		this.parser = parser;

	}
	

	/**
	 * PIX Adapter methods
	 */
	public CreatePatientResponse create(CreatePatientRequest request) throws PIXAdapterException {

		try {

			Message message = messageFactory.create_ADT_A04(request.getValues());
			String msgReq = parser.encode(message);
			pixConnection.connect();
			String msgResp = pixConnection.sendMessage(msgReq, true);
			Map<String,String> values = new HashMap<String, String>();
			values.put("request", msgReq);
			values.put("response", msgResp);
			CreatePatientResponse resp = new CreatePatientResponse(values);
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

			Message message = messageFactory.create_ADT_A08(request.getValues());
			String msgReq = parser.encode(message);
			pixConnection.connect();
			String msgResp = pixConnection.sendMessage(msgReq, true);
			message = parser.parse(msgResp);
			Map<String,String> values = new HashMap<String, String>();
			values.put("request", msgReq);
			values.put("response", msgResp);
			UpdatePatientResponse resp = new UpdatePatientResponse(values);
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

			Message message = messageFactory.create_ADT_A40(request.getValues());
			String msgReq = parser.encode(message);
			pixConnection.connect();
			String msgResp = pixConnection.sendMessage(msgReq, true);
			message = parser.parse(msgResp);
			Map<String,String> values = new HashMap<String, String>();
			values.put("request", msgReq);
			values.put("response", msgResp);
			MergePatientResponse resp = new MergePatientResponse(values);
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

			String identifier = request.getValues().get("identifier");
			String domain = request.getValues().get("domain");
			Message message = messageFactory.create_QBP_Q21(request.getValues());
			String msgReq = parser.encode(message);
			pixConnection.connect();
			String msgResp = pixConnection.sendMessage(msgReq, true);
			message = parser.parse(msgResp);
			Map<String,String> values = new HashMap<String, String>();
			values.put("request", msgReq);
			values.put("response", msgResp);
			/**
			 * Agrego el identificador por el cual consulto
			 */
			values.put("identifier", identifier);
			values.put("domain", domain);
			PIXQueryPatientResponse resp = new PIXQueryPatientResponse(values);
			Message messageResp = parser.parse(msgResp);
			resp.load(messageResp);
			
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

	public PDQQueryPatientResponse query(PDQQueryPatientRequest request) throws PDQAdapterException{
		
		try {

			Message message = messageFactory.create_QBP_Q22(request.getValues());
			String msgReq = parser.encode(message);
			pdqConnection.connect();
			String msgResp = pdqConnection.sendMessage(msgReq, true);
			message = parser.parse(msgResp);
			Map<String,String> values = new HashMap<String, String>();
			values.put("request", msgReq);
			values.put("response", msgResp);
			
			PDQQueryPatientResponse resp = new PDQQueryPatientResponse(values);
			Message messageResp = parser.parse(msgResp);
			resp.load(messageResp);
			
			return resp;

		} catch (MessageFactoryException e) {
			throw new PDQAdapterException(e);
		} catch (UnknownHostException e) {
			throw new PDQAdapterException(e);
		} catch (IOException e) {
			throw new PDQAdapterException(e);
		} catch (HL7Exception e) {
			throw new PDQAdapterException(e);
		} catch (Exception e) {
			throw new PDQAdapterException(e);
		}
	}


	@Override
	public Identifier createIdentifier() {
		return messageFactory.createIdentifier();
	}


	@Override
	public String getMyDomain() {
		return messageFactory.getMyDomain();
	}
	
}
