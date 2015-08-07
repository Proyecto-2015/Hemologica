
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Diffusion.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Diffusion">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EXTCORPDIF"/>
 *     &lt;enumeration value="HEMODIFF"/>
 *     &lt;enumeration value="TRNSDERMD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Diffusion")
@XmlEnum
public enum Diffusion {

    EXTCORPDIF,
    HEMODIFF,
    TRNSDERMD;

    public String value() {
        return name();
    }

    public static Diffusion fromValue(String v) {
        return valueOf(v);
    }

}
