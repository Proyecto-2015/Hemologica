package org.hemologica.exceptions;

import java.io.Serializable;

public class HemologicaDAOExcetion extends HemologicaException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4794254990578144616L;
	
	public HemologicaDAOExcetion(Throwable cause) {
		super(cause);
	}

}
