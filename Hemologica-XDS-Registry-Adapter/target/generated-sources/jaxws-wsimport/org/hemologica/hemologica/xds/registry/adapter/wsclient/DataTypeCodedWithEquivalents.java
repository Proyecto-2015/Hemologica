
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataTypeCodedWithEquivalents.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeCodedWithEquivalents">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeCodedWithEquivalents")
@XmlEnum
public enum DataTypeCodedWithEquivalents {

    CE;

    public String value() {
        return name();
    }

    public static DataTypeCodedWithEquivalents fromValue(String v) {
        return valueOf(v);
    }

}
