package org.hemologica.empi.adapter.pixpdq.exception;

public abstract class AbstractAdapterException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8578198814887342473L;
	
	
	private Throwable cause;
	
	public AbstractAdapterException(Throwable cause){
		this.cause = cause;
	}
	
	@Override
	public synchronized Throwable getCause() {
		return cause != null ? cause : super.getCause();
	}
}
