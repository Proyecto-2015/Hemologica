package org.hemologica.service.ws.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPFault;
import javax.xml.ws.WebFault;
import javax.xml.ws.soap.SOAPFaultException;

@WebFault(name = "ServiceException")
public class ServiceException extends SOAPFaultException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public static String CDA_VALIDATION_SCHEMA_ERROR_CODE = "1";
	public static String CDA_VALIDATION_SCHEMA_ERROR_DETAILS = "Invalid CDA schema";
	
	
	public ServiceException(SOAPFault fault) {
		super(fault);
	}
	
	public static ServiceException create(String code, String details){
		   
			try {       
	        
				SOAPFault fault = SOAPFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL).createFault();
	            fault.setFaultCode(code);
	            fault.setFaultString(details);
	            return new ServiceException(fault);
	           
	        } catch (SOAPException ex) {
	            Logger.getLogger(ServiceException.class.getName()).log(Level.SEVERE, null, ex);
	            return null;
	        }
		
	}
	
	
}
