package com.sebone.deliveringsmiles.dataclasses;
import java.time.*;
/**
 * Class Name - OrderData
 * Objective - This class will contain all the information about the order
 * @author Ayush Tamrakar
 *
 */
public class OrderData {
	
	private int orderId;
	private int companyId;
	private LocalDateTime orderDateTime;
	private String orderSource;
	private String orderDestination;
	private String paymentMode;
	private float payoutEstimation;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public LocalDateTime getOrderDateTime() {
		return orderDateTime;
	}
	public void setOrderDateTime(LocalDateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
	public String getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}
	public String getOrderDestination() {
		return orderDestination;
	}
	public void setOrderDestination(String orderDestination) {
		this.orderDestination = orderDestination;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public float getPayoutEstimation() {
		return payoutEstimation;
	}
	public void setPayoutEstimation(float payoutEstimation) {
		this.payoutEstimation = payoutEstimation;
	}
}
