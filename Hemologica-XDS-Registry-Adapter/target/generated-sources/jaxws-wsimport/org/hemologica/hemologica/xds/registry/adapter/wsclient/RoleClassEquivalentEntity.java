
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RoleClassEquivalentEntity.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassEquivalentEntity">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SAME"/>
 *     &lt;enumeration value="SUBY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassEquivalentEntity")
@XmlEnum
public enum RoleClassEquivalentEntity {

    SAME,
    SUBY;

    public String value() {
        return name();
    }

    public static RoleClassEquivalentEntity fromValue(String v) {
        return valueOf(v);
    }

}
