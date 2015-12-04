
package org.hemologica.service.ws.client.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiceImplService", targetNamespace = "http://impl.ws.service.hemologica.org/", wsdlLocation = "http://localhost:8080/Hemologica-Service/Service?wsdl")
public class ServiceImplService
    extends javax.xml.ws.Service
{

    private final static URL SERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICEIMPLSERVICE_EXCEPTION;
    private final static QName SERVICEIMPLSERVICE_QNAME = new QName("http://impl.ws.service.hemologica.org/", "ServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Hemologica-Service/Service?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEIMPLSERVICE_WSDL_LOCATION = url;
        SERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public ServiceImplService() {
        super(__getWsdlLocation(), SERVICEIMPLSERVICE_QNAME);
    }

    public ServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEIMPLSERVICE_QNAME, features);
    }

    public ServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICEIMPLSERVICE_QNAME);
    }

    public ServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEIMPLSERVICE_QNAME, features);
    }

    public ServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Service
     */
    @WebEndpoint(name = "ServiceImplPort")
    public org.hemologica.service.ws.client.impl.Service getServiceImplPort() {
        return super.getPort(new QName("http://impl.ws.service.hemologica.org/", "ServiceImplPort"), Service.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Service
     */
    @WebEndpoint(name = "ServiceImplPort")
    public org.hemologica.service.ws.client.impl.Service getServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.ws.service.hemologica.org/", "ServiceImplPort"), Service.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw SERVICEIMPLSERVICE_EXCEPTION;
        }
        return SERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
