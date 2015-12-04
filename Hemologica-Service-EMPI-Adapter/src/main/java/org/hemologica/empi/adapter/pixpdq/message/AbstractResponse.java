package org.hemologica.empi.adapter.pixpdq.message;

import java.io.Serializable;
import java.util.Map;

import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v231.message.ACK;

public class AbstractResponse extends AbstractMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5050271261015557556L;
	
	private ACK ack;
	
	public ACK getAck() {
		return ack;
	}

	public void setAck(ACK ack) {
		this.ack = ack;
	}

	private Boolean success;
	
	public Boolean getSuccess() {
		
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	private Message response;
	
	public void load(Message msg){
		this.response = msg;
	}
	
	public AbstractResponse(Map<String, String> values) {
		super(values);
	}
	
	public Message getResponse() {
		return response;
	}

	public void setResponse(Message response) {
		this.response = response;
	}

	

}
