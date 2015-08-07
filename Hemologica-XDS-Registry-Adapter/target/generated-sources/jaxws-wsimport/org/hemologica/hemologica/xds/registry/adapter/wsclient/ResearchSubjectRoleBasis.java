
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResearchSubjectRoleBasis.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ResearchSubjectRoleBasis">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ERL"/>
 *     &lt;enumeration value="SCN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResearchSubjectRoleBasis")
@XmlEnum
public enum ResearchSubjectRoleBasis {

    ERL,
    SCN;

    public String value() {
        return name();
    }

    public static ResearchSubjectRoleBasis fromValue(String v) {
        return valueOf(v);
    }

}
