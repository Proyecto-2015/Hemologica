
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Swish.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Swish">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SWISHSPIT"/>
 *     &lt;enumeration value="SWISHSWAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Swish")
@XmlEnum
public enum Swish {

    SWISHSPIT,
    SWISHSWAL;

    public String value() {
        return name();
    }

    public static Swish fromValue(String v) {
        return valueOf(v);
    }

}
