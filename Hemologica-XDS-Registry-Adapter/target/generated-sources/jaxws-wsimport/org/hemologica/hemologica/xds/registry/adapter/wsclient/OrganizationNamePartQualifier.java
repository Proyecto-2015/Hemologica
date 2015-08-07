
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrganizationNamePartQualifier.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganizationNamePartQualifier">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="LS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrganizationNamePartQualifier")
@XmlEnum
public enum OrganizationNamePartQualifier {

    LS;

    public String value() {
        return name();
    }

    public static OrganizationNamePartQualifier fromValue(String v) {
        return valueOf(v);
    }

}
