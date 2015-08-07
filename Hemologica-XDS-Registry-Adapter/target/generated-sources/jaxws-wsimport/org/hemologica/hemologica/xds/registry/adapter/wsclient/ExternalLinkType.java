
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         ExternalLink is the mapping of the same named interface in ebRIM.
 *         It extends RegistryObject.
 *       
 * 
 * <p>Clase Java para ExternalLinkType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExternalLinkType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType">
 *       &lt;attribute name="externalURI" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalLinkType", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0")
public class ExternalLinkType
    extends RegistryObjectType
{

    @XmlAttribute(name = "externalURI", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String externalURI;

    /**
     * Obtiene el valor de la propiedad externalURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalURI() {
        return externalURI;
    }

    /**
     * Define el valor de la propiedad externalURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalURI(String value) {
        this.externalURI = value;
    }

}
