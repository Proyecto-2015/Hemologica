
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BuccalTablet.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="BuccalTablet">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BUCTAB"/>
 *     &lt;enumeration value="SRBUCTAB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuccalTablet")
@XmlEnum
public enum BuccalTablet {

    BUCTAB,
    SRBUCTAB;

    public String value() {
        return name();
    }

    public static BuccalTablet fromValue(String v) {
        return valueOf(v);
    }

}
