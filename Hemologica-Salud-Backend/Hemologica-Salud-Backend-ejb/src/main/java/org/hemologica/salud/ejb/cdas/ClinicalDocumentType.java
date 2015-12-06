//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.06 at 05:17:28 PM UYST 
//


package org.hemologica.salud.ejb.cdas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClinicalDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClinicalDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}typeIdType"/>
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}templateIdType"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}idType"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}codeType"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}effectiveTimeType"/>
 *         &lt;element name="confidentialityCode" type="{urn:hl7-org:v3}confidentialityCodeType"/>
 *         &lt;element name="languageCode" type="{urn:hl7-org:v3}languageCodeType"/>
 *         &lt;element name="recordTarget" type="{urn:hl7-org:v3}recordTargetType"/>
 *         &lt;element name="author" type="{urn:hl7-org:v3}authorType"/>
 *         &lt;element name="custodian" type="{urn:hl7-org:v3}custodianType"/>
 *         &lt;element name="component" type="{urn:hl7-org:v3}componentType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClinicalDocumentType", propOrder = {
    "typeId",
    "templateId",
    "id",
    "code",
    "title",
    "effectiveTime",
    "confidentialityCode",
    "languageCode",
    "recordTarget",
    "author",
    "custodian",
    "component"
})

@XmlRootElement(name="ClinicalDocument")
public class ClinicalDocumentType {

    @XmlElement(required = true)
    protected TypeIdType typeId;
    @XmlElement(required = true)
    protected TemplateIdType templateId;
    @XmlElement(required = true)
    protected IdType id;
    @XmlElement(required = true)
    protected CodeType code;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected EffectiveTimeType effectiveTime;
    @XmlElement(required = true)
    protected ConfidentialityCodeType confidentialityCode;
    @XmlElement(required = true)
    protected LanguageCodeType languageCode;
    @XmlElement(required = true)
    protected RecordTargetType recordTarget;
    @XmlElement(required = true)
    protected AuthorType author;
    @XmlElement(required = true)
    protected CustodianType custodian;
    @XmlElement(required = true)
    protected ComponentType component;
    @XmlAttribute(name = "classCode")
    protected String classCode;
    @XmlAttribute(name = "moodCode")
    protected String moodCode;

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link TypeIdType }
     *     
     */
    public TypeIdType getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIdType }
     *     
     */
    public void setTypeId(TypeIdType value) {
        this.typeId = value;
    }

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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the confidentialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConfidentialityCodeType }
     *     
     */
    public ConfidentialityCodeType getConfidentialityCode() {
        return confidentialityCode;
    }

    /**
     * Sets the value of the confidentialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidentialityCodeType }
     *     
     */
    public void setConfidentialityCode(ConfidentialityCodeType value) {
        this.confidentialityCode = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguageCode(LanguageCodeType value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the recordTarget property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTargetType }
     *     
     */
    public RecordTargetType getRecordTarget() {
        return recordTarget;
    }

    /**
     * Sets the value of the recordTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTargetType }
     *     
     */
    public void setRecordTarget(RecordTargetType value) {
        this.recordTarget = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorType }
     *     
     */
    public AuthorType getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorType }
     *     
     */
    public void setAuthor(AuthorType value) {
        this.author = value;
    }

    /**
     * Gets the value of the custodian property.
     * 
     * @return
     *     possible object is
     *     {@link CustodianType }
     *     
     */
    public CustodianType getCustodian() {
        return custodian;
    }

    /**
     * Sets the value of the custodian property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustodianType }
     *     
     */
    public void setCustodian(CustodianType value) {
        this.custodian = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentType }
     *     
     */
    public ComponentType getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentType }
     *     
     */
    public void setComponent(ComponentType value) {
        this.component = value;
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

}
