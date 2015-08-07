
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubsidizedHealthProgram.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SubsidizedHealthProgram">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SUBSIDIZ"/>
 *     &lt;enumeration value="SUBSIDMC"/>
 *     &lt;enumeration value="SUBSUPP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubsidizedHealthProgram")
@XmlEnum
public enum SubsidizedHealthProgram {

    SUBSIDIZ,
    SUBSIDMC,
    SUBSUPP;

    public String value() {
        return name();
    }

    public static SubsidizedHealthProgram fromValue(String v) {
        return valueOf(v);
    }

}
