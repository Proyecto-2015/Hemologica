
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActMoodProposal.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMoodProposal">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PRP"/>
 *     &lt;enumeration value="RMD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActMoodProposal")
@XmlEnum
public enum ActMoodProposal {

    PRP,
    RMD;

    public String value() {
        return name();
    }

    public static ActMoodProposal fromValue(String v) {
        return valueOf(v);
    }

}
