package com.sebone.deliveringsmiles.dataclasses;
/**
 * Class Name - OrderStatus
 * Objective - This class will show the status of order, 
 * order is delivered or not delivered then from what reason the order is not delivered
 * @author Ayush Tamrakar
 *
 */
public class OrderStatus {
	//import order id 
	private boolean orderStatus;
	public boolean isOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatusDescription() {
		return orderStatusDescription;
	}
	public void setOrderStatusDescription(String orderStatusDescription) {
		this.orderStatusDescription = orderStatusDescription;
	}
	private String orderStatusDescription;
	
}
