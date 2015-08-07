
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GingivalRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="GingivalRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GINGINJ"/>
 *     &lt;enumeration value="GIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GingivalRoute")
@XmlEnum
public enum GingivalRoute {

    GINGINJ,
    GIN;

    public String value() {
        return name();
    }

    public static GingivalRoute fromValue(String v) {
        return valueOf(v);
    }

}
