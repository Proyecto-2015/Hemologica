/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hemologica.ejb.exceptions;

/**
 *
 * @author bruno
 */
public abstract class AbstractException extends Exception{
	
	protected Throwable cause;
	
	public AbstractException(Throwable cause){
		this.cause = cause;
	}

	@Override
	public synchronized Throwable getCause() {
		return this.cause;
	}
	
}
