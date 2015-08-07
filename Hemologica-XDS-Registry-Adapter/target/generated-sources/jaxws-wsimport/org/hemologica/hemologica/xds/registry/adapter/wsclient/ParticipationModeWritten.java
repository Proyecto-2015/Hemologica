
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParticipationModeWritten.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationModeWritten">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="WRITTEN"/>
 *     &lt;enumeration value="EMAILWRIT"/>
 *     &lt;enumeration value="HANDWRIT"/>
 *     &lt;enumeration value="FAXWRIT"/>
 *     &lt;enumeration value="TYPEWRIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationModeWritten")
@XmlEnum
public enum ParticipationModeWritten {

    WRITTEN,
    EMAILWRIT,
    HANDWRIT,
    FAXWRIT,
    TYPEWRIT;

    public String value() {
        return name();
    }

    public static ParticipationModeWritten fromValue(String v) {
        return valueOf(v);
    }

}
