package com.sebone.deliveringsmiles.dataclasses;
import java.time.*;
/**
 * Class Name - LoginDetails
 * Objective - This class will contain all login information about the driver login and logout
 * @author Ayush Tamrakar
 *
 */
public class LoginDetails {
	private int loginId;
	private LocalTime loginTime;
	private LocalTime logoutTime;
	private String loginPassword;
	private String loginUsername;
	
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public LocalTime getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(LocalTime loginTime) {
		this.loginTime = loginTime;
	}
	public LocalTime getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(LocalTime logoutTime) {
		this.logoutTime = logoutTime;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getLoginUsername() {
		return loginUsername;
	}
	public void setLoginUsername(String loginUsername) {
		this.loginUsername = loginUsername;
	}
	
	

}
