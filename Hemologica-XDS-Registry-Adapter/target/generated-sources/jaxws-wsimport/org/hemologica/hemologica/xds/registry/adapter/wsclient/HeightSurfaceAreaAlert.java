
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HeightSurfaceAreaAlert.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="HeightSurfaceAreaAlert">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DOSEHINDSA"/>
 *     &lt;enumeration value="DOSELINDSA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HeightSurfaceAreaAlert")
@XmlEnum
public enum HeightSurfaceAreaAlert {

    DOSEHINDSA,
    DOSELINDSA;

    public String value() {
        return name();
    }

    public static HeightSurfaceAreaAlert fromValue(String v) {
        return valueOf(v);
    }

}
