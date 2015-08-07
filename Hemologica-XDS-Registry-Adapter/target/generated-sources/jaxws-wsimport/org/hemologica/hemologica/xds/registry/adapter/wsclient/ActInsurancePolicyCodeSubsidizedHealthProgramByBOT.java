
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActInsurancePolicyCodeSubsidizedHealthProgramByBOT.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInsurancePolicyCodeSubsidizedHealthProgramByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SUBSIDIZ"/>
 *     &lt;enumeration value="SUBSIDMC"/>
 *     &lt;enumeration value="SUBSUPP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInsurancePolicyCodeSubsidizedHealthProgramByBOT")
@XmlEnum
public enum ActInsurancePolicyCodeSubsidizedHealthProgramByBOT {

    SUBSIDIZ,
    SUBSIDMC,
    SUBSUPP;

    public String value() {
        return name();
    }

    public static ActInsurancePolicyCodeSubsidizedHealthProgramByBOT fromValue(String v) {
        return valueOf(v);
    }

}
