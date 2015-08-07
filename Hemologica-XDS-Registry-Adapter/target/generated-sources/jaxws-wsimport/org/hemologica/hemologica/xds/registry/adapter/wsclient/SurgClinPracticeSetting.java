
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SurgClinPracticeSetting.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SurgClinPracticeSetting">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SU"/>
 *     &lt;enumeration value="PLS"/>
 *     &lt;enumeration value="URO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SurgClinPracticeSetting")
@XmlEnum
public enum SurgClinPracticeSetting {

    SU,
    PLS,
    URO;

    public String value() {
        return name();
    }

    public static SurgClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
