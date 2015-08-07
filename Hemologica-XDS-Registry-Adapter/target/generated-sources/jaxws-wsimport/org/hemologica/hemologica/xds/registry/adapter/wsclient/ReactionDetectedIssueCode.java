
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReactionDetectedIssueCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ReactionDetectedIssueCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="REACT"/>
 *     &lt;enumeration value="ALGY"/>
 *     &lt;enumeration value="INT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReactionDetectedIssueCode")
@XmlEnum
public enum ReactionDetectedIssueCode {

    REACT,
    ALGY,
    INT;

    public String value() {
        return name();
    }

    public static ReactionDetectedIssueCode fromValue(String v) {
        return valueOf(v);
    }

}
