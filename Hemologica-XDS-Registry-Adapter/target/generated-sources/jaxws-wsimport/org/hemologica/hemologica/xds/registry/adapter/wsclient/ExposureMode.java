
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExposureMode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ExposureMode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AIRBORNE"/>
 *     &lt;enumeration value="CONTACT"/>
 *     &lt;enumeration value="FOODBORNE"/>
 *     &lt;enumeration value="WATERBORNE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExposureMode")
@XmlEnum
public enum ExposureMode {

    AIRBORNE,
    CONTACT,
    FOODBORNE,
    WATERBORNE;

    public String value() {
        return name();
    }

    public static ExposureMode fromValue(String v) {
        return valueOf(v);
    }

}
