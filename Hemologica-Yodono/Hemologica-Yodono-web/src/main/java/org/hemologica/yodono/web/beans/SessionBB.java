package org.hemologica.yodono.web.beans;

import java.io.Serializable;

import org.hemologica.yodono.web.utils.JSFUtils;

public class SessionBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2534391148649719007L;

	
	private ApplicationBB applicationBB;

	
	
	public String redirectTo(String go){
		
		System.out.println("REDIRECT TO: "+ go);
		return go;
		
	}
	
	
	
	
	
	
	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}


	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}
	
}
