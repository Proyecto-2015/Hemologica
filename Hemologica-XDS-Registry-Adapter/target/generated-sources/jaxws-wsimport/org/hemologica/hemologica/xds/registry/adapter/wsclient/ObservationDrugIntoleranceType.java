
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObservationDrugIntoleranceType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationDrugIntoleranceType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DINT"/>
 *     &lt;enumeration value="DALG"/>
 *     &lt;enumeration value="DNAINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObservationDrugIntoleranceType")
@XmlEnum
public enum ObservationDrugIntoleranceType {

    DINT,
    DALG,
    DNAINT;

    public String value() {
        return name();
    }

    public static ObservationDrugIntoleranceType fromValue(String v) {
        return valueOf(v);
    }

}
