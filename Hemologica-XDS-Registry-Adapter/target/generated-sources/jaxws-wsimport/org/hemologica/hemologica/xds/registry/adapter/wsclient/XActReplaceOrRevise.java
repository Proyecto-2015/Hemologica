
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_ActReplaceOrRevise.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActReplaceOrRevise">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MOD"/>
 *     &lt;enumeration value="RPLC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActReplaceOrRevise")
@XmlEnum
public enum XActReplaceOrRevise {

    MOD,
    RPLC;

    public String value() {
        return name();
    }

    public static XActReplaceOrRevise fromValue(String v) {
        return valueOf(v);
    }

}
