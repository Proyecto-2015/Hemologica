
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NebulizationInhalation.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="NebulizationInhalation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NEB"/>
 *     &lt;enumeration value="NASNEB"/>
 *     &lt;enumeration value="ORNEB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NebulizationInhalation")
@XmlEnum
public enum NebulizationInhalation {

    NEB,
    NASNEB,
    ORNEB;

    public String value() {
        return name();
    }

    public static NebulizationInhalation fromValue(String v) {
        return valueOf(v);
    }

}
