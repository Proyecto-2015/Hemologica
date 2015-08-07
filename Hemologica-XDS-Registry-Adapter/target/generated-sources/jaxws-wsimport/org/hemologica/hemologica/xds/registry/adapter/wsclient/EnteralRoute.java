
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnteralRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="EnteralRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ENTINSTL"/>
 *     &lt;enumeration value="EFT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnteralRoute")
@XmlEnum
public enum EnteralRoute {

    ENTINSTL,
    EFT;

    public String value() {
        return name();
    }

    public static EnteralRoute fromValue(String v) {
        return valueOf(v);
    }

}
