
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PayorRoleType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PayorRoleType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ENROLBKR"/>
 *     &lt;enumeration value="TPA"/>
 *     &lt;enumeration value="UMO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PayorRoleType")
@XmlEnum
public enum PayorRoleType {

    ENROLBKR,
    TPA,
    UMO;

    public String value() {
        return name();
    }

    public static PayorRoleType fromValue(String v) {
        return valueOf(v);
    }

}
