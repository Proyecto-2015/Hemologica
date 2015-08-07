
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A concept qualifier code with optionally named role.
 *             Both qualifier role and value codes must be defined by
 *             the coding system.  For example, if SNOMED RT defines a
 *             concept "leg", a role relation "has-laterality", and
 *             another concept "left", the concept role relation allows
 *             to add the qualifier "has-laterality: left" to a primary
 *             code "leg" to construct the meaning "left leg".
 *          
 * 
 * <p>Clase Java para CR complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CR">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}ANY">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn:hl7-org:v3}CV" minOccurs="0"/>
 *         &lt;element name="value" type="{urn:hl7-org:v3}CD" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="inverted" type="{urn:hl7-org:v3}bn" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CR", propOrder = {
    "name",
    "value"
})
public class CR
    extends ANY
{

    protected CV name;
    protected CD value;
    @XmlAttribute(name = "inverted")
    protected Boolean inverted;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link CV }
     *     
     */
    public CV getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link CV }
     *     
     */
    public void setName(CV value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setValue(CD value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad inverted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInverted() {
        if (inverted == null) {
            return false;
        } else {
            return inverted;
        }
    }

    /**
     * Define el valor de la propiedad inverted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInverted(Boolean value) {
        this.inverted = value;
    }

}
