
package org.hemologica.hemologica.xds.registry.adapter.wsclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PRPA_MT201302UV02.Patient.patientPerson.updateMode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PRPA_MT201302UV02.Patient.patientPerson.updateMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PRPA_MT201302UV02.Patient.patientPerson.updateMode")
@XmlEnum
public enum PRPAMT201302UV02PatientPatientPersonUpdateMode {

    N;

    public String value() {
        return name();
    }

    public static PRPAMT201302UV02PatientPatientPersonUpdateMode fromValue(String v) {
        return valueOf(v);
    }

}