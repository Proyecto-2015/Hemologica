
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TopicalAbsorptionRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TopicalAbsorptionRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="TTYMPTABSORP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TopicalAbsorptionRoute")
@XmlEnum
public enum TopicalAbsorptionRoute {

    TTYMPTABSORP;

    public String value() {
        return name();
    }

    public static TopicalAbsorptionRoute fromValue(String v) {
        return valueOf(v);
    }

}
