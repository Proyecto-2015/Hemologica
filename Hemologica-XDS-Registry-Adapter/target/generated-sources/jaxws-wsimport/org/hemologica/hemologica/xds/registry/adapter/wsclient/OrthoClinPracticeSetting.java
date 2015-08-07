
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrthoClinPracticeSetting.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OrthoClinPracticeSetting">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ORTHO"/>
 *     &lt;enumeration value="HAND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrthoClinPracticeSetting")
@XmlEnum
public enum OrthoClinPracticeSetting {

    ORTHO,
    HAND;

    public String value() {
        return name();
    }

    public static OrthoClinPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
