
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SaukFoxKickapoo.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SaukFoxKickapoo">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-KIC"/>
 *     &lt;enumeration value="x-SAC"/>
 *     &lt;enumeration value="x-SJW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SaukFoxKickapoo")
@XmlEnum
public enum SaukFoxKickapoo {

    @XmlEnumValue("x-KIC")
    X_KIC("x-KIC"),
    @XmlEnumValue("x-SAC")
    X_SAC("x-SAC"),
    @XmlEnumValue("x-SJW")
    X_SJW("x-SJW");
    private final String value;

    SaukFoxKickapoo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SaukFoxKickapoo fromValue(String v) {
        for (SaukFoxKickapoo c: SaukFoxKickapoo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
