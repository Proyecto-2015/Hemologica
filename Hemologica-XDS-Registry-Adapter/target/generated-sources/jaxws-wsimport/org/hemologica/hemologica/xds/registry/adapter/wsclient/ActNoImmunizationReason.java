
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActNoImmunizationReason.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActNoImmunizationReason">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IMMUNE"/>
 *     &lt;enumeration value="MEDPREC"/>
 *     &lt;enumeration value="OSTOCK"/>
 *     &lt;enumeration value="PATOBJ"/>
 *     &lt;enumeration value="PHILISOP"/>
 *     &lt;enumeration value="RELIG"/>
 *     &lt;enumeration value="VACEFF"/>
 *     &lt;enumeration value="VACSAF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActNoImmunizationReason")
@XmlEnum
public enum ActNoImmunizationReason {

    IMMUNE,
    MEDPREC,
    OSTOCK,
    PATOBJ,
    PHILISOP,
    RELIG,
    VACEFF,
    VACSAF;

    public String value() {
        return name();
    }

    public static ActNoImmunizationReason fromValue(String v) {
        return valueOf(v);
    }

}
