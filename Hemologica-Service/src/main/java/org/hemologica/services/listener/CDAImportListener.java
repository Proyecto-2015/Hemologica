package org.hemologica.services.listener;

import java.io.Serializable;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class CDAImportListener implements Serializable, MessageListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8162976402682300715L;

	@Override
	public void onMessage(Message arg0) {

		System.out.println("CDAImportListener");
		
	}
	
	

}
