
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RoleClassPartitivePartByBOT.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassPartitivePartByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PART"/>
 *     &lt;enumeration value="ACTM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassPartitivePartByBOT")
@XmlEnum
public enum RoleClassPartitivePartByBOT {

    PART,
    ACTM;

    public String value() {
        return name();
    }

    public static RoleClassPartitivePartByBOT fromValue(String v) {
        return valueOf(v);
    }

}
