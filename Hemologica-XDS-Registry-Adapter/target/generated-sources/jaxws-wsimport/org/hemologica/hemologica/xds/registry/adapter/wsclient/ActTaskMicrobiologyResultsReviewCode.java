
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActTaskMicrobiologyResultsReviewCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActTaskMicrobiologyResultsReviewCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MICRORREV"/>
 *     &lt;enumeration value="MICROORGRREV"/>
 *     &lt;enumeration value="MICROSENSRREV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActTaskMicrobiologyResultsReviewCode")
@XmlEnum
public enum ActTaskMicrobiologyResultsReviewCode {

    MICRORREV,
    MICROORGRREV,
    MICROSENSRREV;

    public String value() {
        return name();
    }

    public static ActTaskMicrobiologyResultsReviewCode fromValue(String v) {
        return valueOf(v);
    }

}
