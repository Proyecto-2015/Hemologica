
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para River.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="River">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-MRC"/>
 *     &lt;enumeration value="x-MOV"/>
 *     &lt;enumeration value="x-YUM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "River")
@XmlEnum
public enum River {

    @XmlEnumValue("x-MRC")
    X_MRC("x-MRC"),
    @XmlEnumValue("x-MOV")
    X_MOV("x-MOV"),
    @XmlEnumValue("x-YUM")
    X_YUM("x-YUM");
    private final String value;

    River(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static River fromValue(String v) {
        for (River c: River.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}