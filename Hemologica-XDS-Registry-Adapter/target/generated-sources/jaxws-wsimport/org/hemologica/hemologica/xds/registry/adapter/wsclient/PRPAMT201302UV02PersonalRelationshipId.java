
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PRPA_MT201302UV02.PersonalRelationship.id complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PRPA_MT201302UV02.PersonalRelationship.id">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}II">
 *       &lt;attribute name="updateMode" type="{urn:hl7-org:v3}PRPA_MT201302UV02.PersonalRelationship.id.updateMode" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRPA_MT201302UV02.PersonalRelationship.id")
public class PRPAMT201302UV02PersonalRelationshipId
    extends II
{

    @XmlAttribute(name = "updateMode")
    protected PRPAMT201302UV02PersonalRelationshipIdUpdateMode updateMode;

    /**
     * Obtiene el valor de la propiedad updateMode.
     * 
     * @return
     *     possible object is
     *     {@link PRPAMT201302UV02PersonalRelationshipIdUpdateMode }
     *     
     */
    public PRPAMT201302UV02PersonalRelationshipIdUpdateMode getUpdateMode() {
        return updateMode;
    }

    /**
     * Define el valor de la propiedad updateMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PRPAMT201302UV02PersonalRelationshipIdUpdateMode }
     *     
     */
    public void setUpdateMode(PRPAMT201302UV02PersonalRelationshipIdUpdateMode value) {
        this.updateMode = value;
    }

}
