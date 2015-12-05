package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the blood_abo_types_codes database table.
 * 
 */
@Entity
@Table(name="blood_abo_types_codes")
@NamedQueries({
@NamedQuery(name="BloodAboTypesCode.findAll", query="SELECT b FROM BloodAboTypesCode b"),
@NamedQuery(name="BloodAboTypesCode.getBloodAboTypesCodeByCode", query="SELECT i FROM BloodAboTypesCode i where i.bloodAboTypeCodeId = :code")
})
public class BloodAboTypesCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="blood_abo_type_code_id")
	private Long bloodAboTypeCodeId;

	@Column(name="blood_abo_type_code_label")
	private String bloodAboTypeCodeLabel;

	@Column(name="blood_abo_type_code_value")
	private String bloodAboTypeCodeValue;

	//bi-directional many-to-one association to Concept
	@ManyToOne
	@JoinColumn(name="blood_abo_type_code_snomed")
	private Concept concept;
	
	public BloodAboTypesCode() {
	}

	public Long getBloodAboTypeCodeId() {
		return this.bloodAboTypeCodeId;
	}

	public void setBloodAboTypeCodeId(Long bloodAboTypeCodeId) {
		this.bloodAboTypeCodeId = bloodAboTypeCodeId;
	}

	public String getBloodAboTypeCodeLabel() {
		return this.bloodAboTypeCodeLabel;
	}

	public void setBloodAboTypeCodeLabel(String bloodAboTypeCodeLabel) {
		this.bloodAboTypeCodeLabel = bloodAboTypeCodeLabel;
	}

	public String getBloodAboTypeCodeValue() {
		return this.bloodAboTypeCodeValue;
	}

	public void setBloodAboTypeCodeValue(String bloodAboTypeCodeValue) {
		this.bloodAboTypeCodeValue = bloodAboTypeCodeValue;
	}

	public Concept getConcept() {
		return this.concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}
	
}