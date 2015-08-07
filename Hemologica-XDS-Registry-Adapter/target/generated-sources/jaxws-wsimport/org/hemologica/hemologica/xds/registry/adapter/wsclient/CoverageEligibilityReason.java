
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CoverageEligibilityReason.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CoverageEligibilityReason">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AGE"/>
 *     &lt;enumeration value="CRIME"/>
 *     &lt;enumeration value="DIS"/>
 *     &lt;enumeration value="EMPLOY"/>
 *     &lt;enumeration value="FINAN"/>
 *     &lt;enumeration value="HEALTH"/>
 *     &lt;enumeration value="VEHIC"/>
 *     &lt;enumeration value="MULTI"/>
 *     &lt;enumeration value="PNC"/>
 *     &lt;enumeration value="STATUTORY"/>
 *     &lt;enumeration value="WORK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CoverageEligibilityReason")
@XmlEnum
public enum CoverageEligibilityReason {

    AGE,
    CRIME,
    DIS,
    EMPLOY,
    FINAN,
    HEALTH,
    VEHIC,
    MULTI,
    PNC,
    STATUTORY,
    WORK;

    public String value() {
        return name();
    }

    public static CoverageEligibilityReason fromValue(String v) {
        return valueOf(v);
    }

}
