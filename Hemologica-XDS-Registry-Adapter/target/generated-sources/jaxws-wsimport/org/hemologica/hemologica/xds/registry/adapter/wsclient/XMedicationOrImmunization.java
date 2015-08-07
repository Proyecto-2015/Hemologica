
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_MedicationOrImmunization.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_MedicationOrImmunization">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DRUG"/>
 *     &lt;enumeration value="IMMUNIZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_MedicationOrImmunization")
@XmlEnum
public enum XMedicationOrImmunization {

    DRUG,
    IMMUNIZ;

    public String value() {
        return name();
    }

    public static XMedicationOrImmunization fromValue(String v) {
        return valueOf(v);
    }

}
