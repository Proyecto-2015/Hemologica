
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AmnioticFluidSacRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="AmnioticFluidSacRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AMNINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmnioticFluidSacRoute")
@XmlEnum
public enum AmnioticFluidSacRoute {

    AMNINJ;

    public String value() {
        return name();
    }

    public static AmnioticFluidSacRoute fromValue(String v) {
        return valueOf(v);
    }

}
