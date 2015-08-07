
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FamilyMemberCousin.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyMemberCousin">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="COUSN"/>
 *     &lt;enumeration value="MCOUSN"/>
 *     &lt;enumeration value="PCOUSN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FamilyMemberCousin")
@XmlEnum
public enum FamilyMemberCousin {

    COUSN,
    MCOUSN,
    PCOUSN;

    public String value() {
        return name();
    }

    public static FamilyMemberCousin fromValue(String v) {
        return valueOf(v);
    }

}
