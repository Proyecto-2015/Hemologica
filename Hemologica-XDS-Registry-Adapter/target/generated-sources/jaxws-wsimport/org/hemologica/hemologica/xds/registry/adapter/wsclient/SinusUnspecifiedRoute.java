
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SinusUnspecifiedRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SinusUnspecifiedRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ENDOSININJ"/>
 *     &lt;enumeration value="SININSTIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SinusUnspecifiedRoute")
@XmlEnum
public enum SinusUnspecifiedRoute {

    ENDOSININJ,
    SININSTIL;

    public String value() {
        return name();
    }

    public static SinusUnspecifiedRoute fromValue(String v) {
        return valueOf(v);
    }

}
