
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActTaskMedicationListReviewCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActTaskMedicationListReviewCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MLREV"/>
 *     &lt;enumeration value="MARWLREV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActTaskMedicationListReviewCode")
@XmlEnum
public enum ActTaskMedicationListReviewCode {

    MLREV,
    MARWLREV;

    public String value() {
        return name();
    }

    public static ActTaskMedicationListReviewCode fromValue(String v) {
        return valueOf(v);
    }

}
