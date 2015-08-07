
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DoseIntervalDetectedIssueCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DoseIntervalDetectedIssueCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DOSEIVL"/>
 *     &lt;enumeration value="DOSEIVLIND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DoseIntervalDetectedIssueCode")
@XmlEnum
public enum DoseIntervalDetectedIssueCode {

    DOSEIVL,
    DOSEIVLIND;

    public String value() {
        return name();
    }

    public static DoseIntervalDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
