package org.hemologica.datatypes;

public class DataTransfusionsStatisticsResults {
	
	private DataStatistic transfusionsCount;
	private DataStatistic personTransfusionsCount;
	private DataStatistic adversEventsCount;
	
	private int noDataDenominator;
	private int noDataNumerator;

	public DataStatistic getTransfusionsCount() {
		return transfusionsCount;
	}

	public void setTransfusionsCount(DataStatistic transfusionsCount) {
		this.transfusionsCount = transfusionsCount;
	}

	public DataStatistic getAdversEventsCount() {
		return adversEventsCount;
	}

	public void setAdversEventsCount(DataStatistic adversEventsCount) {
		this.adversEventsCount = adversEventsCount;
	}

	public DataStatistic getPersonTransfusionsCount() {
		return personTransfusionsCount;
	}

	public void setPersonTransfusionsCount(DataStatistic personTransfusionsCount) {
		this.personTransfusionsCount = personTransfusionsCount;
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
	
}
