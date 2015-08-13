
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DocumentRegistry_PortType", targetNamespace = "urn:ihe:iti:xds-b:2007")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DocumentRegistryPortType {


    /**
     * 
     * @param body
     * @return
     *     returns org.hemologica.hemologica.xds.registry.adapter.wsclient.RegistryResponseType
     */
    @WebMethod(operationName = "DocumentRegistry_RegisterDocumentSet-b", action = "urn:ihe:iti:2007:RegisterDocumentSet-b")
    @WebResult(name = "RegistryResponse", targetNamespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", partName = "body")
    public RegistryResponseType documentRegistryRegisterDocumentSetB(
        @WebParam(name = "SubmitObjectsRequest", targetNamespace = "urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", partName = "body")
        SubmitObjectsRequest body);

    /**
     * 
     * @param body
     * @return
     *     returns org.hemologica.hemologica.xds.registry.adapter.wsclient.AdhocQueryResponse
     */
    @WebMethod(operationName = "DocumentRegistry_RegistryStoredQuery", action = "urn:ihe:iti:2007:RegistryStoredQuery")
    @WebResult(name = "AdhocQueryResponse", targetNamespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", partName = "body")
    public AdhocQueryResponse documentRegistryRegistryStoredQuery(
        @WebParam(name = "AdhocQueryRequest", targetNamespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", partName = "body")
        AdhocQueryRequest body);

    /**
     * 
     * @param body
     * @return
     *     returns org.hemologica.hemologica.xds.registry.adapter.wsclient.MCCIIN000002UV01
     */
    @WebMethod(operationName = "DocumentRegistry_PRPA_IN201301UV02", action = "urn:hl7-org:v3:PRPA_IN201301UV02")
    @WebResult(name = "MCCI_IN000002UV01", targetNamespace = "urn:hl7-org:v3", partName = "body")
    public MCCIIN000002UV01 documentRegistryPRPAIN201301UV02(
        @WebParam(name = "PRPA_IN201301UV02", targetNamespace = "urn:hl7-org:v3", partName = "body")
        PRPAIN201301UV02 body);

    /**
     * 
     * @param body
     * @return
     *     returns org.hemologica.hemologica.xds.registry.adapter.wsclient.MCCIIN000002UV01
     */
    @WebMethod(operationName = "DocumentRegistry_PRPA_IN201302UV02", action = "urn:hl7-org:v3:PRPA_IN201302UV02")
    @WebResult(name = "MCCI_IN000002UV01", targetNamespace = "urn:hl7-org:v3", partName = "body")
    public MCCIIN000002UV01 documentRegistryPRPAIN201302UV02(
        @WebParam(name = "PRPA_IN201302UV02", targetNamespace = "urn:hl7-org:v3", partName = "body")
        PRPAIN201302UV02 body);

    /**
     * 
     * @param body
     * @return
     *     returns org.hemologica.hemologica.xds.registry.adapter.wsclient.MCCIIN000002UV01
     */
    @WebMethod(operationName = "DocumentRegistry_PRPA_IN201304UV02", action = "urn:hl7-org:v3:PRPA_IN201304UV02")
    @WebResult(name = "MCCI_IN000002UV01", targetNamespace = "urn:hl7-org:v3", partName = "body")
    public MCCIIN000002UV01 documentRegistryPRPAIN201304UV02(
        @WebParam(name = "PRPA_IN201304UV02", targetNamespace = "urn:hl7-org:v3", partName = "body")
        PRPAIN201304UV02 body);

}