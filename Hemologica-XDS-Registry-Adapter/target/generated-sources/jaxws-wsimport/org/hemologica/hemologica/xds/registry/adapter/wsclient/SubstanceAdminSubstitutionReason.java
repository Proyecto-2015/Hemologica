
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubstanceAdminSubstitutionReason.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SubstanceAdminSubstitutionReason">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="FP"/>
 *     &lt;enumeration value="OS"/>
 *     &lt;enumeration value="RR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubstanceAdminSubstitutionReason")
@XmlEnum
public enum SubstanceAdminSubstitutionReason {

    CT,
    FP,
    OS,
    RR;

    public String value() {
        return name();
    }

    public static SubstanceAdminSubstitutionReason fromValue(String v) {
        return valueOf(v);
    }

}
