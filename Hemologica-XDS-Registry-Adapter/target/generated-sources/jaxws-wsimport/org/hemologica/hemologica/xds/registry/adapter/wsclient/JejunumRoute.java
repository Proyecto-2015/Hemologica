
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para JejunumRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="JejunumRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GJT"/>
 *     &lt;enumeration value="JJTINSTL"/>
 *     &lt;enumeration value="OJJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JejunumRoute")
@XmlEnum
public enum JejunumRoute {

    GJT,
    JJTINSTL,
    OJJ;

    public String value() {
        return name();
    }

    public static JejunumRoute fromValue(String v) {
        return valueOf(v);
    }

}
