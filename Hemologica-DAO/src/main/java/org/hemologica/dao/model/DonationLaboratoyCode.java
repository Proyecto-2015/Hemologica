package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the donation_laboratoy_codes database table.
 * 
 */
@Entity
@Table(name="donation_laboratoy_codes")
@NamedQueries({
@NamedQuery(name="DonationLaboratoyCode.findAll", query="SELECT d FROM DonationLaboratoyCode d"),
@NamedQuery(name="DonationLaboratoyCode.findBySnomedCode", query="SELECT d FROM DonationLaboratoyCode d WHERE d.concept.conceptCode = :code"),
@NamedQuery(name="DonationLaboratoyCode.findById", query="SELECT d FROM DonationLaboratoyCode d WHERE d.donationLaboratoyCodeValue = :code")
})
public class DonationLaboratoyCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="donation_laboratoy_code_id")
	private Long donationLaboratoyCodeId;

	@Column(name="donation_laboratoy_code_label")
	private String donationLaboratoyCodeLabel;

	@Column(name="donation_laboratoy_code_value")
	private String donationLaboratoyCodeValue;

	//bi-directional many-to-one association to Concept
	@ManyToOne
	@JoinColumn(name="donation_laboratoy_code_snomed")
	private Concept concept;

	public DonationLaboratoyCode() {
	}

	public Long getDonationLaboratoyCodeId() {
		return this.donationLaboratoyCodeId;
	}

	public void setDonationLaboratoyCodeId(Long donationLaboratoyCodeId) {
		this.donationLaboratoyCodeId = donationLaboratoyCodeId;
	}

	public String getDonationLaboratoyCodeLabel() {
		return this.donationLaboratoyCodeLabel;
	}

	public void setDonationLaboratoyCodeLabel(String donationLaboratoyCodeLabel) {
		this.donationLaboratoyCodeLabel = donationLaboratoyCodeLabel;
	}

	public String getDonationLaboratoyCodeValue() {
		return this.donationLaboratoyCodeValue;
	}

	public void setDonationLaboratoyCodeValue(String donationLaboratoyCodeValue) {
		this.donationLaboratoyCodeValue = donationLaboratoyCodeValue;
	}

	public Concept getConcept() {
		return this.concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}

}