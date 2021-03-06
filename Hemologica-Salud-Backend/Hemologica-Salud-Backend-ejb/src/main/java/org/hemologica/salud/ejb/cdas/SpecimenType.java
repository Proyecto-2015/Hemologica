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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specimenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="specimenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specimenRole" type="{urn:hl7-org:v3}specimenRoleType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specimenType", propOrder = {
    "specimenRole"
})
public class SpecimenType {

    @XmlElement(required = true)
    protected SpecimenRoleType specimenRole;
    @XmlAttribute(name = "typeCode")
    protected String typeCode;

    /**
     * Gets the value of the specimenRole property.
     * 
     * @return
     *     possible object is
     *     {@link SpecimenRoleType }
     *     
     */
    public SpecimenRoleType getSpecimenRole() {
        return specimenRole;
    }

    /**
     * Sets the value of the specimenRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecimenRoleType }
     *     
     */
    public void setSpecimenRole(SpecimenRoleType value) {
        this.specimenRole = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

}
