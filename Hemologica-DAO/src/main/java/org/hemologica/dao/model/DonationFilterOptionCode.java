package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="donation_filter_option_codes")
@NamedQueries({
@NamedQuery(name="DonationFilterOptionCode.findAll", query="SELECT d FROM DonationFilterOptionCode d"),
@NamedQuery(name="DonationFilterOptionCode.findById", query="SELECT d FROM DonationFilterOptionCode d WHERE d.id = :code")
})
public class DonationFilterOptionCode implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="donation_filter_option_codes_id")
	private int donationFilterOptionCodes;
	
	@Column(name="donation_filter_option_codes_label")
	private String donationFilterOptionCodesLabel;
	
	@Column(name="donation_filter_option_codes_value")
	private String donationFilterOptionCodesValue;
	
	@ManyToOne
	@JoinColumn(name="donation_filter_option_code_snomed")
	private Concept concept;
	
	@Column(name="donation_filter_option_code_hl7")
	private String hl7Code;
	
	//bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name="donation_filter_id")
	private DonationFilterCode donationFilterCode;
	
	public int getDonationFilterOptionCodes() {
		return donationFilterOptionCodes;
	}
	
	public void setDonationFilterOptionCodes(int donationFilterOptionCodes) {
		this.donationFilterOptionCodes = donationFilterOptionCodes;
	}
	
	public String getDonationFilterOptionCodesLabel() {
		return donationFilterOptionCodesLabel;
	}
	
	public void setDonationFilterOptionCodesLabel(String donationFilterOptionCodesLabel) {
		this.donationFilterOptionCodesLabel = donationFilterOptionCodesLabel;
	}
	
	public String getDonationFilterOptionCodesValue() {
		return donationFilterOptionCodesValue;
	}
	
	public void setDonationFilterOptionCodesValue(String donationFilterOptionCodesValue) {
		this.donationFilterOptionCodesValue = donationFilterOptionCodesValue;
	}
	
	public DonationFilterCode getDonationFilterCode() {
		return donationFilterCode;
	}
	
	public void setDonationFilterCode(DonationFilterCode donationFilterCode) {
		this.donationFilterCode = donationFilterCode;
	}

	public Concept getConcept() {
		return concept;
	}

	public void setConcept(Concept concept) {
		this.concept = concept;
	}

	public String getHl7Code() {
		return hl7Code;
	}

	public void setHl7Code(String hl7Code) {
		this.hl7Code = hl7Code;
	}

}
