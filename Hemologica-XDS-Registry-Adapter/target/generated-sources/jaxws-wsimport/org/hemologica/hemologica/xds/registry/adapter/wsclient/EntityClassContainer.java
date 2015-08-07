
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EntityClassContainer.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityClassContainer">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CONT"/>
 *     &lt;enumeration value="HOLD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityClassContainer")
@XmlEnum
public enum EntityClassContainer {

    CONT,
    HOLD;

    public String value() {
        return name();
    }

    public static EntityClassContainer fromValue(String v) {
        return valueOf(v);
    }

}
