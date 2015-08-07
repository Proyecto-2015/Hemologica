
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_ActEncounterReason.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActEncounterReason">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MEDNEC"/>
 *     &lt;enumeration value="PAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActEncounterReason")
@XmlEnum
public enum XActEncounterReason {

    MEDNEC,
    PAT;

    public String value() {
        return name();
    }

    public static XActEncounterReason fromValue(String v) {
        return valueOf(v);
    }

}
