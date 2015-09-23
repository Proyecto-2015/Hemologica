package org.hemologica.salud.beans;

import java.io.Serializable;

public class DonationBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4834951080949861155L;

	
	private SessionBB sessionBB;


	public SessionBB getSessionBB() {
		return sessionBB;
	}


	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
	}
	
	
}
