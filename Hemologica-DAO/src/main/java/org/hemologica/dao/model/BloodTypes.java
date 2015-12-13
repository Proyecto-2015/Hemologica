package org.hemologica.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="blood_types_codes")
@NamedQueries({
@NamedQuery(name="BloodTypes.findAll", query="SELECT b FROM BloodTypes b"),
@NamedQuery(name="BloodTypes.findById", query="SELECT b FROM BloodTypes b WHERE b.bloodTypeCodeValue = :code"),
@NamedQuery(name="BloodTypes.findBySnomedCodeId", query="SELECT b FROM BloodTypes b WHERE b.concept.conceptCode = :code"),
@NamedQuery(name="BloodTypes.findByABORHCodes", query="SELECT b FROM BloodTypes b WHERE"
		+ " b.bloodAboTypesCode.bloodAboTypeCodeValue = :codeABO AND b.bloodDTypesCode.bloodDTypeCodeValue = :codeRH")

})
public class BloodTypes implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="blood_type_code_id")
	private int bloodTypeCodeId;

	@Column(name="blood_type_code_label")
	private String bloodTypeCodeLabel;

	@Column(name="blood_type_code_value")
	private String bloodTypeCodeValue;

	//bi-directional many-to-one association to Concept
	@ManyToOne
	@JoinColumn(name="blood_type_code_snomed")
	private Concept concept;
	
	@ManyToOne
	@JoinColumn(name="blood_abo_type_code_snomed")
	private BloodAboTypesCode bloodAboTypesCode;
	
	@ManyToOne
	@JoinColumn(name="blood_rh_type_code_snomed")
	private BloodDTypesCode bloodDTypesCode;

	public int getBloodTypeCodeId() {
		return bloodTypeCodeId;
	}

	public void setBloodTypeCodeId(int bloodTypeCodeId) {
		this.bloodTypeCodeId = bloodTypeCodeId;
	}

	public String getBloodTypeCodeLabel() {
		return bloodTypeCodeLabel;
	}

	public void setBloodTypeCodeLabel(String bloodTypeCodeLabel) {
		this.bloodTypeCodeLabel = bloodTypeCodeLabel;
	}

	public String getBloodTypeCodeValue() {
		return bloodTypeCodeValue;
	}

	public void setBloodTypeCodeValue(String bloodTypeCodeValue) {
		this.bloodTypeCodeValue = bloodTypeCodeValue;
	}

	public Concept getConcept() {
		return concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}

	public BloodAboTypesCode getBloodAboTypesCode() {
		return bloodAboTypesCode;
	}

	public void setBloodAboTypesCode(BloodAboTypesCode bloodAboTypesCode) {
		this.bloodAboTypesCode = bloodAboTypesCode;
	}

	public BloodDTypesCode getBloodDTypesCode() {
		return bloodDTypesCode;
	}

	public void setBloodDTypesCode(BloodDTypesCode bloodDTypesCode) {
		this.bloodDTypesCode = bloodDTypesCode;
	}

}
