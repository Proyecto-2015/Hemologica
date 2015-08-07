
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LiquidCleanser.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="LiquidCleanser">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LIQCLN"/>
 *     &lt;enumeration value="LIQSOAP"/>
 *     &lt;enumeration value="SHMP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LiquidCleanser")
@XmlEnum
public enum LiquidCleanser {

    LIQCLN,
    LIQSOAP,
    SHMP;

    public String value() {
        return name();
    }

    public static LiquidCleanser fromValue(String v) {
        return valueOf(v);
    }

}
