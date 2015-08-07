
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Notification of registry events.
 * 
 * <p>Clase Java para NotificationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NotificationType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectList"/>
 *       &lt;/sequence>
 *       &lt;attribute name="subscription" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationType", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", propOrder = {
    "registryObjectList"
})
public class NotificationType
    extends RegistryObjectType
{

    @XmlElement(name = "RegistryObjectList", required = true)
    protected RegistryObjectListType registryObjectList;
    @XmlAttribute(name = "subscription", required = true)
    protected String subscription;

    /**
     * Obtiene el valor de la propiedad registryObjectList.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectListType }
     *     
     */
    public RegistryObjectListType getRegistryObjectList() {
        return registryObjectList;
    }

    /**
     * Define el valor de la propiedad registryObjectList.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectListType }
     *     
     */
    public void setRegistryObjectList(RegistryObjectListType value) {
        this.registryObjectList = value;
    }

    /**
     * Obtiene el valor de la propiedad subscription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscription() {
        return subscription;
    }

    /**
     * Define el valor de la propiedad subscription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscription(String value) {
        this.subscription = value;
    }

}
