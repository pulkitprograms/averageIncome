/**
 * 
 */
package com.average.domain;

/**
 * @author Pulkit Bajpai
 *
 */
public enum Currency {
	USD(1), INR(66), GBP(0.67f), SGP(1.5f), HKD(8);
	
	 private float conversionRate;

	public float getConversionRate() {
		return (float) conversionRate;
	}

	private Currency(float conversionRate) {
		this.conversionRate = conversionRate;
	}

	
	
}
