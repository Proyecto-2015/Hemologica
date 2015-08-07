
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IntradermalRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="IntradermalRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IDIMPLNT"/>
 *     &lt;enumeration value="IDINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntradermalRoute")
@XmlEnum
public enum IntradermalRoute {

    IDIMPLNT,
    IDINJ;

    public String value() {
        return name();
    }

    public static IntradermalRoute fromValue(String v) {
        return valueOf(v);
    }

}
