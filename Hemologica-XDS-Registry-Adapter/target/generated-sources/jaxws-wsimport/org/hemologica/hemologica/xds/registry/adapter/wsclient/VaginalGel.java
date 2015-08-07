
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VaginalGel.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="VaginalGel">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="VAGGEL"/>
 *     &lt;enumeration value="VGELAPL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VaginalGel")
@XmlEnum
public enum VaginalGel {

    VAGGEL,
    VGELAPL;

    public String value() {
        return name();
    }

    public static VaginalGel fromValue(String v) {
        return valueOf(v);
    }

}
