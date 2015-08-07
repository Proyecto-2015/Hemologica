
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FamilyMemberUncle.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyMemberUncle">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="UNCLE"/>
 *     &lt;enumeration value="MUNCLE"/>
 *     &lt;enumeration value="PUNCLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FamilyMemberUncle")
@XmlEnum
public enum FamilyMemberUncle {

    UNCLE,
    MUNCLE,
    PUNCLE;

    public String value() {
        return name();
    }

    public static FamilyMemberUncle fromValue(String v) {
        return valueOf(v);
    }

}
