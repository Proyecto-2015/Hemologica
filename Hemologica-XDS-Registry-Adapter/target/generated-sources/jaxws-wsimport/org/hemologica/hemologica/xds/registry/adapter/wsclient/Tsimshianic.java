
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Tsimshianic.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Tsimshianic">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="x-TSI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Tsimshianic")
@XmlEnum
public enum Tsimshianic {

    @XmlEnumValue("x-TSI")
    X_TSI("x-TSI");
    private final String value;

    Tsimshianic(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Tsimshianic fromValue(String v) {
        for (Tsimshianic c: Tsimshianic.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}