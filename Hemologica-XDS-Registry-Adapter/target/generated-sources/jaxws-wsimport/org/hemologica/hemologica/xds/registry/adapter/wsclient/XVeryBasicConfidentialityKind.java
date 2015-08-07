
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_VeryBasicConfidentialityKind.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_VeryBasicConfidentialityKind">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="R"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_VeryBasicConfidentialityKind")
@XmlEnum
public enum XVeryBasicConfidentialityKind {

    N,
    R;

    public String value() {
        return name();
    }

    public static XVeryBasicConfidentialityKind fromValue(String v) {
        return valueOf(v);
    }

}
