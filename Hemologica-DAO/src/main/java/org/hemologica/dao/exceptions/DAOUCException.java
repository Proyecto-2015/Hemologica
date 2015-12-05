package org.hemologica.dao.exceptions;

public class DAOUCException extends DAOException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DAOUCException(Throwable cause) {
		super(cause);
	}

	public DAOUCException(String message) {
		super(message);
	}

	public DAOUCException(Throwable cause, String message) {
		super(cause,message);
	}


}
