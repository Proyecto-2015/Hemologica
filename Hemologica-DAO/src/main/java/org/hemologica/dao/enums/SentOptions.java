package org.hemologica.dao.enums;

public enum SentOptions {
	
	SENT("sent"),
	ERROR("error"),
	NOT_SENT("not_sent");
	
	public String value;
	
	private SentOptions(String value) {
		
		this.value= value;
	}
}
