
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PeriodontalRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodontalRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PDONTINJ"/>
 *     &lt;enumeration value="PDONTTA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PeriodontalRoute")
@XmlEnum
public enum PeriodontalRoute {

    PDONTINJ,
    PDONTTA;

    public String value() {
        return name();
    }

    public static PeriodontalRoute fromValue(String v) {
        return valueOf(v);
    }

}
