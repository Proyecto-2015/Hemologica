
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UrethralRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="UrethralRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="URETHINJ"/>
 *     &lt;enumeration value="URETHINS"/>
 *     &lt;enumeration value="URETHSUP"/>
 *     &lt;enumeration value="URETHINSTL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UrethralRoute")
@XmlEnum
public enum UrethralRoute {

    URETHINJ,
    URETHINS,
    URETHSUP,
    URETHINSTL;

    public String value() {
        return name();
    }

    public static UrethralRoute fromValue(String v) {
        return valueOf(v);
    }

}
