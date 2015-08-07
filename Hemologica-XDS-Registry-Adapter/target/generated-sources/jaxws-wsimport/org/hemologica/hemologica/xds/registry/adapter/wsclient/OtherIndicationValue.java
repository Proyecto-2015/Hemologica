
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OtherIndicationValue.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OtherIndicationValue">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="_DiagnosisValue"/>
 *     &lt;enumeration value="_IndicationValue"/>
 *     &lt;enumeration value="_SymptomValue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OtherIndicationValue")
@XmlEnum
public enum OtherIndicationValue {

    @XmlEnumValue("_DiagnosisValue")
    DIAGNOSIS_VALUE("_DiagnosisValue"),
    @XmlEnumValue("_IndicationValue")
    INDICATION_VALUE("_IndicationValue"),
    @XmlEnumValue("_SymptomValue")
    SYMPTOM_VALUE("_SymptomValue");
    private final String value;

    OtherIndicationValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OtherIndicationValue fromValue(String v) {
        for (OtherIndicationValue c: OtherIndicationValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
