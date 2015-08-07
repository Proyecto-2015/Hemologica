
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IntratrachealRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="IntratrachealRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ITRACHINSTIL"/>
 *     &lt;enumeration value="ITRACHMAB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntratrachealRoute")
@XmlEnum
public enum IntratrachealRoute {

    ITRACHINSTIL,
    ITRACHMAB;

    public String value() {
        return name();
    }

    public static IntratrachealRoute fromValue(String v) {
        return valueOf(v);
    }

}
