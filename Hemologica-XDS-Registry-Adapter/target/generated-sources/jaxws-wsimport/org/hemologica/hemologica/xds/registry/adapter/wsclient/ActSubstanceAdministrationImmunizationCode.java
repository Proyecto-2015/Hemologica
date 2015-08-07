
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActSubstanceAdministrationImmunizationCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActSubstanceAdministrationImmunizationCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IMMUNIZ"/>
 *     &lt;enumeration value="BOOSTER"/>
 *     &lt;enumeration value="INITIMMUNIZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActSubstanceAdministrationImmunizationCode")
@XmlEnum
public enum ActSubstanceAdministrationImmunizationCode {

    IMMUNIZ,
    BOOSTER,
    INITIMMUNIZ;

    public String value() {
        return name();
    }

    public static ActSubstanceAdministrationImmunizationCode fromValue(String v) {
        return valueOf(v);
    }

}
