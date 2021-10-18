package com.revature.shopmanagement.service;

import java.util.List;

import com.revature.shopmanagement.dto.OrderItemDTO;
import com.revature.shopmanagement.entity.OrderItem;

public interface OrderItemService {
	public Long addItems(OrderItemDTO orderItemDTO);

	public List<OrderItem> getOrderedItems(Long orderId);

}
