
package oasis.names.tc.ebxml_regrep.xsd.rs._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ebxml_regrep.xsd.query._3.AdhocQueryResponse;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotListType;


/**
 * Base type for all ebXML Registry responses
 * 
 * <p>Clase Java para RegistryResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistryResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseSlotList" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}SlotListType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryErrorList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="status" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="requestId" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryResponseType", propOrder = {
    "responseSlotList",
    "registryErrorList"
})
@XmlSeeAlso({
    AdhocQueryResponse.class
})
public class RegistryResponseType {

    @XmlElement(name = "ResponseSlotList")
    protected SlotListType responseSlotList;
    @XmlElement(name = "RegistryErrorList")
    protected RegistryErrorList registryErrorList;
    @XmlAttribute(name = "status", required = true)
    protected String status;
    @XmlAttribute(name = "requestId")
    @XmlSchemaType(name = "anyURI")
    protected String requestId;

    /**
     * Obtiene el valor de la propiedad responseSlotList.
     * 
     * @return
     *     possible object is
     *     {@link SlotListType }
     *     
     */
    public SlotListType getResponseSlotList() {
        return responseSlotList;
    }

    /**
     * Define el valor de la propiedad responseSlotList.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotListType }
     *     
     */
    public void setResponseSlotList(SlotListType value) {
        this.responseSlotList = value;
    }

    /**
     * Obtiene el valor de la propiedad registryErrorList.
     * 
     * @return
     *     possible object is
     *     {@link RegistryErrorList }
     *     
     */
    public RegistryErrorList getRegistryErrorList() {
        return registryErrorList;
    }

    /**
     * Define el valor de la propiedad registryErrorList.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryErrorList }
     *     
     */
    public void setRegistryErrorList(RegistryErrorList value) {
        this.registryErrorList = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad requestId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Define el valor de la propiedad requestId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

}
