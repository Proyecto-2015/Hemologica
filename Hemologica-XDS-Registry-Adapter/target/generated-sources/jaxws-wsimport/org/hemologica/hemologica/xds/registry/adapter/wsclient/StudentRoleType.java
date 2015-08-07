
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para StudentRoleType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="StudentRoleType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="STUD"/>
 *     &lt;enumeration value="FSTUD"/>
 *     &lt;enumeration value="PSTUD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StudentRoleType")
@XmlEnum
public enum StudentRoleType {

    STUD,
    FSTUD,
    PSTUD;

    public String value() {
        return name();
    }

    public static StudentRoleType fromValue(String v) {
        return valueOf(v);
    }

}
