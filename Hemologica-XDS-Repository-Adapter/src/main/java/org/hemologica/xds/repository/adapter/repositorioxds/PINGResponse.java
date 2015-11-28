
package org.hemologica.xds.repository.adapter.repositorioxds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PINGResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PINGResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pingresult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PINGResponse", namespace="tns:PINGResponse", propOrder = {
    "pingresult"
})
public class PINGResponse {

    @XmlElement(name = "Pingresult")
    protected String pingresult;

    /**
     * Obtiene el valor de la propiedad pingresult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPingresult() {
        return pingresult;
    }

    /**
     * Define el valor de la propiedad pingresult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPingresult(String value) {
        this.pingresult = value;
    }

}
