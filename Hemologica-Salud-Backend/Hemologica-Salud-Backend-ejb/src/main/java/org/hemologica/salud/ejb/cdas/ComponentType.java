//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.06 at 05:17:28 PM UYST 
//


package org.hemologica.salud.ejb.cdas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for componentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="componentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="observation" type="{urn:hl7-org:v3}observationType" minOccurs="0"/>
 *         &lt;element name="section" type="{urn:hl7-org:v3}sectionType" minOccurs="0"/>
 *         &lt;element name="structuredBody" type="{urn:hl7-org:v3}structuredBodyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "componentType", propOrder = {
    "observation",
    "section",
    "structuredBody"
})
public class ComponentType {

    protected ObservationType observation;
    protected SectionType section;
    protected StructuredBodyType structuredBody;

    /**
     * Gets the value of the observation property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationType }
     *     
     */
    public ObservationType getObservation() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationType }
     *     
     */
    public void setObservation(ObservationType value) {
        this.observation = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link SectionType }
     *     
     */
    public SectionType getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionType }
     *     
     */
    public void setSection(SectionType value) {
        this.section = value;
    }

    /**
     * Gets the value of the structuredBody property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredBodyType }
     *     
     */
    public StructuredBodyType getStructuredBody() {
        return structuredBody;
    }

    /**
     * Sets the value of the structuredBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredBodyType }
     *     
     */
    public void setStructuredBody(StructuredBodyType value) {
        this.structuredBody = value;
    }

}
