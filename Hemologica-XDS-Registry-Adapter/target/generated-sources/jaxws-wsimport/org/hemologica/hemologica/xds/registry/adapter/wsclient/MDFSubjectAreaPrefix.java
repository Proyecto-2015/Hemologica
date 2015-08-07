
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MDFSubjectAreaPrefix.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MDFSubjectAreaPrefix">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="COI"/>
 *     &lt;enumeration value="DIM"/>
 *     &lt;enumeration value="RIM"/>
 *     &lt;enumeration value="STW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MDFSubjectAreaPrefix")
@XmlEnum
public enum MDFSubjectAreaPrefix {

    COI,
    DIM,
    RIM,
    STW;

    public String value() {
        return name();
    }

    public static MDFSubjectAreaPrefix fromValue(String v) {
        return valueOf(v);
    }

}
