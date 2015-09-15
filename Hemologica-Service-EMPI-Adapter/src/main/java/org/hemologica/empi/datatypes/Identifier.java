package org.hemologica.empi.datatypes;

import java.io.Serializable;

public class Identifier implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7086951690126615799L;
	
	private String id;
	private String domain;
	
	public Identifier(){}
	
	public Identifier(String id, String domain){
		this.id = id;
		this.domain = domain;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}
}
