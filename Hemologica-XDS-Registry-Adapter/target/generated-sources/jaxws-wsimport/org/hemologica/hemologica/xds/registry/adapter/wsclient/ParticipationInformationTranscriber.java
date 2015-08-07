
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParticipationInformationTranscriber.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationInformationTranscriber">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="TRANS"/>
 *     &lt;enumeration value="ENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationInformationTranscriber")
@XmlEnum
public enum ParticipationInformationTranscriber {

    TRANS,
    ENT;

    public String value() {
        return name();
    }

    public static ParticipationInformationTranscriber fromValue(String v) {
        return valueOf(v);
    }

}
