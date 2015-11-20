package org.hemologica.service.activator;

public class CDALocalProcessActivator {

	public String process(String msg){
		
		System.out.println("#########################");
		System.out.println(msg);
		System.out.println("#########################");
		return msg;
		
	}
}
