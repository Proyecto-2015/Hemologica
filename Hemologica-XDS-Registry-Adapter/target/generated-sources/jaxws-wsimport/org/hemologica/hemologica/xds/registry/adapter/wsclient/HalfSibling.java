
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HalfSibling.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="HalfSibling">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="HSIB"/>
 *     &lt;enumeration value="HBRO"/>
 *     &lt;enumeration value="HSIS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HalfSibling")
@XmlEnum
public enum HalfSibling {

    HSIB,
    HBRO,
    HSIS;

    public String value() {
        return name();
    }

    public static HalfSibling fromValue(String v) {
        return valueOf(v);
    }

}