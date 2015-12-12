package org.hemologica.datatypes;

public class DataStatistic {
	
	private int countDenominator;
	private int countNumerator;
	private double percentage;
	
	
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public int getCountDenominator() {
		return countDenominator;
	}
	public void setCountDenominator(int countDenominator) {
		this.countDenominator = countDenominator;
	}
	public int getCountNumerator() {
		return countNumerator;
	}
	public void setCountNumerator(int countNumerator) {
		this.countNumerator = countNumerator;
	}
	
}
