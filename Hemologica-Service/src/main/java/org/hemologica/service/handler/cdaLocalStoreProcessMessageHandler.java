package org.hemologica.service.handler;



public class cdaLocalStoreProcessMessageHandler {

	    public String onMessage(String message) {
	        System.out.println("In onMessage");
	        System.out.println(message);
	        
	        String payload = message;
	        
	        return payload;
	    }
}

