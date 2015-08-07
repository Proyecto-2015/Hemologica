
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SoftTissueRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SoftTissueRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SOFTISINJ"/>
 *     &lt;enumeration value="SOFTISINSTIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SoftTissueRoute")
@XmlEnum
public enum SoftTissueRoute {

    SOFTISINJ,
    SOFTISINSTIL;

    public String value() {
        return name();
    }

    public static SoftTissueRoute fromValue(String v) {
        return valueOf(v);
    }

}
