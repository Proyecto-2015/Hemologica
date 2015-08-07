
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParticipationTargetSubject.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationTargetSubject">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SBJ"/>
 *     &lt;enumeration value="SPC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationTargetSubject")
@XmlEnum
public enum ParticipationTargetSubject {

    SBJ,
    SPC;

    public String value() {
        return name();
    }

    public static ParticipationTargetSubject fromValue(String v) {
        return valueOf(v);
    }

}
