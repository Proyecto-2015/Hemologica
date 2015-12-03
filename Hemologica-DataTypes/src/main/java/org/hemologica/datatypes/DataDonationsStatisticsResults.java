package org.hemologica.datatypes;

public class DataDonationsStatisticsResults {
	
	private DataStatistic donationsCount;
	private DataStatistic donorsCount;
	
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
	
}
