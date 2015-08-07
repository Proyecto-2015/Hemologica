
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_RoleClassCredentialedEntity.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_RoleClassCredentialedEntity">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ASSIGNED"/>
 *     &lt;enumeration value="QUAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_RoleClassCredentialedEntity")
@XmlEnum
public enum XRoleClassCredentialedEntity {

    ASSIGNED,
    QUAL;

    public String value() {
        return name();
    }

    public static XRoleClassCredentialedEntity fromValue(String v) {
        return valueOf(v);
    }

}
