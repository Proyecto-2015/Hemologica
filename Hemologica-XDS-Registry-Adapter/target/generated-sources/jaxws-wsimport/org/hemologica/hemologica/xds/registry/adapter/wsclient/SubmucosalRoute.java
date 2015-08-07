
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubmucosalRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SubmucosalRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SUBMUCINJ"/>
 *     &lt;enumeration value="SMUCMAB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubmucosalRoute")
@XmlEnum
public enum SubmucosalRoute {

    SUBMUCINJ,
    SMUCMAB;

    public String value() {
        return name();
    }

    public static SubmucosalRoute fromValue(String v) {
        return valueOf(v);
    }

}
