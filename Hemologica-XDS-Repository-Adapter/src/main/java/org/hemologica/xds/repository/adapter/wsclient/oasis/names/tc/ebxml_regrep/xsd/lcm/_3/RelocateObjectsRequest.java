
package oasis.names.tc.ebxml_regrep.xsd.lcm._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.AdhocQueryType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.ObjectRefType;
import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryRequestType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}AdhocQuery"/&gt;
 *         &lt;element name="SourceRegistry" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/&gt;
 *         &lt;element name="DestinationRegistry" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/&gt;
 *         &lt;element name="OwnerAtSource" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/&gt;
 *         &lt;element name="OwnerAtDestination" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
@XmlRootElement(name = "RelocateObjectsRequest")
public class RelocateObjectsRequest
    extends RegistryRequestType
{

    @XmlElement(name = "AdhocQuery", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", required = true)
    protected AdhocQueryType adhocQuery;
    @XmlElement(name = "SourceRegistry", required = true)
    protected ObjectRefType sourceRegistry;
    @XmlElement(name = "DestinationRegistry", required = true)
    protected ObjectRefType destinationRegistry;
    @XmlElement(name = "OwnerAtSource", required = true)
    protected ObjectRefType ownerAtSource;
    @XmlElement(name = "OwnerAtDestination", required = true)
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
