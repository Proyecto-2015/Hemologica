
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataTypeNonParametricProbabilityDistributionOfIntervalOfPhysicalQuantities.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeNonParametricProbabilityDistributionOfIntervalOfPhysicalQuantities">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NPPD&lt;IVL&lt;PQ>>"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeNonParametricProbabilityDistributionOfIntervalOfPhysicalQuantities")
@XmlEnum
public enum DataTypeNonParametricProbabilityDistributionOfIntervalOfPhysicalQuantities {

    @XmlEnumValue("NPPD<IVL<PQ>>")
    NPPD_IVL_PQ("NPPD<IVL<PQ>>");
    private final String value;

    DataTypeNonParametricProbabilityDistributionOfIntervalOfPhysicalQuantities(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeNonParametricProbabilityDistributionOfIntervalOfPhysicalQuantities fromValue(String v) {
        for (DataTypeNonParametricProbabilityDistributionOfIntervalOfPhysicalQuantities c: DataTypeNonParametricProbabilityDistributionOfIntervalOfPhysicalQuantities.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
