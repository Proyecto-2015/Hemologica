
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract Base type for all types of Notify Actions
 * 
 * <p>Clase Java para NotifyActionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NotifyActionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ActionType">
 *       &lt;attribute name="notificationOption" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" default="urn:oasis:names:tc:ebxml-regrep:NotificationOptionType:ObjectRefs" />
 *       &lt;attribute name="endPoint" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyActionType", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0")
public class NotifyActionType
    extends ActionType
{

    @XmlAttribute(name = "notificationOption")
    protected String notificationOption;
    @XmlAttribute(name = "endPoint", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String endPoint;

    /**
     * Obtiene el valor de la propiedad notificationOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationOption() {
        if (notificationOption == null) {
            return "urn:oasis:names:tc:ebxml-regrep:NotificationOptionType:ObjectRefs";
        } else {
            return notificationOption;
        }
    }

    /**
     * Define el valor de la propiedad notificationOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationOption(String value) {
        this.notificationOption = value;
    }

    /**
     * Obtiene el valor de la propiedad endPoint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPoint() {
        return endPoint;
    }

    /**
     * Define el valor de la propiedad endPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPoint(String value) {
        this.endPoint = value;
    }

}
