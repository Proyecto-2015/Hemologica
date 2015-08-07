
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActRelationshipCheckpoint.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipCheckpoint">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipCheckpoint")
@XmlEnum
public enum ActRelationshipCheckpoint {

    B,
    E,
    S,
    X,
    T;

    public String value() {
        return name();
    }

    public static ActRelationshipCheckpoint fromValue(String v) {
        return valueOf(v);
    }

}
