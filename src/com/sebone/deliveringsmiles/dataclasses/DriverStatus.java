package com.sebone.deliveringsmiles.dataclasses;
/**
 * Class Name - DriverStatus
 * Objective - This class will show the status of driver, 
 * he/she is able to work or not if not then why
 * @author Ayush Tamrakar
 *
 */
public class DriverStatus {
	private int driverStatusid;
	//import driver id 
	private boolean driverStatus;
	private String driverStatusDescription;
	public int getDriverStatusid() {
		return driverStatusid;
	}
	public void setDriverStatusid(int driverStatusid) {
		this.driverStatusid = driverStatusid;
	}
	public boolean isDriverStatus() {
		return driverStatus;
	}
	public void setDriverStatus(boolean driverStatus) {
		this.driverStatus = driverStatus;
	}
	public String getDriverStatusDescription() {
		return driverStatusDescription;
	}
	public void setDriverStatusDescription(String driverStatusDescription) {
		this.driverStatusDescription = driverStatusDescription;
	}
	

}
