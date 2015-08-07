
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RheumClinPracticeSetting.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RheumClinPracticeSetting">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RHEUM"/>
 *     &lt;enumeration value="PEDRHEUM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RheumClinPracticeSetting")
@XmlEnum
public enum RheumClinPracticeSetting {

    RHEUM,
    PEDRHEUM;

    public String value() {
        return name();
    }

    public static RheumClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
