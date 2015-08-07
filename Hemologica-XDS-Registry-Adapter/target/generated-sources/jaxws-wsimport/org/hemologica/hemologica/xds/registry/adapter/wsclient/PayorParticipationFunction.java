
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayorParticipationFunction.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PayorParticipationFunction">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CLMADJ"/>
 *     &lt;enumeration value="ENROLL"/>
 *     &lt;enumeration value="FFSMGT"/>
 *     &lt;enumeration value="MCMGT"/>
 *     &lt;enumeration value="PROVMGT"/>
 *     &lt;enumeration value="UMGT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PayorParticipationFunction")
@XmlEnum
public enum PayorParticipationFunction {

    CLMADJ,
    ENROLL,
    FFSMGT,
    MCMGT,
    PROVMGT,
    UMGT;

    public String value() {
        return name();
    }

    public static PayorParticipationFunction fromValue(String v) {
        return valueOf(v);
    }

}
