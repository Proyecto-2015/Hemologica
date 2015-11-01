package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the donation_fail_codes database table.
 * 
 */
@Entity
@Table(name="donation_fail_codes")
@NamedQuery(name="DonationFailCode.findAll", query="SELECT d FROM DonationFailCode d")
public class DonationFailCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="donation_fail_code_id")
	private int donationFailCodeId;

	@Column(name="donation_fail_code_label")
	private String donationFailCodeLabel;

	@Column(name="donation_fail_code_value")
	private String donationFailCodeValue;

	public DonationFailCode() {
	}

	public int getDonationFailCodeId() {
		return this.donationFailCodeId;
	}

	public void setDonationFailCodeId(int donationFailCodeId) {
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

}