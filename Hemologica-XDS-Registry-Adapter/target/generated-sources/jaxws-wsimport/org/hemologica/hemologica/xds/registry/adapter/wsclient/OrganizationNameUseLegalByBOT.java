
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrganizationNameUseLegalByBOT.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganizationNameUseLegalByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="OR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganizationNameUseLegalByBOT")
@XmlEnum
public enum OrganizationNameUseLegalByBOT {

    L,
    OR;

    public String value() {
        return name();
    }

    public static OrganizationNameUseLegalByBOT fromValue(String v) {
        return valueOf(v);
    }

}
