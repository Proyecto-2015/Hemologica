package org.hemologica.services.handler;



public class MessageHandler {

	    public String onMessage(String message) {
	        System.out.println("In onMessage");
	        System.out.println(message);
	        
	        String payload = message;
	        
	        return payload;
	    }
}

