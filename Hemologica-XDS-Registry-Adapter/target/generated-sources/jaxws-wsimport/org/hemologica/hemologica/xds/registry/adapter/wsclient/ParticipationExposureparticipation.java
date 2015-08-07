
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParticipationExposureparticipation.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationExposureparticipation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EXPART"/>
 *     &lt;enumeration value="EXSRC"/>
 *     &lt;enumeration value="EXPTRGT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationExposureparticipation")
@XmlEnum
public enum ParticipationExposureparticipation {

    EXPART,
    EXSRC,
    EXPTRGT;

    public String value() {
        return name();
    }

    public static ParticipationExposureparticipation fromValue(String v) {
        return valueOf(v);
    }

}
