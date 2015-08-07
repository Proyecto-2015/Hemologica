
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_PhysicalVerbalParticipationMode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_PhysicalVerbalParticipationMode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PHYSICAL"/>
 *     &lt;enumeration value="VERBAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_PhysicalVerbalParticipationMode")
@XmlEnum
public enum XPhysicalVerbalParticipationMode {

    PHYSICAL,
    VERBAL;

    public String value() {
        return name();
    }

    public static XPhysicalVerbalParticipationMode fromValue(String v) {
        return valueOf(v);
    }

}
