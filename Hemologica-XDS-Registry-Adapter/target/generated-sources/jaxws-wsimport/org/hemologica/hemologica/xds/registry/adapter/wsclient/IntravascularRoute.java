
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IntravascularRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="IntravascularRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="HEMODIFF"/>
 *     &lt;enumeration value="IVASCINFUS"/>
 *     &lt;enumeration value="HEMOPORT"/>
 *     &lt;enumeration value="IVASCINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntravascularRoute")
@XmlEnum
public enum IntravascularRoute {

    HEMODIFF,
    IVASCINFUS,
    HEMOPORT,
    IVASCINJ;

    public String value() {
        return name();
    }

    public static IntravascularRoute fromValue(String v) {
        return valueOf(v);
    }

}
