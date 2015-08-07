
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IntravenousInjection.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="IntravenousInjection">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IVINJ"/>
 *     &lt;enumeration value="IVINJBOL"/>
 *     &lt;enumeration value="IVPUSH"/>
 *     &lt;enumeration value="IVRPUSH"/>
 *     &lt;enumeration value="IVSPUSH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntravenousInjection")
@XmlEnum
public enum IntravenousInjection {

    IVINJ,
    IVINJBOL,
    IVPUSH,
    IVRPUSH,
    IVSPUSH;

    public String value() {
        return name();
    }

    public static IntravenousInjection fromValue(String v) {
        return valueOf(v);
    }

}
