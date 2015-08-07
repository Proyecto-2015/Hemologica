
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExtrinsicObjectQueryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExtrinsicObjectQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType">
 *       &lt;sequence>
 *         &lt;element name="ContentVersionInfoFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtrinsicObjectQueryType", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", propOrder = {
    "contentVersionInfoFilter"
})
public class ExtrinsicObjectQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "ContentVersionInfoFilter")
    protected FilterType contentVersionInfoFilter;

    /**
     * Obtiene el valor de la propiedad contentVersionInfoFilter.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getContentVersionInfoFilter() {
        return contentVersionInfoFilter;
    }

    /**
     * Define el valor de la propiedad contentVersionInfoFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setContentVersionInfoFilter(FilterType value) {
        this.contentVersionInfoFilter = value;
    }

}
