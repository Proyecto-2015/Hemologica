
package org.hemologica.xds.repository.adapter.wsclient.oasis.names.tc.ebxml_regrep.xsd.rs._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.hemologica.xds.repository.adapter.wsclient.oasis.names.tc.ebxml_regrep.xsd.lcm._3.AcceptObjectsRequest;
import org.hemologica.xds.repository.adapter.wsclient.oasis.names.tc.ebxml_regrep.xsd.lcm._3.ApproveObjectsRequest;
import org.hemologica.xds.repository.adapter.wsclient.oasis.names.tc.ebxml_regrep.xsd.lcm._3.DeprecateObjectsRequest;
import org.hemologica.xds.repository.adapter.wsclient.oasis.names.tc.ebxml_regrep.xsd.lcm._3.RelocateObjectsRequest;
import org.hemologica.xds.repository.adapter.wsclient.oasis.names.tc.ebxml_regrep.xsd.lcm._3.RemoveObjectsRequest;
import org.hemologica.xds.repository.adapter.wsclient.oasis.names.tc.ebxml_regrep.xsd.lcm._3.SubmitObjectsRequest;
import org.hemologica.xds.repository.adapter.wsclient.oasis.names.tc.ebxml_regrep.xsd.lcm._3.UndeprecateObjectsRequest;
import org.hemologica.xds.repository.adapter.wsclient.oasis.names.tc.ebxml_regrep.xsd.lcm._3.UpdateObjectsRequest;
import org.hemologica.xds.repository.adapter.wsclient.oasis.names.tc.ebxml_regrep.xsd.query._3.AdhocQueryRequest;
import org.hemologica.xds.repository.adapter.wsclient.oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotListType;


/**
 * Base type for all ebXML Registry requests
 * 
 * <p>Clase Java para RegistryRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistryRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestSlotList" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}SlotListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryRequestType", propOrder = {
    "requestSlotList"
})
@XmlSeeAlso({
    AcceptObjectsRequest.class,
    RelocateObjectsRequest.class,
    RemoveObjectsRequest.class,
    UndeprecateObjectsRequest.class,
    DeprecateObjectsRequest.class,
    ApproveObjectsRequest.class,
    UpdateObjectsRequest.class,
    SubmitObjectsRequest.class,
    AdhocQueryRequest.class
})
public class RegistryRequestType {

    @XmlElement(name = "RequestSlotList")
    protected SlotListType requestSlotList;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute(name = "comment")
    protected String comment;

    /**
     * Obtiene el valor de la propiedad requestSlotList.
     * 
     * @return
     *     possible object is
     *     {@link SlotListType }
     *     
     */
    public SlotListType getRequestSlotList() {
        return requestSlotList;
    }

    /**
     * Define el valor de la propiedad requestSlotList.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotListType }
     *     
     */
    public void setRequestSlotList(SlotListType value) {
        this.requestSlotList = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Define el valor de la propiedad comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
