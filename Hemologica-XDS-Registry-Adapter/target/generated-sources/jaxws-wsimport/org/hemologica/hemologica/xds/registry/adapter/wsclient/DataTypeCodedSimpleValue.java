
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataTypeCodedSimpleValue.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeCodedSimpleValue">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeCodedSimpleValue")
@XmlEnum
public enum DataTypeCodedSimpleValue {

    CS;

    public String value() {
        return name();
    }

    public static DataTypeCodedSimpleValue fromValue(String v) {
        return valueOf(v);
    }

}
