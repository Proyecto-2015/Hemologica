
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PharmacySupplyRequestRenewalRefusalReasonCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PharmacySupplyRequestRenewalRefusalReasonCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="FAMPHYS"/>
 *     &lt;enumeration value="ONHOLD"/>
 *     &lt;enumeration value="MODIFY"/>
 *     &lt;enumeration value="ALREADYRX"/>
 *     &lt;enumeration value="NEEDAPMT"/>
 *     &lt;enumeration value="NOTPAT"/>
 *     &lt;enumeration value="NOTAVAIL"/>
 *     &lt;enumeration value="DISCONT"/>
 *     &lt;enumeration value="TOOEARLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PharmacySupplyRequestRenewalRefusalReasonCode")
@XmlEnum
public enum PharmacySupplyRequestRenewalRefusalReasonCode {

    FAMPHYS,
    ONHOLD,
    MODIFY,
    ALREADYRX,
    NEEDAPMT,
    NOTPAT,
    NOTAVAIL,
    DISCONT,
    TOOEARLY;

    public String value() {
        return name();
    }

    public static PharmacySupplyRequestRenewalRefusalReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
