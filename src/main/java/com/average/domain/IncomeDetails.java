/**
 * 
 */
package com.average.domain;



/**
 * @author Pulkit Bajpai
 *
 */
public class IncomeDetails {
	public String country;
	public String city;
	public String gender;
	public Currency currency;
	public long averageIncome;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public long getAverageIncome() {
		return averageIncome;
	}
	public void setAverageIncome(long averageIncome) {
		this.averageIncome = averageIncome;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IncomeDetails [country=")
		.append(country)
		.append(", city=")
		.append(city)
		.append(", gender=")
		.append(gender)
		.append(", currency=")
		.append(currency)
		.append(", averageIncome=")
		.append(averageIncome)
		.append("]");
		return builder.toString();
	}
	
	public IncomeDetails(String country, String city, String gender, Currency currency, long averageIncome) {
		super();
		this.country = country;
		this.city = city;
		this.gender = gender;
		this.currency = currency;
		this.averageIncome = averageIncome;
	}
	public IncomeDetails() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
