//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.06 at 05:17:28 PM UYST 
//


package org.hemologica.salud.ejb.cdas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for custodianType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="custodianType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignedCustodian" type="{urn:hl7-org:v3}assignedCustodianType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "custodianType", propOrder = {
    "assignedCustodian"
})
public class CustodianType {

    @XmlElement(required = true)
    protected AssignedCustodianType assignedCustodian;

    /**
     * Gets the value of the assignedCustodian property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedCustodianType }
     *     
     */
    public AssignedCustodianType getAssignedCustodian() {
        return assignedCustodian;
    }

    /**
     * Sets the value of the assignedCustodian property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedCustodianType }
     *     
     */
    public void setAssignedCustodian(AssignedCustodianType value) {
        this.assignedCustodian = value;
    }

}
