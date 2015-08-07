
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActClassObservationSeries.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassObservationSeries">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="OBSSER"/>
 *     &lt;enumeration value="OBSCOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassObservationSeries")
@XmlEnum
public enum ActClassObservationSeries {

    OBSSER,
    OBSCOR;

    public String value() {
        return name();
    }

    public static ActClassObservationSeries fromValue(String v) {
        return valueOf(v);
    }

}
