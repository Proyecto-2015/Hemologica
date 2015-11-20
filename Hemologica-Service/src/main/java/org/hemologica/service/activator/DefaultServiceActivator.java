package org.hemologica.service.activator;


public class DefaultServiceActivator {
	
	
	public String process(String msg){
		
		System.out.println("#########################");
		System.out.println(msg);
		System.out.println("#########################");
		return msg;
		
	}

}
