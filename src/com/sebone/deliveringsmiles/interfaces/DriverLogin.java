package com.sebone.deliveringsmiles.interfaces;
import java.util.List;

import com.sebone.deliveringsmiles.dataclasses.LoginDetails;
import com.sebone.deliveringsmiles.dataclasses.LoginStatus;
/**
 * Interface Name DriverLogin
 * Objective - Registered Driver can login into our application where he/she will be able to see the login page in which he would provide us email and password 
 * @author Ayush Tamrakar
 *
 */

public interface DriverLogin {
	public LoginStatus userAuthentication(String driverEmail , String driverPassword);
	public List<LoginDetails> getLoginDetails(int driverId);
}
