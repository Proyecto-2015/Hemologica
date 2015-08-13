
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataTypeAnnotatedPhysicalQuantity.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeAnnotatedPhysicalQuantity">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ANT&lt;PQ>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeAnnotatedPhysicalQuantity")
@XmlEnum
public enum DataTypeAnnotatedPhysicalQuantity {

    @XmlEnumValue("ANT<PQ>")
    ANT_PQ("ANT<PQ>");
    private final String value;

    DataTypeAnnotatedPhysicalQuantity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeAnnotatedPhysicalQuantity fromValue(String v) {
        for (DataTypeAnnotatedPhysicalQuantity c: DataTypeAnnotatedPhysicalQuantity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}