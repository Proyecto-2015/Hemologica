
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParameterizedDataTypeSequence.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterizedDataTypeSequence">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LIST&lt;T>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParameterizedDataTypeSequence")
@XmlEnum
public enum ParameterizedDataTypeSequence {

    @XmlEnumValue("LIST<T>")
    LIST_T("LIST<T>");
    private final String value;

    ParameterizedDataTypeSequence(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterizedDataTypeSequence fromValue(String v) {
        for (ParameterizedDataTypeSequence c: ParameterizedDataTypeSequence.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
