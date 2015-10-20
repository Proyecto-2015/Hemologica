package org.hemologica.services.filters;

import java.io.Serializable;

import org.springframework.messaging.Message;

public class MessageValidator implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3281235062399392819L;
	
	public boolean filter(Message<?> msg){
		//TODO
		return true;
	}
	
	
}
