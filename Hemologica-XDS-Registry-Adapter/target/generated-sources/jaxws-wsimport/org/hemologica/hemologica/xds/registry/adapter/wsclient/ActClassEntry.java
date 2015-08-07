
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActClassEntry.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassEntry">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ENTRY"/>
 *     &lt;enumeration value="CLUSTER"/>
 *     &lt;enumeration value="BATTERY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassEntry")
@XmlEnum
public enum ActClassEntry {

    ENTRY,
    CLUSTER,
    BATTERY;

    public String value() {
        return name();
    }

    public static ActClassEntry fromValue(String v) {
        return valueOf(v);
    }

}
