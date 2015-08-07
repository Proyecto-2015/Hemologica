
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BuildingNumberSuffixByBOT.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildingNumberSuffixByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BNS"/>
 *     &lt;enumeration value="POB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuildingNumberSuffixByBOT")
@XmlEnum
public enum BuildingNumberSuffixByBOT {

    BNS,
    POB;

    public String value() {
        return name();
    }

    public static BuildingNumberSuffixByBOT fromValue(String v) {
        return valueOf(v);
    }

}
