package org.hemologica.dao.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="donation_filter_codes")
@NamedQueries({
@NamedQuery(name="DonationFilterCode.findAll", query="SELECT d FROM DonationFilterCode d"),
@NamedQuery(name="DonationFilterCode.findById", query="SELECT d FROM DonationFilterCode d WHERE d.donationFilterCodesValue = :code")
})
public class DonationFilterCode implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="donation_filter_codes_id")
	private int donationFilterCodes;

	@Column(name="donation_filter_codes_label")
	private String donationFilterCodesLabel;

	@Column(name="donation_filter_codes_value")
	private String donationFilterCodesValue;
	
	@Column(name="donation_filter_codes_path")
	private String donationFilterCodesPath;
	
	@Column(name="donation_filter_codes_sql")
	private String donationFilterCodesSql;

	public int getDonationFilterCodes() {
		return donationFilterCodes;
	}

	public void setDonationFilterCodes(int donationFilterCodes) {
		this.donationFilterCodes = donationFilterCodes;
	}

	public String getDonationFilterCodesLabel() {
		return donationFilterCodesLabel;
	}

	public void setDonationFilterCodesLabel(String donationFilterCodesLabel) {
		this.donationFilterCodesLabel = donationFilterCodesLabel;
	}

	public String getDonationFilterCodesValue() {
		return donationFilterCodesValue;
	}

	public void setDonationFilterCodesValue(String donationFilterCodesValue) {
		this.donationFilterCodesValue = donationFilterCodesValue;
	}

	public String getDonationFilterCodesPath() {
		return donationFilterCodesPath;
	}

	public void setDonationFilterCodesPath(String donationFilterCodesPath) {
		this.donationFilterCodesPath = donationFilterCodesPath;
	}

	public String getDonationFilterCodesSql() {
		return donationFilterCodesSql;
	}

	public void setDonationFilterCodesSql(String donationFilterCodesSql) {
		this.donationFilterCodesSql = donationFilterCodesSql;
	}

}
