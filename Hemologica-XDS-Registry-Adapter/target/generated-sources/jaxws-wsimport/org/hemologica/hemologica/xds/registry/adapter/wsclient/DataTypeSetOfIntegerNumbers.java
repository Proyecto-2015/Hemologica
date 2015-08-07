
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataTypeSetOfIntegerNumbers.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeSetOfIntegerNumbers">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SET&lt;INT>"/>
 *     &lt;enumeration value="IVL&lt;INT>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeSetOfIntegerNumbers")
@XmlEnum
public enum DataTypeSetOfIntegerNumbers {

    @XmlEnumValue("SET<INT>")
    SET_INT("SET<INT>"),
    @XmlEnumValue("IVL<INT>")
    IVL_INT("IVL<INT>");
    private final String value;

    DataTypeSetOfIntegerNumbers(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeSetOfIntegerNumbers fromValue(String v) {
        for (DataTypeSetOfIntegerNumbers c: DataTypeSetOfIntegerNumbers.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
