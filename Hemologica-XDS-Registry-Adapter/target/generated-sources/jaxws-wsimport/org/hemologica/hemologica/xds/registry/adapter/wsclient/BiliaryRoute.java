
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BiliaryRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="BiliaryRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BILINJ"/>
 *     &lt;enumeration value="CHOLINJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BiliaryRoute")
@XmlEnum
public enum BiliaryRoute {

    BILINJ,
    CHOLINJ;

    public String value() {
        return name();
    }

    public static BiliaryRoute fromValue(String v) {
        return valueOf(v);
    }

}
