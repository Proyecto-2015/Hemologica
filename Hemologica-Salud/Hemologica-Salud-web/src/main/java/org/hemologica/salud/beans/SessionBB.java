package org.hemologica.salud.beans;

import java.io.Serializable;

public class SessionBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2534391148649719007L;

	
	private ApplicationBB applicationBB;

	
	public ApplicationBB getApplicationBB() {
		return applicationBB;
	}


	public void setApplicationBB(ApplicationBB applicationBB) {
		this.applicationBB = applicationBB;
	}
	
}
