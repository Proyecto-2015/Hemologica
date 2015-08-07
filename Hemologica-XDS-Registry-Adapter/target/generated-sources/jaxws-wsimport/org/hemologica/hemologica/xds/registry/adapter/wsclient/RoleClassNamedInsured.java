
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RoleClassNamedInsured.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassNamedInsured">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NAMED"/>
 *     &lt;enumeration value="DEPEN"/>
 *     &lt;enumeration value="INDIV"/>
 *     &lt;enumeration value="SUBSCR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassNamedInsured")
@XmlEnum
public enum RoleClassNamedInsured {

    NAMED,
    DEPEN,
    INDIV,
    SUBSCR;

    public String value() {
        return name();
    }

    public static RoleClassNamedInsured fromValue(String v) {
        return valueOf(v);
    }

}
