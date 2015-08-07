
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaimantCoveredPartyRoleType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaimantCoveredPartyRoleType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CRIMEVIC"/>
 *     &lt;enumeration value="INJ"/>
 *     &lt;enumeration value="INJWKR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClaimantCoveredPartyRoleType")
@XmlEnum
public enum ClaimantCoveredPartyRoleType {

    CRIMEVIC,
    INJ,
    INJWKR;

    public String value() {
        return name();
    }

    public static ClaimantCoveredPartyRoleType fromValue(String v) {
        return valueOf(v);
    }

}
