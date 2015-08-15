
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
 * <p>Clase Java para IVL_MO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IVL_MO">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}SXCM_MO">
 *       &lt;choice minOccurs="0">
 *         &lt;sequence>
 *           &lt;element name="low" type="{urn:hl7-org:v3}IVXB_MO"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="width" type="{urn:hl7-org:v3}MO" minOccurs="0"/>
 *             &lt;element name="high" type="{urn:hl7-org:v3}IVXB_MO" minOccurs="0"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="high" type="{urn:hl7-org:v3}IVXB_MO"/>
 *         &lt;sequence>
 *           &lt;element name="width" type="{urn:hl7-org:v3}MO"/>
 *           &lt;element name="high" type="{urn:hl7-org:v3}IVXB_MO" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="center" type="{urn:hl7-org:v3}MO"/>
 *           &lt;element name="width" type="{urn:hl7-org:v3}MO" minOccurs="0"/>
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
@XmlType(name = "IVL_MO", propOrder = {
    "rest"
})
public class IVLMO
    extends SXCMMO
{

    @XmlElementRefs({
        @XmlElementRef(name = "low", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "high", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "width", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "center", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends MO>> rest;

    /**
     * Obtiene el resto del modelo de contenido. 
     * 
     * <p>
     * Ha obtenido esta propiedad que permite capturar todo por el siguiente motivo: 
     * El nombre de campo "High" se est\u00e1 utilizando en dos partes diferentes de un esquema. Consulte: 
     * l\u00ednea 1003 de file:/Users/paularoche/Documents/workspaces/proyecto/Hemologica/Hemologica-XDS-Registry-Adapter/src/schema/HL7V3/NE2008/coreschemas/datatypes.xsd
     * l\u00ednea 994 de file:/Users/paularoche/Documents/workspaces/proyecto/Hemologica/Hemologica-XDS-Registry-Adapter/src/schema/HL7V3/NE2008/coreschemas/datatypes.xsd
     * <p>
     * Para deshacerse de esta propiedad, aplique una personalizaci\u00f3n de propiedad a una
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
     * {@link JAXBElement }{@code <}{@link IVXBMO }{@code >}
     * {@link JAXBElement }{@code <}{@link MO }{@code >}
     * {@link JAXBElement }{@code <}{@link MO }{@code >}
     * {@link JAXBElement }{@code <}{@link IVXBMO }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends MO>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends MO>>();
        }
        return this.rest;
    }

}
