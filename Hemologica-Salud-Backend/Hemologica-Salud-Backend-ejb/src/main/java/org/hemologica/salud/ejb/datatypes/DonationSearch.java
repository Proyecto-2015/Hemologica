package org.hemologica.salud.ejb.datatypes;

import java.io.Serializable;
import java.util.Date;

public class DonationSearch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2329098338218896354L;

	private String person;
	private Date from;
	private Date to;
	
	
	public DonationSearch(){}
	
	public DonationSearch(String person, Date from, Date to){
		this.person = person;
		this.from = from;
		this.to = to;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}
		
}
