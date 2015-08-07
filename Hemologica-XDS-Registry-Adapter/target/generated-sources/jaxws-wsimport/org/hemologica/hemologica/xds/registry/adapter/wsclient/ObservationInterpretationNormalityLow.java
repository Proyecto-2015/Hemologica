
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObservationInterpretationNormalityLow.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationInterpretationNormalityLow">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="LL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationInterpretationNormalityLow")
@XmlEnum
public enum ObservationInterpretationNormalityLow {

    L,
    LL;

    public String value() {
        return name();
    }

    public static ObservationInterpretationNormalityLow fromValue(String v) {
        return valueOf(v);
    }

}
