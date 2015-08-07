
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_InformationRecipient.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_InformationRecipient">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PRCP"/>
 *     &lt;enumeration value="TRC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_InformationRecipient")
@XmlEnum
public enum XInformationRecipient {

    PRCP,
    TRC;

    public String value() {
        return name();
    }

    public static XInformationRecipient fromValue(String v) {
        return valueOf(v);
    }

}
