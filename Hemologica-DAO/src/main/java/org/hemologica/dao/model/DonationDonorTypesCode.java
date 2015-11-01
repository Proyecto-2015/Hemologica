package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the donation_donor_types_codes database table.
 * 
 */
@Entity
@Table(name="donation_donor_types_codes")
@NamedQuery(name="DonationDonorTypesCode.findAll", query="SELECT d FROM DonationDonorTypesCode d")
public class DonationDonorTypesCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="donation_donor_type_code_id")
	private int donationDonorTypeCodeId;

	@Column(name="donation_donor_type_code_label")
	private String donationDonorTypeCodeLabel;

	@Column(name="donation_donor_type_code_value")
	private String donationDonorTypeCodeValue;

	//bi-directional many-to-one association to Concept
	@ManyToOne
	@JoinColumn(name="donation_donor_type_code_snomed")
	private Concept concept;

	public DonationDonorTypesCode() {
	}

	public int getDonationDonorTypeCodeId() {
		return this.donationDonorTypeCodeId;
	}

	public void setDonationDonorTypeCodeId(int donationDonorTypeCodeId) {
		this.donationDonorTypeCodeId = donationDonorTypeCodeId;
	}

	public String getDonationDonorTypeCodeLabel() {
		return this.donationDonorTypeCodeLabel;
	}

	public void setDonationDonorTypeCodeLabel(String donationDonorTypeCodeLabel) {
		this.donationDonorTypeCodeLabel = donationDonorTypeCodeLabel;
	}

	public String getDonationDonorTypeCodeValue() {
		return this.donationDonorTypeCodeValue;
	}

	public void setDonationDonorTypeCodeValue(String donationDonorTypeCodeValue) {
		this.donationDonorTypeCodeValue = donationDonorTypeCodeValue;
	}

	public Concept getConcept() {
		return this.concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}

}