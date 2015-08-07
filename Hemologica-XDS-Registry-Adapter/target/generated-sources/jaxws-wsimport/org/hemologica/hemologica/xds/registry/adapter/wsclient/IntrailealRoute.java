
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IntrailealRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="IntrailealRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IILEALINJ"/>
 *     &lt;enumeration value="IILEALTA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntrailealRoute")
@XmlEnum
public enum IntrailealRoute {

    IILEALINJ,
    IILEALTA;

    public String value() {
        return name();
    }

    public static IntrailealRoute fromValue(String v) {
        return valueOf(v);
    }

}
