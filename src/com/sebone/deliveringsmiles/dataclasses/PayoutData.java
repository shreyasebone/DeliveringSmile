package com.sebone.deliveringsmiles.dataclasses;
import java.time.*;
/**
 * Class Name - PayoutData
 * Objective - This class will contain the all the information about the driver payout
 * @author Ayush Tamrakar
 *
 */
public class PayoutData {
	private int payoutId;
	//import order id 
	private float payoutAmount;
	private LocalDateTime orderDeliveryTime;
	private float firstMileDistance;
	private float lastMileDistance;
	private float incentives;
	
	public int getPayoutId() {
		return payoutId;
	}
	public void setPayoutId(int payoutId) {
		this.payoutId = payoutId;
	}
	public float getPayoutAmount() {
		return payoutAmount;
	}
	public void setPayoutAmount(float payoutAmount) {
		this.payoutAmount = payoutAmount;
	}
	public LocalDateTime getOrderDeliveryTime() {
		return orderDeliveryTime;
	}
	public void setOrderDeliveryTime(LocalDateTime orderDeliveryTime) {
		this.orderDeliveryTime = orderDeliveryTime;
	}
	public float getFirstMileDistance() {
		return firstMileDistance;
	}
	public void setFirstMileDistance(float firstMileDistance) {
		this.firstMileDistance = firstMileDistance;
	}
	public float getLastMileDistance() {
		return lastMileDistance;
	}
	public void setLastMileDistance(float lastMileDistance) {
		this.lastMileDistance = lastMileDistance;
	}
	public float getIncentives() {
		return incentives;
	}
	public void setIncentives(float incentives) {
		this.incentives = incentives;
	}

	
}
