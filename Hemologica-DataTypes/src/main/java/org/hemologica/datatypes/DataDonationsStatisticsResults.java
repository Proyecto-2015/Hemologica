package org.hemologica.datatypes;

public class DataDonationsStatisticsResults {
	
	private DataStatistic donationsCount;
	private DataStatistic donorsCount;
	private int noDataDenominator;
	private int noDataNumerator;
	private int cantDonations;
	private int cantDonors;
	
	public DataStatistic getDonationsCount() {
		return donationsCount;
	}
	public void setDonationsCount(DataStatistic donationsCount) {
		this.donationsCount = donationsCount;
	}
	public DataStatistic getDonorsCount() {
		return donorsCount;
	}
	public void setDonorsCount(DataStatistic donorsCount) {
		this.donorsCount = donorsCount;
	}
	public int getNoDataDenominator() {
		return noDataDenominator;
	}
	public void setNoDataDenominator(int noDataDenominator) {
		this.noDataDenominator = noDataDenominator;
	}
	public int getNoDataNumerator() {
		return noDataNumerator;
	}
	public void setNoDataNumerator(int noDataNumerator) {
		this.noDataNumerator = noDataNumerator;
	}
	public int getCantDonations() {
		return cantDonations;
	}
	public void setCantDonations(int cantDonations) {
		this.cantDonations = cantDonations;
	}
	public int getCantDonors() {
		return cantDonors;
	}
	public void setCantDonors(int cantDonors) {
		this.cantDonors = cantDonors;
	}	
}
