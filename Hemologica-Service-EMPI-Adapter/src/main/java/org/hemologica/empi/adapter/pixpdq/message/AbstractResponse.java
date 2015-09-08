package org.hemologica.empi.adapter.pixpdq.message;

import java.io.Serializable;
import java.util.Map;

import ca.uhn.hl7v2.model.Message;

public class AbstractResponse extends AbstractMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5050271261015557556L;
	
	private Message response;
	
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
