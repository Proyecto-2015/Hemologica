
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncounterAdmissionSource.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="EncounterAdmissionSource">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="LD"/>
 *     &lt;enumeration value="NB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EncounterAdmissionSource")
@XmlEnum
public enum EncounterAdmissionSource {

    E,
    LD,
    NB;

    public String value() {
        return name();
    }

    public static EncounterAdmissionSource fromValue(String v) {
        return valueOf(v);
    }

}
