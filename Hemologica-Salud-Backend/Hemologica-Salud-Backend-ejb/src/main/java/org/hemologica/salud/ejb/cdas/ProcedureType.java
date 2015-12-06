//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.06 at 05:17:28 PM UYST 
//


package org.hemologica.salud.ejb.cdas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for procedureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="procedureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}templateIdType"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}idType"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}codeType"/>
 *         &lt;element name="statusCode" type="{urn:hl7-org:v3}statusCodeType"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}effectiveTimeType"/>
 *         &lt;element name="specimen" type="{urn:hl7-org:v3}specimenType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entryRelationship" type="{urn:hl7-org:v3}entryRelationshipType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "procedureType", propOrder = {
    "templateId",
    "id",
    "code",
    "statusCode",
    "effectiveTime",
    "specimen",
    "entryRelationship"
})
public class ProcedureType {

    @XmlElement(required = true)
    protected TemplateIdType templateId;
    @XmlElement(required = true)
    protected IdType id;
    @XmlElement(required = true)
    protected CodeType code;
    @XmlElement(required = true)
    protected StatusCodeType statusCode;
    @XmlElement(required = true)
    protected EffectiveTimeType effectiveTime;
    protected List<SpecimenType> specimen;
    protected List<EntryRelationshipType> entryRelationship;
    @XmlAttribute(name = "moodCode")
    protected String moodCode;
    @XmlAttribute(name = "classCode")
    protected String classCode;

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateIdType }
     *     
     */
    public TemplateIdType getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateIdType }
     *     
     */
    public void setTemplateId(TemplateIdType value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setId(IdType value) {
        this.id = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCode(CodeType value) {
        this.code = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodeType }
     *     
     */
    public StatusCodeType getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodeType }
     *     
     */
    public void setStatusCode(StatusCodeType value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveTimeType }
     *     
     */
    public EffectiveTimeType getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveTimeType }
     *     
     */
    public void setEffectiveTime(EffectiveTimeType value) {
        this.effectiveTime = value;
    }

    /**
     * Gets the value of the specimen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specimen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecimen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecimenType }
     * 
     * 
     */
    public List<SpecimenType> getSpecimen() {
        if (specimen == null) {
            specimen = new ArrayList<SpecimenType>();
        }
        return this.specimen;
    }

    /**
     * Gets the value of the entryRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryRelationshipType }
     * 
     * 
     */
    public List<EntryRelationshipType> getEntryRelationship() {
        if (entryRelationship == null) {
            entryRelationship = new ArrayList<EntryRelationshipType>();
        }
        return this.entryRelationship;
    }

    /**
     * Gets the value of the moodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoodCode() {
        return moodCode;
    }

    /**
     * Sets the value of the moodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoodCode(String value) {
        this.moodCode = value;
    }

    /**
     * Gets the value of the classCode property.
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
     * Sets the value of the classCode property.
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
