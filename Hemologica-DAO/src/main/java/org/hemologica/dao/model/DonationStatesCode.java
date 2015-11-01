package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the donation_states_codes database table.
 * 
 */
@Entity
@Table(name="donation_states_codes")
@NamedQuery(name="DonationStatesCode.findAll", query="SELECT d FROM DonationStatesCode d")
public class DonationStatesCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="donation_state_code_id")
	private int donationStateCodeId;

	@Column(name="donation_state_code_label")
	private String donationStateCodeLabel;

	@Column(name="donation_state_code_value")
	private String donationStateCodeValue;

	public DonationStatesCode() {
	}

	public int getDonationStateCodeId() {
		return this.donationStateCodeId;
	}

	public void setDonationStateCodeId(int donationStateCodeId) {
		this.donationStateCodeId = donationStateCodeId;
	}

	public String getDonationStateCodeLabel() {
		return this.donationStateCodeLabel;
	}

	public void setDonationStateCodeLabel(String donationStateCodeLabel) {
		this.donationStateCodeLabel = donationStateCodeLabel;
	}

	public String getDonationStateCodeValue() {
		return this.donationStateCodeValue;
	}

	public void setDonationStateCodeValue(String donationStateCodeValue) {
		this.donationStateCodeValue = donationStateCodeValue;
	}

}