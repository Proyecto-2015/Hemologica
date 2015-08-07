
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObservationNonAllergyIntoleranceType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationNonAllergyIntoleranceType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NAINT"/>
 *     &lt;enumeration value="DNAINT"/>
 *     &lt;enumeration value="ENAINT"/>
 *     &lt;enumeration value="FNAINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationNonAllergyIntoleranceType")
@XmlEnum
public enum ObservationNonAllergyIntoleranceType {

    NAINT,
    DNAINT,
    ENAINT,
    FNAINT;

    public String value() {
        return name();
    }

    public static ObservationNonAllergyIntoleranceType fromValue(String v) {
        return valueOf(v);
    }

}
