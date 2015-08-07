
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ServiceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ServiceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ServiceBinding" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", propOrder = {
    "serviceBinding"
})
public class ServiceType
    extends RegistryObjectType
{

    @XmlElement(name = "ServiceBinding")
    protected List<ServiceBindingType> serviceBinding;

    /**
     * Gets the value of the serviceBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceBindingType }
     * 
     * 
     */
    public List<ServiceBindingType> getServiceBinding() {
        if (serviceBinding == null) {
            serviceBinding = new ArrayList<ServiceBindingType>();
        }
        return this.serviceBinding;
    }

}
