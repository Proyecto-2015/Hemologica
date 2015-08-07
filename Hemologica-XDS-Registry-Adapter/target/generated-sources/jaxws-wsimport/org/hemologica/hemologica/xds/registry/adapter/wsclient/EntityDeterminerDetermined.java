
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EntityDeterminerDetermined.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityDeterminerDetermined">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="KIND"/>
 *     &lt;enumeration value="QUANTIFIED_KIND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityDeterminerDetermined")
@XmlEnum
public enum EntityDeterminerDetermined {

    KIND,
    QUANTIFIED_KIND;

    public String value() {
        return name();
    }

    public static EntityDeterminerDetermined fromValue(String v) {
        return valueOf(v);
    }

}
