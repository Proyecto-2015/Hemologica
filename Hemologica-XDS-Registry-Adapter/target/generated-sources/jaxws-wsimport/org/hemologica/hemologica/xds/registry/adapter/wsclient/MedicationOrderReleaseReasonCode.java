
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MedicationOrderReleaseReasonCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicationOrderReleaseReasonCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="HOLDINAP"/>
 *     &lt;enumeration value="HOLDDONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicationOrderReleaseReasonCode")
@XmlEnum
public enum MedicationOrderReleaseReasonCode {

    HOLDINAP,
    HOLDDONE;

    public String value() {
        return name();
    }

    public static MedicationOrderReleaseReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
