
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActTaskClinicalNoteEntryCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActTaskClinicalNoteEntryCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CLINNOTEE"/>
 *     &lt;enumeration value="DIAGLISTE"/>
 *     &lt;enumeration value="DISCHSUME"/>
 *     &lt;enumeration value="PATREPE"/>
 *     &lt;enumeration value="PROBLISTE"/>
 *     &lt;enumeration value="RADREPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActTaskClinicalNoteEntryCode")
@XmlEnum
public enum ActTaskClinicalNoteEntryCode {

    CLINNOTEE,
    DIAGLISTE,
    DISCHSUME,
    PATREPE,
    PROBLISTE,
    RADREPE;

    public String value() {
        return name();
    }

    public static ActTaskClinicalNoteEntryCode fromValue(String v) {
        return valueOf(v);
    }

}
