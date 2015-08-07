
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_RoleClassCoverage.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_RoleClassCoverage">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SPNSR"/>
 *     &lt;enumeration value="COVPTY"/>
 *     &lt;enumeration value="POLHOLD"/>
 *     &lt;enumeration value="UNDWRT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_RoleClassCoverage")
@XmlEnum
public enum XRoleClassCoverage {

    SPNSR,
    COVPTY,
    POLHOLD,
    UNDWRT;

    public String value() {
        return name();
    }

    public static XRoleClassCoverage fromValue(String v) {
        return valueOf(v);
    }

}
