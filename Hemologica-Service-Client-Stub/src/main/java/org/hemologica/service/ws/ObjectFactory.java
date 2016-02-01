
package org.hemologica.service.ws;

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
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://ws.service.hemologica.org/", "Exception");
    private final static QName _ParseException_QNAME = new QName("http://ws.service.hemologica.org/", "ParseException");
    private final static QName _PROVIDECDA_QNAME = new QName("http://ws.service.hemologica.org/", "PROVIDE_CDA");
    private final static QName _PROVIDECDAResponse_QNAME = new QName("http://ws.service.hemologica.org/", "PROVIDE_CDAResponse");
    private final static QName _IMPORTMOVEMENTS_QNAME = new QName("http://ws.service.hemologica.org/", "IMPORT_MOVEMENTS");
    private final static QName _IMPORTMOVEMENTSResponse_QNAME = new QName("http://ws.service.hemologica.org/", "IMPORT_MOVEMENTSResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.hemologica.service.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IMPORTMOVEMENTSResponse }
     * 
     */
    public IMPORTMOVEMENTSResponse createIMPORTMOVEMENTSResponse() {
        return new IMPORTMOVEMENTSResponse();
    }

    /**
     * Create an instance of {@link IMPORTMOVEMENTS }
     * 
     */
    public IMPORTMOVEMENTS createIMPORTMOVEMENTS() {
        return new IMPORTMOVEMENTS();
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
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link MovementData }
     * 
     */
    public MovementData createMovementData() {
        return new MovementData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.hemologica.org/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.hemologica.org/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMPORTMOVEMENTS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.hemologica.org/", name = "IMPORT_MOVEMENTS")
    public JAXBElement<IMPORTMOVEMENTS> createIMPORTMOVEMENTS(IMPORTMOVEMENTS value) {
        return new JAXBElement<IMPORTMOVEMENTS>(_IMPORTMOVEMENTS_QNAME, IMPORTMOVEMENTS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMPORTMOVEMENTSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.hemologica.org/", name = "IMPORT_MOVEMENTSResponse")
    public JAXBElement<IMPORTMOVEMENTSResponse> createIMPORTMOVEMENTSResponse(IMPORTMOVEMENTSResponse value) {
        return new JAXBElement<IMPORTMOVEMENTSResponse>(_IMPORTMOVEMENTSResponse_QNAME, IMPORTMOVEMENTSResponse.class, null, value);
    }

}
