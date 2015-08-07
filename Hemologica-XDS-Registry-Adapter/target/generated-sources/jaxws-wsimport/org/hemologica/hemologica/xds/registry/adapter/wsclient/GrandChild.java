
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GrandChild.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="GrandChild">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GRNDCHILD"/>
 *     &lt;enumeration value="GRNDDAU"/>
 *     &lt;enumeration value="GRNDSON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrandChild")
@XmlEnum
public enum GrandChild {

    GRNDCHILD,
    GRNDDAU,
    GRNDSON;

    public String value() {
        return name();
    }

    public static GrandChild fromValue(String v) {
        return valueOf(v);
    }

}
