package com.sebone.deliveringsmiles.interfaces;
import java.util.List;
import com.sebone.deliveringsmiles.dataclasses.OrderData;
/**
 * Interface Name DriverRegistration
 * Objective -In this interface we declared all the methods related to Order,
 *  this interface will contain four methods which are described below. 
 *  With the help of the following methods we can send notifications to the user,
 *   we can assign orders to Driver and so on.
 * @author Ayush Tamrakar
 *
 */
public interface Order {
	public OrderData assignOrder(OrderData orderData);
	public OrderData getOrderDetails(int orderId);
	public List<OrderData> sendOrderNotification(int driverId, String deliveryStatus);
}
