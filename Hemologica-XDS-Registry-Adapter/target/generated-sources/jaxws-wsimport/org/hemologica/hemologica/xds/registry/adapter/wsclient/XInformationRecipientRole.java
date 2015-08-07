
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_InformationRecipientRole.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_InformationRecipientRole">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ASSIGNED"/>
 *     &lt;enumeration value="HLTHCHRT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_InformationRecipientRole")
@XmlEnum
public enum XInformationRecipientRole {

    ASSIGNED,
    HLTHCHRT;

    public String value() {
        return name();
    }

    public static XInformationRecipientRole fromValue(String v) {
        return valueOf(v);
    }

}
