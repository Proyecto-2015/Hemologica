
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActRelationshipHasSupport.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipHasSupport">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SPRT"/>
 *     &lt;enumeration value="SPRTBND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipHasSupport")
@XmlEnum
public enum ActRelationshipHasSupport {

    SPRT,
    SPRTBND;

    public String value() {
        return name();
    }

    public static ActRelationshipHasSupport fromValue(String v) {
        return valueOf(v);
    }

}
