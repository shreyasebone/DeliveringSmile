package com.sebone.deliveringsmiles.dataclasses;
/**
 * Class Name - DriverAddress
 * Objective - This class will hold the address of the driver.
 * @author shreya paliwal
 *
 */
public class DriverAddress {
	
		private String street;
		private String city;
		private String state;
		private String pincode;
		private String country;
		

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPincode() {
	return pincode;
		}
		public void setPincode(String pincode) {
	this.pincode = pincode;
		}
		public String getCountry() {
	return country;
		}
		public void setCountry(String country) {
	this.country = country;
		}

}
