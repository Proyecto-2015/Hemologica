
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubscriptionQueryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType">
 *       &lt;sequence>
 *         &lt;element name="SelectorQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}AdhocQueryQueryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionQueryType", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", propOrder = {
    "selectorQuery"
})
public class SubscriptionQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "SelectorQuery")
    protected AdhocQueryQueryType selectorQuery;

    /**
     * Obtiene el valor de la propiedad selectorQuery.
     * 
     * @return
     *     possible object is
     *     {@link AdhocQueryQueryType }
     *     
     */
    public AdhocQueryQueryType getSelectorQuery() {
        return selectorQuery;
    }

    /**
     * Define el valor de la propiedad selectorQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link AdhocQueryQueryType }
     *     
     */
    public void setSelectorQuery(AdhocQueryQueryType value) {
        this.selectorQuery = value;
    }

}
