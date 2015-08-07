
package oasis.names.tc.ebxml_regrep.xsd.rs._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryError" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="highestSeverity" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registryError"
})
@XmlRootElement(name = "RegistryErrorList")
public class RegistryErrorList {

    @XmlElement(name = "RegistryError", required = true)
    protected List<RegistryError> registryError;
    @XmlAttribute(name = "highestSeverity")
    protected String highestSeverity;

    /**
     * Gets the value of the registryError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registryError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistryError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistryError }
     * 
     * 
     */
    public List<RegistryError> getRegistryError() {
        if (registryError == null) {
            registryError = new ArrayList<RegistryError>();
        }
        return this.registryError;
    }

    /**
     * Obtiene el valor de la propiedad highestSeverity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighestSeverity() {
        return highestSeverity;
    }

    /**
     * Define el valor de la propiedad highestSeverity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighestSeverity(String value) {
        this.highestSeverity = value;
    }

}
