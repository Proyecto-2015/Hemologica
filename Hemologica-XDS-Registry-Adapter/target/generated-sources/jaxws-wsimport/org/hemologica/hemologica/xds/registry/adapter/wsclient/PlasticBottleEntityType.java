
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PlasticBottleEntityType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PlasticBottleEntityType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BOTP"/>
 *     &lt;enumeration value="BOTPLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlasticBottleEntityType")
@XmlEnum
public enum PlasticBottleEntityType {

    BOTP,
    BOTPLY;

    public String value() {
        return name();
    }

    public static PlasticBottleEntityType fromValue(String v) {
        return valueOf(v);
    }

}
