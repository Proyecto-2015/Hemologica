
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IntraosseousRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="IntraosseousRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IOSSC"/>
 *     &lt;enumeration value="IOSSINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntraosseousRoute")
@XmlEnum
public enum IntraosseousRoute {

    IOSSC,
    IOSSINJ;

    public String value() {
        return name();
    }

    public static IntraosseousRoute fromValue(String v) {
        return valueOf(v);
    }

}
