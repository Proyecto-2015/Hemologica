
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SetUpdateMode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SetUpdateMode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ESA"/>
 *     &lt;enumeration value="ESAC"/>
 *     &lt;enumeration value="ESC"/>
 *     &lt;enumeration value="ESD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SetUpdateMode")
@XmlEnum
public enum SetUpdateMode {

    ESA,
    ESAC,
    ESC,
    ESD;

    public String value() {
        return name();
    }

    public static SetUpdateMode fromValue(String v) {
        return valueOf(v);
    }

}
