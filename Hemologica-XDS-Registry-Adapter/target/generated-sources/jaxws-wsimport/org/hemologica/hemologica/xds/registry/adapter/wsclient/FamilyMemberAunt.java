
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FamilyMemberAunt.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyMemberAunt">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AUNT"/>
 *     &lt;enumeration value="MAUNT"/>
 *     &lt;enumeration value="PAUNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FamilyMemberAunt")
@XmlEnum
public enum FamilyMemberAunt {

    AUNT,
    MAUNT,
    PAUNT;

    public String value() {
        return name();
    }

    public static FamilyMemberAunt fromValue(String v) {
        return valueOf(v);
    }

}
