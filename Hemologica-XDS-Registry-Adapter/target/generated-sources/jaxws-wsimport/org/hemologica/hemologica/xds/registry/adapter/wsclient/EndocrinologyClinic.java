
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EndocrinologyClinic.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="EndocrinologyClinic">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ENDO"/>
 *     &lt;enumeration value="PEDE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EndocrinologyClinic")
@XmlEnum
public enum EndocrinologyClinic {

    ENDO,
    PEDE;

    public String value() {
        return name();
    }

    public static EndocrinologyClinic fromValue(String v) {
        return valueOf(v);
    }

}
