
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActMedicationTherapyDurationWorkingListCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMedicationTherapyDurationWorkingListCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PRN"/>
 *     &lt;enumeration value="CHRON"/>
 *     &lt;enumeration value="ONET"/>
 *     &lt;enumeration value="ACU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActMedicationTherapyDurationWorkingListCode")
@XmlEnum
public enum ActMedicationTherapyDurationWorkingListCode {

    PRN,
    CHRON,
    ONET,
    ACU;

    public String value() {
        return name();
    }

    public static ActMedicationTherapyDurationWorkingListCode fromValue(String v) {
        return valueOf(v);
    }

}
