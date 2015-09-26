package org.hemologica.salud.beans;

import java.io.Serializable;
import java.util.Date;

public class DonationBB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4834951080949861155L;

	private SessionBB sessionBB;

	// search inputs
	private String searchPerson;
	private Date searchDateFrom;
	private Date searchDateTo;
	private String searchState;
	
	
	

	public SessionBB getSessionBB() {
		return sessionBB;
	}


	public void setSessionBB(SessionBB sessionBB) {
		this.sessionBB = sessionBB;
	}


	public String getSearchPerson() {
		return searchPerson;
	}


	public void setSearchPerson(String searchPerson) {
		this.searchPerson = searchPerson;
	}


	public Date getSearchDateFrom() {
		return searchDateFrom;
	}


	public void setSearchDateFrom(Date searchDateFrom) {
		this.searchDateFrom = searchDateFrom;
	}


	public Date getSearchDateTo() {
		return searchDateTo;
	}


	public void setSearchDateTo(Date searchDateTo) {
		this.searchDateTo = searchDateTo;
	}


	public String getSearchState() {
		return searchState;
	}


	public void setSearchState(String searchState) {
		this.searchState = searchState;
	}


	
	
	
}
