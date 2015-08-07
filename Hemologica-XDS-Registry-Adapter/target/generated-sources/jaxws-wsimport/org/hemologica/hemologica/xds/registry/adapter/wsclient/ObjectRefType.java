
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Use to reference an Object by its id.
 *         Specifies the id attribute of the object as its id attribute.
 *         id attribute in ObjectAttributes is exactly the same syntax and semantics as
 *         id attribute in RegistryObject.
 *       
 * 
 * <p>Clase Java para ObjectRefType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjectRefType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}IdentifiableType">
 *       &lt;attribute name="createReplica" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectRefType", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0")
public class ObjectRefType
    extends IdentifiableType
{

    @XmlAttribute(name = "createReplica")
    protected Boolean createReplica;

    /**
     * Obtiene el valor de la propiedad createReplica.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCreateReplica() {
        if (createReplica == null) {
            return false;
        } else {
            return createReplica;
        }
    }

    /**
     * Define el valor de la propiedad createReplica.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateReplica(Boolean value) {
        this.createReplica = value;
    }

}
