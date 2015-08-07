
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObservationInterpretationNormalityAlert.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationInterpretationNormalityAlert">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="HH"/>
 *     &lt;enumeration value="LL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationInterpretationNormalityAlert")
@XmlEnum
public enum ObservationInterpretationNormalityAlert {

    AA,
    HH,
    LL;

    public String value() {
        return name();
    }

    public static ObservationInterpretationNormalityAlert fromValue(String v) {
        return valueOf(v);
    }

}
