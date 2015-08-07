
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A character string token representing a part of a name.
 *             May have a type code signifying the role of the part in
 *             the whole entity name, and a qualifier code for more detail
 *             about the name part type. Typical name parts for person
 *             names are given names, and family names, titles, etc.
 *          
 * 
 * <p>Clase Java para ENXP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ENXP">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}ST">
 *       &lt;attribute name="partType" type="{urn:hl7-org:v3}EntityNamePartType" />
 *       &lt;attribute name="qualifier" type="{urn:hl7-org:v3}set_EntityNamePartQualifier" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENXP")
@XmlSeeAlso({
    EnDelimiter.class,
    EnGiven.class,
    EnFamily.class,
    EnSuffix.class,
    EnPrefix.class
})
public class ENXP
    extends ST
{

    @XmlAttribute(name = "partType")
    protected String partType;
    @XmlAttribute(name = "qualifier")
    protected List<String> qualifier;

    /**
     * Obtiene el valor de la propiedad partType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartType() {
        return partType;
    }

    /**
     * Define el valor de la propiedad partType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartType(String value) {
        this.partType = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQualifier() {
        if (qualifier == null) {
            qualifier = new ArrayList<String>();
        }
        return this.qualifier;
    }

}
