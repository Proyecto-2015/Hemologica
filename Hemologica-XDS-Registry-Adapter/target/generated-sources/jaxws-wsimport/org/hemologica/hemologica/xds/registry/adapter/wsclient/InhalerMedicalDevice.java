
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InhalerMedicalDevice.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="InhalerMedicalDevice">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="INH"/>
 *     &lt;enumeration value="DSKUNH"/>
 *     &lt;enumeration value="DSKS"/>
 *     &lt;enumeration value="TRBINH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InhalerMedicalDevice")
@XmlEnum
public enum InhalerMedicalDevice {

    INH,
    DSKUNH,
    DSKS,
    TRBINH;

    public String value() {
        return name();
    }

    public static InhalerMedicalDevice fromValue(String v) {
        return valueOf(v);
    }

}
