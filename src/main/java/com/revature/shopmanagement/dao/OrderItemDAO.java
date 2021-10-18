package com.revature.shopmanagement.dao;

import java.util.List;

import com.revature.shopmanagement.entity.Order;
import com.revature.shopmanagement.entity.OrderItem;

public interface OrderItemDAO {
	public Double getSumByOrderId(Long orderId);

	public List<OrderItem> getOrderedItems(Long orderId);

	public Long addItems(OrderItem orderItem);

	public boolean isOrderItemExists(Long orderItemId);

	public OrderItem checkOrder(Long orderId, Long prodId);

	public Long updateItems(Long id,OrderItem orderItem);
	
}
