package org.hemologica.salud.web.beans;

import java.io.Serializable;

public class TransfusionBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9131662582097993358L;

	private SessionBB sessionBB;


	public SessionBB getSessionBB() {
		return sessionBB;
	}


	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
	}
	
	
}
