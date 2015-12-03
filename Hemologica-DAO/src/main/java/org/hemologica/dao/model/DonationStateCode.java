package org.hemologica.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="donation_state_code")
@NamedQueries({
@NamedQuery(name="DonationStateCode.findAll", query="SELECT d FROM DonationStateCode d"),
@NamedQuery(name="DonationStateCode.findById", query="SELECT d FROM DonationStateCode d WHERE d.id = :code")
})
public class DonationStateCode {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="donation_state_code_id")
	private int donationStateCodeId;

	@Column(name="donation_state_code_label")
	private String donationStateCodeLabel;

	@Column(name="donation_state_code_value")
	private String donationStateCodeValue;

	public int getDonationStateCodeId() {
		return donationStateCodeId;
	}

	public void setDonationStateCodeId(int donationStateCodeId) {
		this.donationStateCodeId = donationStateCodeId;
	}

	public String getDonationStateCodeLabel() {
		return donationStateCodeLabel;
	}

	public void setDonationStateCodeLabel(String donationStateCodeLabel) {
		this.donationStateCodeLabel = donationStateCodeLabel;
	}

	public String getDonationStateCodeValue() {
		return donationStateCodeValue;
	}

	public void setDonationStateCodeValue(String donationStateCodeValue) {
		this.donationStateCodeValue = donationStateCodeValue;
	}

}
