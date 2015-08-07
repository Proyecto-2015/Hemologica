
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdjudicatedWithAdjustments.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="AdjudicatedWithAdjustments">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="ANF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdjudicatedWithAdjustments")
@XmlEnum
public enum AdjudicatedWithAdjustments {

    AA,
    ANF;

    public String value() {
        return name();
    }

    public static AdjudicatedWithAdjustments fromValue(String v) {
        return valueOf(v);
    }

}
