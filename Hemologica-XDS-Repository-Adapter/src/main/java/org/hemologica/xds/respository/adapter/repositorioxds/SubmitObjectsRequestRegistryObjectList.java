
package org.hemologica.xds.respository.adapter.repositorioxds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hemologica.xds.respository.adapter.oasis.names.tc.ebxml_regrep.xsd.rim._3.AssociationType1;
import org.hemologica.xds.respository.adapter.oasis.names.tc.ebxml_regrep.xsd.rim._3.ClassificationType;


/**
 * <p>Clase Java para SubmitObjectsRequest.RegistryObjectList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubmitObjectsRequest.RegistryObjectList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Association" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}AssociationType1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Classification" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ClassificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtrinsicObject" type="{RepositorioXDS}ExtrinsicObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RegistryPackage" type="{RepositorioXDS}RegistryPackageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitObjectsRequest.RegistryObjectList", propOrder = {
    "association",
    "classification",
    "extrinsicObject",
    "registryPackage"
})
public class SubmitObjectsRequestRegistryObjectList {

    @XmlElement(name = "Association")
    protected List<AssociationType1> association;
    @XmlElement(name = "Classification")
    protected List<ClassificationType> classification;
    @XmlElement(name = "ExtrinsicObject")
    protected List<ExtrinsicObjectType> extrinsicObject;
    @XmlElement(name = "RegistryPackage")
    protected List<RegistryPackageType> registryPackage;

    /**
     * Gets the value of the association property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the association property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationType1 }
     * 
     * 
     */
    public List<AssociationType1> getAssociation() {
        if (association == null) {
            association = new ArrayList<AssociationType1>();
        }
        return this.association;
    }

    /**
     * Gets the value of the classification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType }
     * 
     * 
     */
    public List<ClassificationType> getClassification() {
        if (classification == null) {
            classification = new ArrayList<ClassificationType>();
        }
        return this.classification;
    }

    /**
     * Gets the value of the extrinsicObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrinsicObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrinsicObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtrinsicObjectType }
     * 
     * 
     */
    public List<ExtrinsicObjectType> getExtrinsicObject() {
        if (extrinsicObject == null) {
            extrinsicObject = new ArrayList<ExtrinsicObjectType>();
        }
        return this.extrinsicObject;
    }

    /**
     * Gets the value of the registryPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registryPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistryPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistryPackageType }
     * 
     * 
     */
    public List<RegistryPackageType> getRegistryPackage() {
        if (registryPackage == null) {
            registryPackage = new ArrayList<RegistryPackageType>();
        }
        return this.registryPackage;
    }

}
