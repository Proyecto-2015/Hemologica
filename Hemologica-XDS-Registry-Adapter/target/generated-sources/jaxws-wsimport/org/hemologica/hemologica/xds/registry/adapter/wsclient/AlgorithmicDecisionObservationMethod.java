
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AlgorithmicDecisionObservationMethod.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="AlgorithmicDecisionObservationMethod">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ALGM"/>
 *     &lt;enumeration value="BYCL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlgorithmicDecisionObservationMethod")
@XmlEnum
public enum AlgorithmicDecisionObservationMethod {

    ALGM,
    BYCL;

    public String value() {
        return name();
    }

    public static AlgorithmicDecisionObservationMethod fromValue(String v) {
        return valueOf(v);
    }

}
