package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the transfusion_laboratory_codes database table.
 * 
 */
@Entity
@Table(name="transfusion_laboratory_codes")
@NamedQuery(name="TransfusionLaboratoryCode.findAll", query="SELECT t FROM TransfusionLaboratoryCode t")
public class TransfusionLaboratoryCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transfusion_laboratory_code_id")
	private int transfusionLaboratoryCodeId;

	@Column(name="transfusion_laboratory_code_label")
	private String transfusionLaboratoryCodeLabel;

	@Column(name="transfusion_laboratory_code_value")
	private String transfusionLaboratoryCodeValue;

	//bi-directional many-to-one association to Concept
	@ManyToOne
	@JoinColumn(name="transfusion_laboratory_code_snomed")
	private Concept concept;

	public TransfusionLaboratoryCode() {
	}

	public int getTransfusionLaboratoryCodeId() {
		return this.transfusionLaboratoryCodeId;
	}

	public void setTransfusionLaboratoryCodeId(int transfusionLaboratoryCodeId) {
		this.transfusionLaboratoryCodeId = transfusionLaboratoryCodeId;
	}

	public String getTransfusionLaboratoryCodeLabel() {
		return this.transfusionLaboratoryCodeLabel;
	}

	public void setTransfusionLaboratoryCodeLabel(String transfusionLaboratoryCodeLabel) {
		this.transfusionLaboratoryCodeLabel = transfusionLaboratoryCodeLabel;
	}

	public String getTransfusionLaboratoryCodeValue() {
		return this.transfusionLaboratoryCodeValue;
	}

	public void setTransfusionLaboratoryCodeValue(String transfusionLaboratoryCodeValue) {
		this.transfusionLaboratoryCodeValue = transfusionLaboratoryCodeValue;
	}

	public Concept getConcept() {
		return this.concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}

}