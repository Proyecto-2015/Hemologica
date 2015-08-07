
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PulmonaryRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PulmonaryRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IPPB"/>
 *     &lt;enumeration value="VENT"/>
 *     &lt;enumeration value="VENTMASK"/>
 *     &lt;enumeration value="ETINSTL"/>
 *     &lt;enumeration value="NTT"/>
 *     &lt;enumeration value="ETNEB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PulmonaryRoute")
@XmlEnum
public enum PulmonaryRoute {

    IPPB,
    VENT,
    VENTMASK,
    ETINSTL,
    NTT,
    ETNEB;

    public String value() {
        return name();
    }

    public static PulmonaryRoute fromValue(String v) {
        return valueOf(v);
    }

}
