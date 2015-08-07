
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParentInLaw.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ParentInLaw">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PRNINLAW"/>
 *     &lt;enumeration value="FTHINLAW"/>
 *     &lt;enumeration value="MTHINLAW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParentInLaw")
@XmlEnum
public enum ParentInLaw {

    PRNINLAW,
    FTHINLAW,
    MTHINLAW;

    public String value() {
        return name();
    }

    public static ParentInLaw fromValue(String v) {
        return valueOf(v);
    }

}
