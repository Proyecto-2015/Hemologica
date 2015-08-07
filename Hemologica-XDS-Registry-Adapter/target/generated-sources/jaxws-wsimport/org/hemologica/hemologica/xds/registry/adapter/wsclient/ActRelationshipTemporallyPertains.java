
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActRelationshipTemporallyPertains.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipTemporallyPertains">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SAE"/>
 *     &lt;enumeration value="SAS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipTemporallyPertains")
@XmlEnum
public enum ActRelationshipTemporallyPertains {

    SAE,
    SAS;

    public String value() {
        return name();
    }

    public static ActRelationshipTemporallyPertains fromValue(String v) {
        return valueOf(v);
    }

}
