package org.hemologica.xmldatabase.exceptions;


/**
 * @author Paula Roche
 */
public class XMLDataBaseException extends Exception{

	private static final long serialVersionUID = 6251110991893955679L;

	private Throwable cause;
	
	@Override
	public synchronized Throwable getCause() {
		return cause != null ? cause : super.getCause();
	}

}
