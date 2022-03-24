package com.sebone.deliveringsmiles.interfaceimpl;

import java.time.LocalDate;
import java.util.List;

import com.sebone.deliveringsmiles.dataclasses.OrderStatus;
import com.sebone.deliveringsmiles.dataclasses.PayoutData;
import com.sebone.deliveringsmiles.interfaces.Payout;
/**
 * ClassName - PayoutImpl 
 * Objective - This class is the implementation of Payout interface , in this class we will define all the method of Payout  interface
 * @author Ayush Tamrakar
 *
 */
public class PayoutImpl implements Payout {

	@Override
	public PayoutData payoutByOrder(int orderId, int driverId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PayoutData> payoutOfTheDays(OrderStatus orderStaus, int driverId, LocalDate startDate,
			LocalDate endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PayoutData> totalPayout(int driverId) {
		// TODO Auto-generated method stub
		return null;
	}

}
