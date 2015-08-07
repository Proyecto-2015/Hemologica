
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActPriorityCallback.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActPriorityCallback">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CSP"/>
 *     &lt;enumeration value="CSR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActPriorityCallback")
@XmlEnum
public enum ActPriorityCallback {

    CS,
    CSP,
    CSR;

    public String value() {
        return name();
    }

    public static ActPriorityCallback fromValue(String v) {
        return valueOf(v);
    }

}
