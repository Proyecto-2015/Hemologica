
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DuplicateTherapyAlert.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DuplicateTherapyAlert">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DUPTHPY"/>
 *     &lt;enumeration value="DUPTHPGEN"/>
 *     &lt;enumeration value="DUPTHPCLS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DuplicateTherapyAlert")
@XmlEnum
public enum DuplicateTherapyAlert {

    DUPTHPY,
    DUPTHPGEN,
    DUPTHPCLS;

    public String value() {
        return name();
    }

    public static DuplicateTherapyAlert fromValue(String v) {
        return valueOf(v);
    }

}
