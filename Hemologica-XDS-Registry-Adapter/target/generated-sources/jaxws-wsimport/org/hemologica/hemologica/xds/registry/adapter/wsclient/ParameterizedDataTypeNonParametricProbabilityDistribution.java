
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParameterizedDataTypeNonParametricProbabilityDistribution.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterizedDataTypeNonParametricProbabilityDistribution">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NPPD&lt;T>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParameterizedDataTypeNonParametricProbabilityDistribution")
@XmlEnum
public enum ParameterizedDataTypeNonParametricProbabilityDistribution {

    @XmlEnumValue("NPPD<T>")
    NPPD_T("NPPD<T>");
    private final String value;

    ParameterizedDataTypeNonParametricProbabilityDistribution(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterizedDataTypeNonParametricProbabilityDistribution fromValue(String v) {
        for (ParameterizedDataTypeNonParametricProbabilityDistribution c: ParameterizedDataTypeNonParametricProbabilityDistribution.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
