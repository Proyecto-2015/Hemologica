
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataTypeUncertainProbabilisticConceptDescriptor.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeUncertainProbabilisticConceptDescriptor">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="UVP&lt;CD>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeUncertainProbabilisticConceptDescriptor")
@XmlEnum
public enum DataTypeUncertainProbabilisticConceptDescriptor {

    @XmlEnumValue("UVP<CD>")
    UVP_CD("UVP<CD>");
    private final String value;

    DataTypeUncertainProbabilisticConceptDescriptor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeUncertainProbabilisticConceptDescriptor fromValue(String v) {
        for (DataTypeUncertainProbabilisticConceptDescriptor c: DataTypeUncertainProbabilisticConceptDescriptor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
