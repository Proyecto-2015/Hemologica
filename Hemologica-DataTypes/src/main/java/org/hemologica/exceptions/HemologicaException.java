package org.hemologica.exceptions;

import java.io.Serializable;

public class HemologicaException extends Exception implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1771513041099168867L;
	
	
	protected Throwable cause;
	
	
	public HemologicaException(Throwable cause){
		super();
		this.cause = cause;
		
	}
	
	@Override
	public Throwable getCause(){
		return this.cause != null ? this.cause : super.getCause();
	}
	
}
