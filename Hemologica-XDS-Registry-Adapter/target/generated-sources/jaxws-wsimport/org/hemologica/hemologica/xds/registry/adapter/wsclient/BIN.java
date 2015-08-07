
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Binary data is a raw block of bits. Binary data is a
 *             protected type that MUST not be used outside the data
 *             type specification.
 *          
 * 
 * <p>Clase Java para BIN complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BIN">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}ANY">
 *       &lt;attribute name="representation" type="{urn:hl7-org:v3}BinaryDataEncoding" default="TXT" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BIN")
@XmlSeeAlso({
    ED.class
})
public abstract class BIN
    extends ANY
{

    @XmlAttribute(name = "representation")
    protected BinaryDataEncoding representation;

    /**
     * Obtiene el valor de la propiedad representation.
     * 
     * @return
     *     possible object is
     *     {@link BinaryDataEncoding }
     *     
     */
    public BinaryDataEncoding getRepresentation() {
        if (representation == null) {
            return BinaryDataEncoding.TXT;
        } else {
            return representation;
        }
    }

    /**
     * Define el valor de la propiedad representation.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryDataEncoding }
     *     
     */
    public void setRepresentation(BinaryDataEncoding value) {
        this.representation = value;
    }

}
