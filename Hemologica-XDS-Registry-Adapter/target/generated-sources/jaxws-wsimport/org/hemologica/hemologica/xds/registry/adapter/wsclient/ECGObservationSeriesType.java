
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ECGObservationSeriesType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ECGObservationSeriesType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="REPRESENTATIVE_BEAT"/>
 *     &lt;enumeration value="RHYTHM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECGObservationSeriesType")
@XmlEnum
public enum ECGObservationSeriesType {

    REPRESENTATIVE_BEAT,
    RHYTHM;

    public String value() {
        return name();
    }

    public static ECGObservationSeriesType fromValue(String v) {
        return valueOf(v);
    }

}
