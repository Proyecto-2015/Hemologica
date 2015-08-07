
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ElectroOsmosisRoute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ElectroOsmosisRoute">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ELECTOSMOS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElectroOsmosisRoute")
@XmlEnum
public enum ElectroOsmosisRoute {

    ELECTOSMOS;

    public String value() {
        return name();
    }

    public static ElectroOsmosisRoute fromValue(String v) {
        return valueOf(v);
    }

}
