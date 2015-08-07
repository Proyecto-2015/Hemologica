
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParanasalSinusesRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ParanasalSinusesRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PNSINJ"/>
 *     &lt;enumeration value="PNSINSTL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParanasalSinusesRoute")
@XmlEnum
public enum ParanasalSinusesRoute {

    PNSINJ,
    PNSINSTL;

    public String value() {
        return name();
    }

    public static ParanasalSinusesRoute fromValue(String v) {
        return valueOf(v);
    }

}
