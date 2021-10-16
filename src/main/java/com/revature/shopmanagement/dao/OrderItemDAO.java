package com.revature.shopmanagement.dao;

import java.util.List;

import com.revature.shopmanagement.entity.OrderItem;

public interface OrderItemDAO {
	public Double getSumByOrderId(Long orderId);

	public List<OrderItem> getOrderedItems(Long orderId);

	public Long saveOrderItem(OrderItem orderItem);
	
	public boolean isOrderItemExists(Long orderItemId);


}
