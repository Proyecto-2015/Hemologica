package org.hemologica.service.handler;



public class cdaXDSStoreProcessMessageHandler {

	    public String onMessage(String message) {
	        System.out.println("In onMessage");
	        System.out.println(message);
	        
	        String payload = message;
	        
	        return payload;
	    }
}

