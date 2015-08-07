
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CoverageSponsorRoleType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CoverageSponsorRoleType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="FULLINS"/>
 *     &lt;enumeration value="SELFINS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CoverageSponsorRoleType")
@XmlEnum
public enum CoverageSponsorRoleType {

    FULLINS,
    SELFINS;

    public String value() {
        return name();
    }

    public static CoverageSponsorRoleType fromValue(String v) {
        return valueOf(v);
    }

}
