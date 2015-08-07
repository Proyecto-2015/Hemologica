
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Note: because this type is defined as an extension of SXCM_T,
 *             all of the attributes and elements accepted for T are also
 *             accepted by this definition.  However, they are NOT allowed
 *             by the normative description of this type.  Unfortunately,
 *             we cannot write a general purpose schematron contraints to
 *             provide that extra validation, thus applications must be
 *             aware that instance (fragments) that pass validation with
 *             this might might still not be legal.
 *          
 * 
 * <p>Clase Java para EIVL_PPD_TS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EIVL_PPD_TS">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}SXCM_PPD_TS">
 *       &lt;sequence>
 *         &lt;element name="event" type="{urn:hl7-org:v3}EIVL.event" minOccurs="0"/>
 *         &lt;element name="offset" type="{urn:hl7-org:v3}IVL_PPD_PQ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIVL_PPD_TS", propOrder = {
    "event",
    "offset"
})
public class EIVLPPDTS
    extends SXCMPPDTS
{

    protected EIVLEvent event;
    protected IVLPPDPQ offset;

    /**
     * Obtiene el valor de la propiedad event.
     * 
     * @return
     *     possible object is
     *     {@link EIVLEvent }
     *     
     */
    public EIVLEvent getEvent() {
        return event;
    }

    /**
     * Define el valor de la propiedad event.
     * 
     * @param value
     *     allowed object is
     *     {@link EIVLEvent }
     *     
     */
    public void setEvent(EIVLEvent value) {
        this.event = value;
    }

    /**
     * Obtiene el valor de la propiedad offset.
     * 
     * @return
     *     possible object is
     *     {@link IVLPPDPQ }
     *     
     */
    public IVLPPDPQ getOffset() {
        return offset;
    }

    /**
     * Define el valor de la propiedad offset.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLPPDPQ }
     *     
     */
    public void setOffset(IVLPPDPQ value) {
        this.offset = value;
    }

}
