
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IntracardiacInjection.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="IntracardiacInjection">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ICARDINJ"/>
 *     &lt;enumeration value="ICARINJP"/>
 *     &lt;enumeration value="ICARDINJRP"/>
 *     &lt;enumeration value="ICARDINJSP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntracardiacInjection")
@XmlEnum
public enum IntracardiacInjection {

    ICARDINJ,
    ICARINJP,
    ICARDINJRP,
    ICARDINJSP;

    public String value() {
        return name();
    }

    public static IntracardiacInjection fromValue(String v) {
        return valueOf(v);
    }

}
