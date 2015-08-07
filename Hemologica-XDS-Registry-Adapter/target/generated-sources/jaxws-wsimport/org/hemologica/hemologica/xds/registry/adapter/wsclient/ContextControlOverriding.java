
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ContextControlOverriding.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ContextControlOverriding">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ON"/>
 *     &lt;enumeration value="OP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContextControlOverriding")
@XmlEnum
public enum ContextControlOverriding {

    ON,
    OP;

    public String value() {
        return name();
    }

    public static ContextControlOverriding fromValue(String v) {
        return valueOf(v);
    }

}
