
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para COCT_MT090002UV01.AssignedEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT090002UV01.AssignedEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" maxOccurs="unbounded"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="addr" type="{urn:hl7-org:v3}AD" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="assignedPerson" type="{urn:hl7-org:v3}COCT_MT090002UV01.Person"/>
 *           &lt;element name="assignedDevice" type="{urn:hl7-org:v3}COCT_MT090002UV01.Device"/>
 *           &lt;element name="assignedOrganization" type="{urn:hl7-org:v3}COCT_MT090002UV01.Organization"/>
 *         &lt;/choice>
 *         &lt;element name="representedOrganization" type="{urn:hl7-org:v3}COCT_MT150002UV01.Organization"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClassAssignedEntity" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT090002UV01.AssignedEntity", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "addr",
    "assignedPerson",
    "assignedDevice",
    "assignedOrganization",
    "representedOrganization"
})
public class COCTMT090002UV01AssignedEntity {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    @XmlElement(required = true)
    protected List<II> id;
    protected CE code;
    protected List<AD> addr;
    @XmlElementRef(name = "assignedPerson", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT090002UV01Person> assignedPerson;
    @XmlElementRef(name = "assignedDevice", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT090002UV01Device> assignedDevice;
    @XmlElementRef(name = "assignedOrganization", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT090002UV01Organization> assignedOrganization;
    @XmlElement(required = true, nillable = true)
    protected COCTMT150002UV01Organization representedOrganization;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "classCode", required = true)
    protected String classCode;

    /**
     * Gets the value of the realmCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realmCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CS }
     * 
     * 
     */
    public List<CS> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<CS>();
        }
        return this.realmCode;
    }

    /**
     * Obtiene el valor de la propiedad typeId.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getTypeId() {
        return typeId;
    }

    /**
     * Define el valor de la propiedad typeId.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setTypeId(II value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getId() {
        if (id == null) {
            id = new ArrayList<II>();
        }
        return this.id;
    }

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCode(CE value) {
        this.code = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AD }
     * 
     * 
     */
    public List<AD> getAddr() {
        if (addr == null) {
            addr = new ArrayList<AD>();
        }
        return this.addr;
    }

    /**
     * Obtiene el valor de la propiedad assignedPerson.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT090002UV01Person }{@code >}
     *     
     */
    public JAXBElement<COCTMT090002UV01Person> getAssignedPerson() {
        return assignedPerson;
    }

    /**
     * Define el valor de la propiedad assignedPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT090002UV01Person }{@code >}
     *     
     */
    public void setAssignedPerson(JAXBElement<COCTMT090002UV01Person> value) {
        this.assignedPerson = value;
    }

    /**
     * Obtiene el valor de la propiedad assignedDevice.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT090002UV01Device }{@code >}
     *     
     */
    public JAXBElement<COCTMT090002UV01Device> getAssignedDevice() {
        return assignedDevice;
    }

    /**
     * Define el valor de la propiedad assignedDevice.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT090002UV01Device }{@code >}
     *     
     */
    public void setAssignedDevice(JAXBElement<COCTMT090002UV01Device> value) {
        this.assignedDevice = value;
    }

    /**
     * Obtiene el valor de la propiedad assignedOrganization.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT090002UV01Organization }{@code >}
     *     
     */
    public JAXBElement<COCTMT090002UV01Organization> getAssignedOrganization() {
        return assignedOrganization;
    }

    /**
     * Define el valor de la propiedad assignedOrganization.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT090002UV01Organization }{@code >}
     *     
     */
    public void setAssignedOrganization(JAXBElement<COCTMT090002UV01Organization> value) {
        this.assignedOrganization = value;
    }

    /**
     * Obtiene el valor de la propiedad representedOrganization.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT150002UV01Organization }
     *     
     */
    public COCTMT150002UV01Organization getRepresentedOrganization() {
        return representedOrganization;
    }

    /**
     * Define el valor de la propiedad representedOrganization.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT150002UV01Organization }
     *     
     */
    public void setRepresentedOrganization(COCTMT150002UV01Organization value) {
        this.representedOrganization = value;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nullFlavor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNullFlavor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNullFlavor() {
        if (nullFlavor == null) {
            nullFlavor = new ArrayList<String>();
        }
        return this.nullFlavor;
    }

    /**
     * Obtiene el valor de la propiedad classCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Define el valor de la propiedad classCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

}
