
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SupplyDetectedIssueCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplyDetectedIssueCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="TOOLATE"/>
 *     &lt;enumeration value="TOOSOON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupplyDetectedIssueCode")
@XmlEnum
public enum SupplyDetectedIssueCode {

    TOOLATE,
    TOOSOON;

    public String value() {
        return name();
    }

    public static SupplyDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
