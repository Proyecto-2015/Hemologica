
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CommunicationFunctionType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationFunctionType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RCV"/>
 *     &lt;enumeration value="RSP"/>
 *     &lt;enumeration value="SND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunicationFunctionType")
@XmlEnum
public enum CommunicationFunctionType {

    RCV,
    RSP,
    SND;

    public String value() {
        return name();
    }

    public static CommunicationFunctionType fromValue(String v) {
        return valueOf(v);
    }

}
