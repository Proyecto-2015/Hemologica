
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SupplyOrderAbortReasonCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplyOrderAbortReasonCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IMPROV"/>
 *     &lt;enumeration value="INTOL"/>
 *     &lt;enumeration value="NEWSTR"/>
 *     &lt;enumeration value="NEWTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupplyOrderAbortReasonCode")
@XmlEnum
public enum SupplyOrderAbortReasonCode {

    IMPROV,
    INTOL,
    NEWSTR,
    NEWTHER;

    public String value() {
        return name();
    }

    public static SupplyOrderAbortReasonCode fromValue(String v) {
        return valueOf(v);
    }

}
