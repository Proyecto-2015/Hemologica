package org.hemologica.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="gender_code")
@NamedQueries({
@NamedQuery(name="GenderCode.findAll", query="SELECT d FROM GenderCode d"),
@NamedQuery(name="GenderCode.findByHl7Code", query="SELECT d FROM GenderCode d WHERE d.hl7Code = :code"),
@NamedQuery(name="GenderCode.findById", query="SELECT d FROM GenderCode d WHERE d.genderCodeValue = :code")
})
public class GenderCode implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gender_code_id")
	private Long genderCodeId;

	@Column(name="gender_code_label")
	private String genderCodeLabel;

	@Column(name="gender_code_value")
	private String genderCodeValue;
	
	@Column(name="gender_hl7_code")
	private String hl7Code;

	public Long getGenderCodeId() {
		return genderCodeId;
	}

	public void setGenderCodeId(Long genderCodeId) {
		this.genderCodeId = genderCodeId;
	}

	public String getGenderCodeLabel() {
		return genderCodeLabel;
	}

	public void setGenderCodeLabel(String genderCodeLabel) {
		this.genderCodeLabel = genderCodeLabel;
	}

	public String getGenderCodeValue() {
		return genderCodeValue;
	}

	public void setGenderCodeValue(String genderCodeValue) {
		this.genderCodeValue = genderCodeValue;
	}

	public String getHl7Code() {
		return hl7Code;
	}

	public void setHl7Code(String hl7Code) {
		this.hl7Code = hl7Code;
	}

}
