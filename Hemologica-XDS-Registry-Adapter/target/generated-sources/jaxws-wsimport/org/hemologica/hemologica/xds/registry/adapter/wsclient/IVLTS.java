
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IVL_TS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IVL_TS">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}SXCM_TS">
 *       &lt;choice minOccurs="0">
 *         &lt;sequence>
 *           &lt;element name="low" type="{urn:hl7-org:v3}IVXB_TS"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="width" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *             &lt;element name="high" type="{urn:hl7-org:v3}IVXB_TS" minOccurs="0"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="high" type="{urn:hl7-org:v3}IVXB_TS"/>
 *         &lt;sequence>
 *           &lt;element name="width" type="{urn:hl7-org:v3}PQ"/>
 *           &lt;element name="high" type="{urn:hl7-org:v3}IVXB_TS" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="center" type="{urn:hl7-org:v3}TS"/>
 *           &lt;element name="width" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVL_TS", propOrder = {
    "rest"
})
public class IVLTS
    extends SXCMTS
{

    @XmlElementRefs({
        @XmlElementRef(name = "width", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "high", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "low", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "center", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends QTY>> rest;

    /**
     * Obtiene el resto del modelo de contenido. 
     * 
     * <p>
     * Ha obtenido esta propiedad que permite capturar todo por el siguiente motivo: 
     * El nombre de campo "High" se está utilizando en dos partes diferentes de un esquema. Consulte: 
     * línea 1757 de file:/home/bruno/NetBeansProjects/Hemologica-XDS-Registry-Adapter/src/schema/HL7V3/NE2008/coreschemas/datatypes-base.xsd
     * línea 1748 de file:/home/bruno/NetBeansProjects/Hemologica-XDS-Registry-Adapter/src/schema/HL7V3/NE2008/coreschemas/datatypes-base.xsd
     * <p>
     * Para deshacerse de esta propiedad, aplique una personalización de propiedad a una
     * de las dos declaraciones siguientes para cambiarles de nombre: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link IVXBTS }{@code >}
     * {@link JAXBElement }{@code <}{@link IVXBTS }{@code >}
     * {@link JAXBElement }{@code <}{@link TS }{@code >}
     * {@link JAXBElement }{@code <}{@link PQ }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends QTY>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends QTY>>();
        }
        return this.rest;
    }

}
