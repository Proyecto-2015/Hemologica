
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParticipationTargetLocation.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationTargetLocation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LOC"/>
 *     &lt;enumeration value="DST"/>
 *     &lt;enumeration value="ELOC"/>
 *     &lt;enumeration value="ORG"/>
 *     &lt;enumeration value="RML"/>
 *     &lt;enumeration value="VIA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationTargetLocation")
@XmlEnum
public enum ParticipationTargetLocation {

    LOC,
    DST,
    ELOC,
    ORG,
    RML,
    VIA;

    public String value() {
        return name();
    }

    public static ParticipationTargetLocation fromValue(String v) {
        return valueOf(v);
    }

}
