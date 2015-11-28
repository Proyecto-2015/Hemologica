package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the donation_types_codes database table.
 * 
 */
@Entity
@Table(name="donation_types_codes")
@NamedQueries({
@NamedQuery(name="DonationTypesCode.findAll", query="SELECT d FROM DonationTypesCode d"),
@NamedQuery(name="DonationTypesCode.findById", query="SELECT c FROM DonationTypesCode c WHERE c.donationTypeCodeValue = :code "),
@NamedQuery(name="DonationTypesCode.findBySnomedCode", query="SELECT c FROM DonationTypesCode c WHERE c.concept.conceptCode = :code ")
})
public class DonationTypesCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="donation_type_code_id")
	private int donationTypeCodeId;

	@Column(name="donation_type_code_label")
	private String donationTypeCodeLabel;

	@Column(name="donation_type_code_value")
	private String donationTypeCodeValue;

	//bi-directional many-to-one association to Concept
	@ManyToOne
	@JoinColumn(name="donation_type_code_snomed")
	private Concept concept;

	public DonationTypesCode() {
	}

	public int getDonationTypeCodeId() {
		return this.donationTypeCodeId;
	}

	public void setDonationTypeCodeId(int donationTypeCodeId) {
		this.donationTypeCodeId = donationTypeCodeId;
	}

	public String getDonationTypeCodeLabel() {
		return this.donationTypeCodeLabel;
	}

	public void setDonationTypeCodeLabel(String donationTypeCodeLabel) {
		this.donationTypeCodeLabel = donationTypeCodeLabel;
	}

	public String getDonationTypeCodeValue() {
		return this.donationTypeCodeValue;
	}

	public void setDonationTypeCodeValue(String donationTypeCodeValue) {
		this.donationTypeCodeValue = donationTypeCodeValue;
	}

	public Concept getConcept() {
		return this.concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}

}