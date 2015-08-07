
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParameterizedDataTypePeriodicInterval.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterizedDataTypePeriodicInterval">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PIVL&lt;T>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParameterizedDataTypePeriodicInterval")
@XmlEnum
public enum ParameterizedDataTypePeriodicInterval {

    @XmlEnumValue("PIVL<T>")
    PIVL_T("PIVL<T>");
    private final String value;

    ParameterizedDataTypePeriodicInterval(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterizedDataTypePeriodicInterval fromValue(String v) {
        for (ParameterizedDataTypePeriodicInterval c: ParameterizedDataTypePeriodicInterval.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
