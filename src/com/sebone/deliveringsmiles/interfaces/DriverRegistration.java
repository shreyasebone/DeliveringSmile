package com.sebone.deliveringsmiles.interfaces;
import com.sebone.deliveringsmiles.dataclasses.DriverData;
/**
 * Interface Name DriverRegistration
 * Objective -Driver can register in our application where he/she will be able to see the registration page in which he would provide us all the information,
 * @author Ayush Tamrakar
 *
 */
public interface DriverRegistration {
	public DriverData submitDriverData(DriverData driverData);
	public DriverData getDriverDetails(int driverId);
	public DriverData updateDriverData(DriverData driverData);
}
