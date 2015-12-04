package org.hemologica.dao.exceptions;

public class DAOException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Throwable cause;

	public DAOException(Throwable cause) {
		super(cause);
		this.cause = cause;
	}

	public DAOException(String message) {
		super(message);
	}

	public DAOException(Throwable cause, String message) {
		super(message,cause);
		this.cause = cause;
		
	}

	@Override
	public Throwable getCause(){
		return this.cause != null ? this.cause : super.getCause();
	}
	
}


