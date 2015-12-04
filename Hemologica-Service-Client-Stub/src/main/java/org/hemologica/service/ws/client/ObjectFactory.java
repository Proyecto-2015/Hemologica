
package org.hemologica.service.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.hemologica.service.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@SuppressWarnings("restriction")
@XmlRegistry
public class ObjectFactory {

    private final static QName _PROVIDECDA_QNAME = new QName("http://ws.service.hemologica.org/", "PROVIDE_CDA");
    private final static QName _PROVIDECDAResponse_QNAME = new QName("http://ws.service.hemologica.org/", "PROVIDE_CDAResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.hemologica.service.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PROVIDECDA }
     * 
     */
    public PROVIDECDA createPROVIDECDA() {
        return new PROVIDECDA();
    }

    /**
     * Create an instance of {@link PROVIDECDAResponse }
     * 
     */
    public PROVIDECDAResponse createPROVIDECDAResponse() {
        return new PROVIDECDAResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PROVIDECDA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.hemologica.org/", name = "PROVIDE_CDA")
    public JAXBElement<PROVIDECDA> createPROVIDECDA(PROVIDECDA value) {
        return new JAXBElement<PROVIDECDA>(_PROVIDECDA_QNAME, PROVIDECDA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PROVIDECDAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.hemologica.org/", name = "PROVIDE_CDAResponse")
    public JAXBElement<PROVIDECDAResponse> createPROVIDECDAResponse(PROVIDECDAResponse value) {
        return new JAXBElement<PROVIDECDAResponse>(_PROVIDECDAResponse_QNAME, PROVIDECDAResponse.class, null, value);
    }

}
