
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IntegrityCheckAlgorithm.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="IntegrityCheckAlgorithm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SHA-1"/>
 *     &lt;enumeration value="SHA-256"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntegrityCheckAlgorithm")
@XmlEnum
public enum IntegrityCheckAlgorithm {

    @XmlEnumValue("SHA-1")
    SHA_1("SHA-1"),
    @XmlEnumValue("SHA-256")
    SHA_256("SHA-256");
    private final String value;

    IntegrityCheckAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntegrityCheckAlgorithm fromValue(String v) {
        for (IntegrityCheckAlgorithm c: IntegrityCheckAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
