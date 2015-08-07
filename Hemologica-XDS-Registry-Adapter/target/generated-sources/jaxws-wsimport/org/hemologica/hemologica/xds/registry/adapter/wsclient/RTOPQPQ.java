
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RTO_PQ_PQ complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RTO_PQ_PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}QTY">
 *       &lt;sequence>
 *         &lt;element name="numerator" type="{urn:hl7-org:v3}PQ"/>
 *         &lt;element name="denominator" type="{urn:hl7-org:v3}PQ"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTO_PQ_PQ", propOrder = {
    "numerator",
    "denominator"
})
public class RTOPQPQ
    extends QTY
{

    @XmlElement(required = true)
    protected PQ numerator;
    @XmlElement(required = true)
    protected PQ denominator;

    /**
     * Obtiene el valor de la propiedad numerator.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getNumerator() {
        return numerator;
    }

    /**
     * Define el valor de la propiedad numerator.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setNumerator(PQ value) {
        this.numerator = value;
    }

    /**
     * Obtiene el valor de la propiedad denominator.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getDenominator() {
        return denominator;
    }

    /**
     * Define el valor de la propiedad denominator.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setDenominator(PQ value) {
        this.denominator = value;
    }

}
