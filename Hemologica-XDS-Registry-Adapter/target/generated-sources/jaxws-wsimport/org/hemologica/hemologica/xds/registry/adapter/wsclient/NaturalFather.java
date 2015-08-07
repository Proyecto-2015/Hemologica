
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NaturalFather.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="NaturalFather">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NFTH"/>
 *     &lt;enumeration value="NFTHF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NaturalFather")
@XmlEnum
public enum NaturalFather {

    NFTH,
    NFTHF;

    public String value() {
        return name();
    }

    public static NaturalFather fromValue(String v) {
        return valueOf(v);
    }

}
