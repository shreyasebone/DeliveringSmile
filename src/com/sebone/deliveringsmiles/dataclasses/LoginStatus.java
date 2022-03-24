package com.sebone.deliveringsmiles.dataclasses;
/**
 * Class Name - LoginStatus
 * Objective - This class will show the login status of driver, 
 * he/she is online and available to do the delivery if not then why? 
 * @author Ayush Tamrakar
 *
 */
public class LoginStatus {

	private int loginStatusId;
	private boolean loginStatus;
	private String loginStatusDescription;
	
	public int getLoginStatusId() {
		return loginStatusId;
	}
	public void setLoginStatusId(int loginStatusId) {
		this.loginStatusId = loginStatusId;
	}
	public boolean isLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}
	public String getLoginStatusDescription() {
		return loginStatusDescription;
	}
	public void setLoginStatusDescription(String loginStatusDescription) {
		this.loginStatusDescription = loginStatusDescription;
	}
	
	
}
