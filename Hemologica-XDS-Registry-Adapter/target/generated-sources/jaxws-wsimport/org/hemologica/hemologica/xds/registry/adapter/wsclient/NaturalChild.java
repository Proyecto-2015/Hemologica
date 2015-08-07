
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NaturalChild.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="NaturalChild">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="NCHILD"/>
 *     &lt;enumeration value="DAU"/>
 *     &lt;enumeration value="SON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NaturalChild")
@XmlEnum
public enum NaturalChild {

    NCHILD,
    DAU,
    SON;

    public String value() {
        return name();
    }

    public static NaturalChild fromValue(String v) {
        return valueOf(v);
    }

}
