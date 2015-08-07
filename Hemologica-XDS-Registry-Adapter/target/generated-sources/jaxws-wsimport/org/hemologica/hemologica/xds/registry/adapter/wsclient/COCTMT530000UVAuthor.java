
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para COCT_MT530000UV.Author complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT530000UV.Author">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="noteText" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="time" type="{urn:hl7-org:v3}TS" minOccurs="0"/>
 *         &lt;element name="modeCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="signatureCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="signatureText" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="relatedEntity" type="{urn:hl7-org:v3}COCT_MT530000UV.RelatedEntity"/>
 *           &lt;element name="patient" type="{urn:hl7-org:v3}COCT_MT050000UV01.Patient"/>
 *           &lt;element name="assignedEntity" type="{urn:hl7-org:v3}COCT_MT090000UV01.AssignedEntity"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="typeCode" use="required" type="{urn:hl7-org:v3}ParticipationType" fixed="AUT" />
 *       &lt;attribute name="contextControlCode" type="{urn:hl7-org:v3}ContextControl" default="OP" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT530000UV.Author", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "noteText",
    "time",
    "modeCode",
    "signatureCode",
    "signatureText",
    "relatedEntity",
    "patient",
    "assignedEntity"
})
public class COCTMT530000UVAuthor {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected ED noteText;
    protected TS time;
    protected CE modeCode;
    protected CE signatureCode;
    protected ED signatureText;
    @XmlElementRef(name = "relatedEntity", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT530000UVRelatedEntity> relatedEntity;
    @XmlElementRef(name = "patient", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT050000UV01Patient> patient;
    @XmlElementRef(name = "assignedEntity", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT090000UV01AssignedEntity> assignedEntity;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "typeCode", required = true)
    protected List<String> typeCode;
    @XmlAttribute(name = "contextControlCode")
    protected String contextControlCode;

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
     * Obtiene el valor de la propiedad noteText.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getNoteText() {
        return noteText;
    }

    /**
     * Define el valor de la propiedad noteText.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setNoteText(ED value) {
        this.noteText = value;
    }

    /**
     * Obtiene el valor de la propiedad time.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getTime() {
        return time;
    }

    /**
     * Define el valor de la propiedad time.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setTime(TS value) {
        this.time = value;
    }

    /**
     * Obtiene el valor de la propiedad modeCode.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getModeCode() {
        return modeCode;
    }

    /**
     * Define el valor de la propiedad modeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setModeCode(CE value) {
        this.modeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureCode.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getSignatureCode() {
        return signatureCode;
    }

    /**
     * Define el valor de la propiedad signatureCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setSignatureCode(CE value) {
        this.signatureCode = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureText.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getSignatureText() {
        return signatureText;
    }

    /**
     * Define el valor de la propiedad signatureText.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setSignatureText(ED value) {
        this.signatureText = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedEntity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVRelatedEntity }{@code >}
     *     
     */
    public JAXBElement<COCTMT530000UVRelatedEntity> getRelatedEntity() {
        return relatedEntity;
    }

    /**
     * Define el valor de la propiedad relatedEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT530000UVRelatedEntity }{@code >}
     *     
     */
    public void setRelatedEntity(JAXBElement<COCTMT530000UVRelatedEntity> value) {
        this.relatedEntity = value;
    }

    /**
     * Obtiene el valor de la propiedad patient.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT050000UV01Patient }{@code >}
     *     
     */
    public JAXBElement<COCTMT050000UV01Patient> getPatient() {
        return patient;
    }

    /**
     * Define el valor de la propiedad patient.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT050000UV01Patient }{@code >}
     *     
     */
    public void setPatient(JAXBElement<COCTMT050000UV01Patient> value) {
        this.patient = value;
    }

    /**
     * Obtiene el valor de la propiedad assignedEntity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT090000UV01AssignedEntity }{@code >}
     *     
     */
    public JAXBElement<COCTMT090000UV01AssignedEntity> getAssignedEntity() {
        return assignedEntity;
    }

    /**
     * Define el valor de la propiedad assignedEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT090000UV01AssignedEntity }{@code >}
     *     
     */
    public void setAssignedEntity(JAXBElement<COCTMT090000UV01AssignedEntity> value) {
        this.assignedEntity = value;
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
     * Gets the value of the typeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeCode() {
        if (typeCode == null) {
            typeCode = new ArrayList<String>();
        }
        return this.typeCode;
    }

    /**
     * Obtiene el valor de la propiedad contextControlCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextControlCode() {
        if (contextControlCode == null) {
            return "OP";
        } else {
            return contextControlCode;
        }
    }

    /**
     * Define el valor de la propiedad contextControlCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextControlCode(String value) {
        this.contextControlCode = value;
    }

}
