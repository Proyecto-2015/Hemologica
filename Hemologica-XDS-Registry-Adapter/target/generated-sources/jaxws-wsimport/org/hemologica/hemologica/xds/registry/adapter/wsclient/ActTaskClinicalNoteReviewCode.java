
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActTaskClinicalNoteReviewCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActTaskClinicalNoteReviewCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CLINNOTEREV"/>
 *     &lt;enumeration value="DISCHSUMREV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActTaskClinicalNoteReviewCode")
@XmlEnum
public enum ActTaskClinicalNoteReviewCode {

    CLINNOTEREV,
    DISCHSUMREV;

    public String value() {
        return name();
    }

    public static ActTaskClinicalNoteReviewCode fromValue(String v) {
        return valueOf(v);
    }

}
