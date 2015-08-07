
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UrinaryBladderIrrigation.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="UrinaryBladderIrrigation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BLADIRR"/>
 *     &lt;enumeration value="BLADIRRC"/>
 *     &lt;enumeration value="BLADIRRT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UrinaryBladderIrrigation")
@XmlEnum
public enum UrinaryBladderIrrigation {

    BLADIRR,
    BLADIRRC,
    BLADIRRT;

    public String value() {
        return name();
    }

    public static UrinaryBladderIrrigation fromValue(String v) {
        return valueOf(v);
    }

}
