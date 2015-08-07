
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActInsurancePolicyCodeAutomobileByBOT.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInsurancePolicyCodeAutomobileByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AUTOPOL"/>
 *     &lt;enumeration value="COL"/>
 *     &lt;enumeration value="UNINSMOT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActInsurancePolicyCodeAutomobileByBOT")
@XmlEnum
public enum ActInsurancePolicyCodeAutomobileByBOT {

    AUTOPOL,
    COL,
    UNINSMOT;

    public String value() {
        return name();
    }

    public static ActInsurancePolicyCodeAutomobileByBOT fromValue(String v) {
        return valueOf(v);
    }

}
