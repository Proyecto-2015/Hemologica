
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdministrativeGender.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="AdministrativeGender">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="UN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdministrativeGender")
@XmlEnum
public enum AdministrativeGender {

    F,
    M,
    UN;

    public String value() {
        return name();
    }

    public static AdministrativeGender fromValue(String v) {
        return valueOf(v);
    }

}
