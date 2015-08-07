
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MedOncClinPracticeSetting.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MedOncClinPracticeSetting">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ONCL"/>
 *     &lt;enumeration value="PEDHO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedOncClinPracticeSetting")
@XmlEnum
public enum MedOncClinPracticeSetting {

    ONCL,
    PEDHO;

    public String value() {
        return name();
    }

    public static MedOncClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
