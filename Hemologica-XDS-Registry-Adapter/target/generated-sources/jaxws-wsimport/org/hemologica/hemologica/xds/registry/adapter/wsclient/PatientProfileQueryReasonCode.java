
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PatientProfileQueryReasonCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PatientProfileQueryReasonCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ADMREV"/>
 *     &lt;enumeration value="PATCAR"/>
 *     &lt;enumeration value="PATREQ"/>
 *     &lt;enumeration value="PRCREV"/>
 *     &lt;enumeration value="REGUL"/>
 *     &lt;enumeration value="RSRCH"/>
 *     &lt;enumeration value="LEGAL"/>
 *     &lt;enumeration value="VALIDATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PatientProfileQueryReasonCode")
@XmlEnum
public enum PatientProfileQueryReasonCode {

    ADMREV,
    PATCAR,
    PATREQ,
    PRCREV,
    REGUL,
    RSRCH,
    LEGAL,
    VALIDATION;

    public String value() {
        return name();
    }

    public static PatientProfileQueryReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
