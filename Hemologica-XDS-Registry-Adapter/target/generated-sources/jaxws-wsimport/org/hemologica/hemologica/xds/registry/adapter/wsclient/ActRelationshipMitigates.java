
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActRelationshipMitigates.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipMitigates">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MITGT"/>
 *     &lt;enumeration value="RCVY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipMitigates")
@XmlEnum
public enum ActRelationshipMitigates {

    MITGT,
    RCVY;

    public String value() {
        return name();
    }

    public static ActRelationshipMitigates fromValue(String v) {
        return valueOf(v);
    }

}
