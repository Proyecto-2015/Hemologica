
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RelationalOperator.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationalOperator">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="EQ"/>
 *     &lt;enumeration value="GN"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LE"/>
 *     &lt;enumeration value="NE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelationalOperator")
@XmlEnum
public enum RelationalOperator {

    CT,
    EQ,
    GN,
    GT,
    GE,
    LT,
    LE,
    NE;

    public String value() {
        return name();
    }

    public static RelationalOperator fromValue(String v) {
        return valueOf(v);
    }

}
