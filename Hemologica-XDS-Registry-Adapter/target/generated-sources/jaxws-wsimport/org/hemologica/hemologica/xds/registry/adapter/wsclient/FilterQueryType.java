
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FilterQueryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FilterQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterQueryType", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", propOrder = {
    "primaryFilter"
})
@XmlSeeAlso({
    RegistryObjectQueryType.class,
    BranchType.class
})
public abstract class FilterQueryType {

    @XmlElement(name = "PrimaryFilter")
    protected FilterType primaryFilter;

    /**
     * Obtiene el valor de la propiedad primaryFilter.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getPrimaryFilter() {
        return primaryFilter;
    }

    /**
     * Define el valor de la propiedad primaryFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setPrimaryFilter(FilterType value) {
        this.primaryFilter = value;
    }

}
