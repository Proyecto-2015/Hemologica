
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InjectionMedicalDevice.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="InjectionMedicalDevice">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AINJ"/>
 *     &lt;enumeration value="PEN"/>
 *     &lt;enumeration value="SYR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InjectionMedicalDevice")
@XmlEnum
public enum InjectionMedicalDevice {

    AINJ,
    PEN,
    SYR;

    public String value() {
        return name();
    }

    public static InjectionMedicalDevice fromValue(String v) {
        return valueOf(v);
    }

}
