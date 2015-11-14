
package org.hemologica.xds.respository.adapter.repositorioxds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hemologica.xds.respository.adapter.oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotType1;
import org.hemologica.xds.respository.adapter.oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryErrorList;


/**
 * <p>Clase Java para RegistryResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistryResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{RepositorioXDS}RegistryErrorList" minOccurs="0"/>
 *         &lt;element name="Slot" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}SlotType1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryResponseType", propOrder = {
    "registryErrorList",
    "slot"
})
public class RegistryResponseType {

    @XmlElement(name = "RegistryErrorList", namespace = "RepositorioXDS")
    protected RegistryErrorList registryErrorList;
    @XmlElement(name = "Slot")
    protected List<SlotType1> slot;
    @XmlAttribute(name = "requestId")
    protected String requestId;
    @XmlAttribute(name = "status")
    protected String status;

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
     * Gets the value of the slot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SlotType1 }
     * 
     * 
     */
    public List<SlotType1> getSlot() {
        if (slot == null) {
            slot = new ArrayList<SlotType1>();
        }
        return this.slot;
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

}
