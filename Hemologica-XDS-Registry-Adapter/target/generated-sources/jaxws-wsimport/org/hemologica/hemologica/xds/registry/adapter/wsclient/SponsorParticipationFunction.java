
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SponsorParticipationFunction.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SponsorParticipationFunction">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="FULINRD"/>
 *     &lt;enumeration value="SELFINRD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SponsorParticipationFunction")
@XmlEnum
public enum SponsorParticipationFunction {

    FULINRD,
    SELFINRD;

    public String value() {
        return name();
    }

    public static SponsorParticipationFunction fromValue(String v) {
        return valueOf(v);
    }

}
