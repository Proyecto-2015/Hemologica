
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Institution.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Institution">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="CS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Institution")
@XmlEnum
public enum Institution {

    I,
    X,
    G,
    N,
    CS;

    public String value() {
        return name();
    }

    public static Institution fromValue(String v) {
        return valueOf(v);
    }

}
