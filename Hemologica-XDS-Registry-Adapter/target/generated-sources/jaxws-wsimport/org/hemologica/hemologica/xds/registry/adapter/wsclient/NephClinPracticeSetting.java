
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NephClinPracticeSetting.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="NephClinPracticeSetting">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NEPH"/>
 *     &lt;enumeration value="PEDNEPH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NephClinPracticeSetting")
@XmlEnum
public enum NephClinPracticeSetting {

    NEPH,
    PEDNEPH;

    public String value() {
        return name();
    }

    public static NephClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
