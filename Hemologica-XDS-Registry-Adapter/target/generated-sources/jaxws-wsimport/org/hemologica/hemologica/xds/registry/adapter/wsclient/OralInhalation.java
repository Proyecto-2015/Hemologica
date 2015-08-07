
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OralInhalation.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OralInhalation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ORINHL"/>
 *     &lt;enumeration value="ORIFINHL"/>
 *     &lt;enumeration value="REBREATH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OralInhalation")
@XmlEnum
public enum OralInhalation {

    ORINHL,
    ORIFINHL,
    REBREATH;

    public String value() {
        return name();
    }

    public static OralInhalation fromValue(String v) {
        return valueOf(v);
    }

}
