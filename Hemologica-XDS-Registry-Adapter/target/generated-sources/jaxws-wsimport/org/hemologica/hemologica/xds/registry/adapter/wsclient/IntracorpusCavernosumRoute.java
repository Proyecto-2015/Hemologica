
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IntracorpusCavernosumRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="IntracorpusCavernosumRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ICORPCAVINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntracorpusCavernosumRoute")
@XmlEnum
public enum IntracorpusCavernosumRoute {

    ICORPCAVINJ;

    public String value() {
        return name();
    }

    public static IntracorpusCavernosumRoute fromValue(String v) {
        return valueOf(v);
    }

}
