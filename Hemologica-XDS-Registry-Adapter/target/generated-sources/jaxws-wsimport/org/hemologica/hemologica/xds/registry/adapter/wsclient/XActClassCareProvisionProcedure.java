
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para x_ActClassCareProvisionProcedure.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActClassCareProvisionProcedure">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PCPR"/>
 *     &lt;enumeration value="PROC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActClassCareProvisionProcedure")
@XmlEnum
public enum XActClassCareProvisionProcedure {

    PCPR,
    PROC;

    public String value() {
        return name();
    }

    public static XActClassCareProvisionProcedure fromValue(String v) {
        return valueOf(v);
    }

}
