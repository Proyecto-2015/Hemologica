package org.hemologica.empi.adapter.message;

public class MessageFactoryException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6291217131610213795L;
	private Throwable cause;
	
	public MessageFactoryException(Throwable cause){
		this.cause = cause;
	}
	
	@Override
	public synchronized Throwable getCause() {
		return this.cause == null ? super.getCause() : this.cause;
	}
	
}
