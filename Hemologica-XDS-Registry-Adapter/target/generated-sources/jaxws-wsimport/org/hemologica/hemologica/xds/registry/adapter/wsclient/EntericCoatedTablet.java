
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EntericCoatedTablet.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="EntericCoatedTablet">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ECTAB"/>
 *     &lt;enumeration value="ERECTAB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntericCoatedTablet")
@XmlEnum
public enum EntericCoatedTablet {

    ECTAB,
    ERECTAB;

    public String value() {
        return name();
    }

    public static EntericCoatedTablet fromValue(String v) {
        return valueOf(v);
    }

}
