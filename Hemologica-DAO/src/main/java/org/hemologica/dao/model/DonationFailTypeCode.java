package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the donation_fail_codes database table.
 * 
 */
@Entity
@Table(name="donation_fail_type_codes")
@NamedQueries({
@NamedQuery(name="DonationFailTypeCode.findAll", query="SELECT d FROM DonationFailTypeCode d"),
@NamedQuery(name="DonationFailTypeCode.findBySnomedCode", query="SELECT d FROM DonationFailTypeCode d WHERE d.concept.conceptCode = :code"),
@NamedQuery(name="DonationFailTypeCode.findBySnomedById", query="SELECT d FROM DonationFailTypeCode d WHERE d.donationFailCodeValue = :code")
})
public class DonationFailTypeCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="donation_fail_code_id")
	private Long donationFailCodeId;

	@Column(name="donation_fail_code_label")
	private String donationFailCodeLabel;

	@Column(name="donation_fail_code_value")
	private String donationFailCodeValue;
	
	@ManyToOne
	@JoinColumn(name="donation_fail_code_snomed")
	private Concept concept;
	

	public DonationFailTypeCode() {
	}

	public Long getDonationFailCodeId() {
		return this.donationFailCodeId;
	}

	public void setDonationFailCodeId(Long donationFailCodeId) {
		this.donationFailCodeId = donationFailCodeId;
	}

	public String getDonationFailCodeLabel() {
		return this.donationFailCodeLabel;
	}

	public void setDonationFailCodeLabel(String donationFailCodeLabel) {
		this.donationFailCodeLabel = donationFailCodeLabel;
	}

	public String getDonationFailCodeValue() {
		return this.donationFailCodeValue;
	}

	public void setDonationFailCodeValue(String donationFailCodeValue) {
		this.donationFailCodeValue = donationFailCodeValue;
	}

	public Concept getConcept() {
		return concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}
	
}