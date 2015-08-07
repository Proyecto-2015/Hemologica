
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Spouse.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Spouse">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SPS"/>
 *     &lt;enumeration value="HUSB"/>
 *     &lt;enumeration value="WIFE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Spouse")
@XmlEnum
public enum Spouse {

    SPS,
    HUSB,
    WIFE;

    public String value() {
        return name();
    }

    public static Spouse fromValue(String v) {
        return valueOf(v);
    }

}
