
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonNameUseLegalByBOT.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonNameUseLegalByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="OR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonNameUseLegalByBOT")
@XmlEnum
public enum PersonNameUseLegalByBOT {

    L,
    OR;

    public String value() {
        return name();
    }

    public static PersonNameUseLegalByBOT fromValue(String v) {
        return valueOf(v);
    }

}
