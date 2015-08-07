
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IntrauterineRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="IntrauterineRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IURETINJ"/>
 *     &lt;enumeration value="IUINJ"/>
 *     &lt;enumeration value="IU"/>
 *     &lt;enumeration value="IUINSTL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntrauterineRoute")
@XmlEnum
public enum IntrauterineRoute {

    IURETINJ,
    IUINJ,
    IU,
    IUINSTL;

    public String value() {
        return name();
    }

    public static IntrauterineRoute fromValue(String v) {
        return valueOf(v);
    }

}
