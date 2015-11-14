
package org.hemologica.xds.respository.adapter.oasis.names.tc.ebxml_regrep.xsd.rim._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClassificationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClassificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LocalizedStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Slot" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}SlotType1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="classificationNode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="classificationScheme" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="classifiedObject" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="home" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nodeRepresentation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="objectType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationType", propOrder = {
    "name",
    "slot"
})
public class ClassificationType {

    @XmlElement(name = "Name")
    protected List<LocalizedStringType> name;
    @XmlElement(name = "Slot")
    protected List<SlotType1> slot;
    @XmlAttribute(name = "classificationNode")
    protected String classificationNode;
    @XmlAttribute(name = "classificationScheme")
    protected String classificationScheme;
    @XmlAttribute(name = "classifiedObject")
    protected String classifiedObject;
    @XmlAttribute(name = "home")
    protected String home;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "lid")
    protected String lid;
    @XmlAttribute(name = "nodeRepresentation")
    protected String nodeRepresentation;
    @XmlAttribute(name = "objectType")
    protected String objectType;
    @XmlAttribute(name = "status")
    protected String status;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizedStringType }
     * 
     * 
     */
    public List<LocalizedStringType> getName() {
        if (name == null) {
            name = new ArrayList<LocalizedStringType>();
        }
        return this.name;
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
     * Obtiene el valor de la propiedad classificationNode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationNode() {
        return classificationNode;
    }

    /**
     * Define el valor de la propiedad classificationNode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationNode(String value) {
        this.classificationNode = value;
    }

    /**
     * Obtiene el valor de la propiedad classificationScheme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationScheme() {
        return classificationScheme;
    }

    /**
     * Define el valor de la propiedad classificationScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationScheme(String value) {
        this.classificationScheme = value;
    }

    /**
     * Obtiene el valor de la propiedad classifiedObject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassifiedObject() {
        return classifiedObject;
    }

    /**
     * Define el valor de la propiedad classifiedObject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassifiedObject(String value) {
        this.classifiedObject = value;
    }

    /**
     * Obtiene el valor de la propiedad home.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHome() {
        return home;
    }

    /**
     * Define el valor de la propiedad home.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHome(String value) {
        this.home = value;
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
     * Obtiene el valor de la propiedad lid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLid() {
        return lid;
    }

    /**
     * Define el valor de la propiedad lid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLid(String value) {
        this.lid = value;
    }

    /**
     * Obtiene el valor de la propiedad nodeRepresentation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeRepresentation() {
        return nodeRepresentation;
    }

    /**
     * Define el valor de la propiedad nodeRepresentation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeRepresentation(String value) {
        this.nodeRepresentation = value;
    }

    /**
     * Obtiene el valor de la propiedad objectType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Define el valor de la propiedad objectType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
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
