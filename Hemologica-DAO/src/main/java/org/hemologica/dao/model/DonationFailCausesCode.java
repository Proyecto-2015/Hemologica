package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the donation_fail_causes_codes database table.
 * 
 */
@Entity
@Table(name="donation_fail_causes_codes")
@NamedQuery(name="DonationFailCausesCode.findAll", query="SELECT d FROM DonationFailCausesCode d")
public class DonationFailCausesCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="donation_fail_cause_code_id")
	private int donationFailCauseCodeId;

	@Column(name="donation_fail_cause_code_label")
	private String donationFailCauseCodeLabel;

	@Column(name="donation_fail_cause_code_value")
	private String donationFailCauseCodeValue;
	
	@ManyToOne
	@JoinColumn(name="donation_fail_cause_code_snomed")
	private Concept concept;

	public DonationFailCausesCode() {
	}

	public int getDonationFailCauseCodeId() {
		return this.donationFailCauseCodeId;
	}

	public void setDonationFailCauseCodeId(int donationFailCauseCodeId) {
		this.donationFailCauseCodeId = donationFailCauseCodeId;
	}

	public String getDonationFailCauseCodeLabel() {
		return this.donationFailCauseCodeLabel;
	}

	public void setDonationFailCauseCodeLabel(String donationFailCauseCodeLabel) {
		this.donationFailCauseCodeLabel = donationFailCauseCodeLabel;
	}

	public String getDonationFailCauseCodeValue() {
		return this.donationFailCauseCodeValue;
	}

	public void setDonationFailCauseCodeValue(String donationFailCauseCodeValue) {
		this.donationFailCauseCodeValue = donationFailCauseCodeValue;
	}

}