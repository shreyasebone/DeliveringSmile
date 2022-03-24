package com.sebone.deliveringsmiles.dataclasses;
/**
 * Class Name - PayoutStatus
 * Objective - This class will show the status of payout, 
 * payout for the driver is given or not , if not then reason
 * @author Ayush Tamrakar
 *
 */
public class PayoutStatus {
	private int payoutId;
	private boolean payoutStatus;
	private String payoutStatusDescription;
	
	public int getPayoutId() {
		return payoutId;
	}
	public void setPayoutId(int payoutId) {
		this.payoutId = payoutId;
	}
	public boolean isPayoutStatus() {
		return payoutStatus;
	}
	public void setPayoutStatus(boolean payoutStatus) {
		this.payoutStatus = payoutStatus;
	}
	public String getPayoutStatusDescription() {
		return payoutStatusDescription;
	}
	public void setPayoutStatusDescription(String payoutStatusDescription) {
		this.payoutStatusDescription = payoutStatusDescription;
	}
	
	

}
