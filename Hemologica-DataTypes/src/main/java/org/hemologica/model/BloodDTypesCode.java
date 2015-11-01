package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the blood_d_types_codes database table.
 * 
 */
@Entity
@Table(name="blood_d_types_codes")
@NamedQuery(name="BloodDTypesCode.findAll", query="SELECT b FROM BloodDTypesCode b")
public class BloodDTypesCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="blood_d_type_code_id")
	private int bloodDTypeCodeId;

	@Column(name="blood_d_type_code_label")
	private String bloodDTypeCodeLabel;

	@Column(name="blood_d_type_code_value")
	private String bloodDTypeCodeValue;

	//bi-directional many-to-one association to Concept
	@ManyToOne
	@JoinColumn(name="blood_d_type_code_snomed")
	private Concept concept;

	public BloodDTypesCode() {
	}

	public int getBloodDTypeCodeId() {
		return this.bloodDTypeCodeId;
	}

	public void setBloodDTypeCodeId(int bloodDTypeCodeId) {
		this.bloodDTypeCodeId = bloodDTypeCodeId;
	}

	public String getBloodDTypeCodeLabel() {
		return this.bloodDTypeCodeLabel;
	}

	public void setBloodDTypeCodeLabel(String bloodDTypeCodeLabel) {
		this.bloodDTypeCodeLabel = bloodDTypeCodeLabel;
	}

	public String getBloodDTypeCodeValue() {
		return this.bloodDTypeCodeValue;
	}

	public void setBloodDTypeCodeValue(String bloodDTypeCodeValue) {
		this.bloodDTypeCodeValue = bloodDTypeCodeValue;
	}

	public Concept getConcept() {
		return this.concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}

}