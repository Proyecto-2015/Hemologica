
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}AdhocQuery"/>
 *         &lt;element name="SourceRegistry" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/>
 *         &lt;element name="DestinationRegistry" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/>
 *         &lt;element name="OwnerAtSource" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/>
 *         &lt;element name="OwnerAtDestination" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adhocQuery",
    "sourceRegistry",
    "destinationRegistry",
    "ownerAtSource",
    "ownerAtDestination"
})
@XmlRootElement(name = "RelocateObjectsRequest", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0")
public class RelocateObjectsRequest
    extends RegistryRequestType
{

    @XmlElement(name = "AdhocQuery", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", required = true)
    protected AdhocQueryType adhocQuery;
    @XmlElement(name = "SourceRegistry", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", required = true)
    protected ObjectRefType sourceRegistry;
    @XmlElement(name = "DestinationRegistry", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", required = true)
    protected ObjectRefType destinationRegistry;
    @XmlElement(name = "OwnerAtSource", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", required = true)
    protected ObjectRefType ownerAtSource;
    @XmlElement(name = "OwnerAtDestination", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", required = true)
    protected ObjectRefType ownerAtDestination;

    /**
     * Obtiene el valor de la propiedad adhocQuery.
     * 
     * @return
     *     possible object is
     *     {@link AdhocQueryType }
     *     
     */
    public AdhocQueryType getAdhocQuery() {
        return adhocQuery;
    }

    /**
     * Define el valor de la propiedad adhocQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link AdhocQueryType }
     *     
     */
    public void setAdhocQuery(AdhocQueryType value) {
        this.adhocQuery = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceRegistry.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getSourceRegistry() {
        return sourceRegistry;
    }

    /**
     * Define el valor de la propiedad sourceRegistry.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setSourceRegistry(ObjectRefType value) {
        this.sourceRegistry = value;
    }

    /**
     * Obtiene el valor de la propiedad destinationRegistry.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getDestinationRegistry() {
        return destinationRegistry;
    }

    /**
     * Define el valor de la propiedad destinationRegistry.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setDestinationRegistry(ObjectRefType value) {
        this.destinationRegistry = value;
    }

    /**
     * Obtiene el valor de la propiedad ownerAtSource.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getOwnerAtSource() {
        return ownerAtSource;
    }

    /**
     * Define el valor de la propiedad ownerAtSource.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setOwnerAtSource(ObjectRefType value) {
        this.ownerAtSource = value;
    }

    /**
     * Obtiene el valor de la propiedad ownerAtDestination.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getOwnerAtDestination() {
        return ownerAtDestination;
    }

    /**
     * Define el valor de la propiedad ownerAtDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setOwnerAtDestination(ObjectRefType value) {
        this.ownerAtDestination = value;
    }

}
