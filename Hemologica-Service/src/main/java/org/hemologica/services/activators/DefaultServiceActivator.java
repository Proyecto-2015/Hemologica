package org.hemologica.services.activators;

import javax.jms.Message;

public class DefaultServiceActivator {
	
	
	public void print(Message msj){
		System.out.println("Llegó mensaje");
	}

}
