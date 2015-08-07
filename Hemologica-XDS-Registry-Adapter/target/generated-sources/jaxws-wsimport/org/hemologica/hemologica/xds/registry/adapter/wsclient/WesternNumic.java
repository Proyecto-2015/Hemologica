
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WesternNumic.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="WesternNumic">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-MON"/>
 *     &lt;enumeration value="x-PAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WesternNumic")
@XmlEnum
public enum WesternNumic {

    @XmlEnumValue("x-MON")
    X_MON("x-MON"),
    @XmlEnumValue("x-PAO")
    X_PAO("x-PAO");
    private final String value;

    WesternNumic(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WesternNumic fromValue(String v) {
        for (WesternNumic c: WesternNumic.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
