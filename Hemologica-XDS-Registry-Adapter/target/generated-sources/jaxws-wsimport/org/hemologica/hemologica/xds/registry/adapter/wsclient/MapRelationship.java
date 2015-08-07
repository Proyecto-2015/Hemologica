
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MapRelationship.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="MapRelationship">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BT"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="NT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MapRelationship")
@XmlEnum
public enum MapRelationship {

    BT,
    E,
    NT;

    public String value() {
        return name();
    }

    public static MapRelationship fromValue(String v) {
        return valueOf(v);
    }

}
