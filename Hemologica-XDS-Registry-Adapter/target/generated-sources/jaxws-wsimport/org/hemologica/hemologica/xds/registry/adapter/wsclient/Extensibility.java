
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Extensibility.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Extensibility">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CNE"/>
 *     &lt;enumeration value="CWE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Extensibility")
@XmlEnum
public enum Extensibility {

    CNE,
    CWE;

    public String value() {
        return name();
    }

    public static Extensibility fromValue(String v) {
        return valueOf(v);
    }

}
