
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ComplianceDetectedIssueCodeDuplicateTherapyAlertByBOT.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ComplianceDetectedIssueCodeDuplicateTherapyAlertByBOT">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DUPTHPY"/>
 *     &lt;enumeration value="DUPTHPGEN"/>
 *     &lt;enumeration value="DUPTHPCLS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComplianceDetectedIssueCodeDuplicateTherapyAlertByBOT")
@XmlEnum
public enum ComplianceDetectedIssueCodeDuplicateTherapyAlertByBOT {

    DUPTHPY,
    DUPTHPGEN,
    DUPTHPCLS;

    public String value() {
        return name();
    }

    public static ComplianceDetectedIssueCodeDuplicateTherapyAlertByBOT fromValue(String v) {
        return valueOf(v);
    }

}
