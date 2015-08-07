
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PedsICUPracticeSetting.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PedsICUPracticeSetting">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PEDICU"/>
 *     &lt;enumeration value="PEDNICU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PedsICUPracticeSetting")
@XmlEnum
public enum PedsICUPracticeSetting {

    PEDICU,
    PEDNICU;

    public String value() {
        return name();
    }

    public static PedsICUPracticeSetting fromValue(String v) {
        return valueOf(v);
    }

}
