
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_ActRelationshipPertinentInfo.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActRelationshipPertinentInfo">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SUBJ"/>
 *     &lt;enumeration value="SPRT"/>
 *     &lt;enumeration value="CAUS"/>
 *     &lt;enumeration value="MFST"/>
 *     &lt;enumeration value="REFR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActRelationshipPertinentInfo")
@XmlEnum
public enum XActRelationshipPertinentInfo {

    SUBJ,
    SPRT,
    CAUS,
    MFST,
    REFR;

    public String value() {
        return name();
    }

    public static XActRelationshipPertinentInfo fromValue(String v) {
        return valueOf(v);
    }

}