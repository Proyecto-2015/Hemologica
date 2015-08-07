
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataTypeGeneralTimingSpecification.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeGeneralTimingSpecification">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeGeneralTimingSpecification")
@XmlEnum
public enum DataTypeGeneralTimingSpecification {

    GTS;

    public String value() {
        return name();
    }

    public static DataTypeGeneralTimingSpecification fromValue(String v) {
        return valueOf(v);
    }

}
