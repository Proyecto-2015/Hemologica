
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MessageWaitingPriority.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageWaitingPriority">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="M"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageWaitingPriority")
@XmlEnum
public enum MessageWaitingPriority {

    H,
    L,
    M;

    public String value() {
        return name();
    }

    public static MessageWaitingPriority fromValue(String v) {
        return valueOf(v);
    }

}
