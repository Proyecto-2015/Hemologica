package org.hemologica.datatypes;

public class DataTransfusionsStatisticsResults {
	
	private DataStatistic transfusionsCount;
	private DataStatistic personTransfusionsCount;
	private DataStatistic adversEventsCount;

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
	
}
