
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GIClinicPracticeSetting.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="GIClinicPracticeSetting">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GI"/>
 *     &lt;enumeration value="PEDGI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GIClinicPracticeSetting")
@XmlEnum
public enum GIClinicPracticeSetting {

    GI,
    PEDGI;

    public String value() {
        return name();
    }

    public static GIClinicPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
