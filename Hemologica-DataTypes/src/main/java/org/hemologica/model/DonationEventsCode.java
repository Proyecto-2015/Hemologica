package org.hemologica.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the donation_events_codes database table.
 * 
 */
@Entity
@Table(name="donation_events_codes")
@NamedQuery(name="DonationEventsCode.findAll", query="SELECT d FROM DonationEventsCode d")
public class DonationEventsCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="donation_event_code_id")
	private int donationEventCodeId;

	@Column(name="donation_event_code_label")
	private String donationEventCodeLabel;

	@Column(name="donation_event_code_value")
	private String donationEventCodeValue;

	//bi-directional many-to-one association to Concept
	@ManyToOne
	@JoinColumn(name="donation_event_code_snomed")
	private Concept concept;

	public DonationEventsCode() {
	}

	public int getDonationEventCodeId() {
		return this.donationEventCodeId;
	}

	public void setDonationEventCodeId(int donationEventCodeId) {
		this.donationEventCodeId = donationEventCodeId;
	}

	public String getDonationEventCodeLabel() {
		return this.donationEventCodeLabel;
	}

	public void setDonationEventCodeLabel(String donationEventCodeLabel) {
		this.donationEventCodeLabel = donationEventCodeLabel;
	}

	public String getDonationEventCodeValue() {
		return this.donationEventCodeValue;
	}

	public void setDonationEventCodeValue(String donationEventCodeValue) {
		this.donationEventCodeValue = donationEventCodeValue;
	}

	public Concept getConcept() {
		return this.concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}

}