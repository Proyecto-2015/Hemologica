
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OralSolution.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OralSolution">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ORALSOL"/>
 *     &lt;enumeration value="ELIXIR"/>
 *     &lt;enumeration value="RINSE"/>
 *     &lt;enumeration value="ORDROP"/>
 *     &lt;enumeration value="SYRUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OralSolution")
@XmlEnum
public enum OralSolution {

    ORALSOL,
    ELIXIR,
    RINSE,
    ORDROP,
    SYRUP;

    public String value() {
        return name();
    }

    public static OralSolution fromValue(String v) {
        return valueOf(v);
    }

}
