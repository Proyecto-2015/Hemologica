
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MobileUnit.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MobileUnit">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MOBL"/>
 *     &lt;enumeration value="AMB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobileUnit")
@XmlEnum
public enum MobileUnit {

    MOBL,
    AMB;

    public String value() {
        return name();
    }

    public static MobileUnit fromValue(String v) {
        return valueOf(v);
    }

}
