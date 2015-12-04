package org.hemologica.dao.exceptions;

public class DAOFKException extends DAOException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DAOFKException(Throwable cause) {
		super(cause);
	}

	public DAOFKException(String message) {
		super(message);
	}

	public DAOFKException(Throwable cause, String message) {
		super(cause,message);
	}

}
