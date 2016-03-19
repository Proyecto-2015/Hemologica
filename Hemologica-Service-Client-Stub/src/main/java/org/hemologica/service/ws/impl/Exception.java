
package org.hemologica.service.ws.impl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://ws.service.hemologica.org/")
public class Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private org.hemologica.service.ws.Exception faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Exception(String message, org.hemologica.service.ws.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public Exception(String message, org.hemologica.service.ws.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.hemologica.service.ws.Exception
     */
    public org.hemologica.service.ws.Exception getFaultInfo() {
        return faultInfo;
    }

}