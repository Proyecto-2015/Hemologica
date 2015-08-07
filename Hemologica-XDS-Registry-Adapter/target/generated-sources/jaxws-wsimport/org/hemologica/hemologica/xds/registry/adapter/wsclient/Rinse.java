
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Rinse.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Rinse">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DENRINSE"/>
 *     &lt;enumeration value="ORRINSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Rinse")
@XmlEnum
public enum Rinse {

    DENRINSE,
    ORRINSE;

    public String value() {
        return name();
    }

    public static Rinse fromValue(String v) {
        return valueOf(v);
    }

}
