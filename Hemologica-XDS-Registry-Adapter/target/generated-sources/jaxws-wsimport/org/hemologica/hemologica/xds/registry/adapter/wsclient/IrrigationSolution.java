
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IrrigationSolution.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="IrrigationSolution">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IRSOL"/>
 *     &lt;enumeration value="DOUCHE"/>
 *     &lt;enumeration value="ENEMA"/>
 *     &lt;enumeration value="OPIRSOL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IrrigationSolution")
@XmlEnum
public enum IrrigationSolution {

    IRSOL,
    DOUCHE,
    ENEMA,
    OPIRSOL;

    public String value() {
        return name();
    }

    public static IrrigationSolution fromValue(String v) {
        return valueOf(v);
    }

}
