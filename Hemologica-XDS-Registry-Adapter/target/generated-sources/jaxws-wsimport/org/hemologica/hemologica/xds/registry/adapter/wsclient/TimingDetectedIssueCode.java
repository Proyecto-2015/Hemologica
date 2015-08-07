
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TimingDetectedIssueCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TimingDetectedIssueCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="TIME"/>
 *     &lt;enumeration value="ENDLATE"/>
 *     &lt;enumeration value="STRTLATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimingDetectedIssueCode")
@XmlEnum
public enum TimingDetectedIssueCode {

    TIME,
    ENDLATE,
    STRTLATE;

    public String value() {
        return name();
    }

    public static TimingDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
