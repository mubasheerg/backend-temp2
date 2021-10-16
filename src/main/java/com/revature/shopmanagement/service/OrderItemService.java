package com.revature.shopmanagement.service;

import java.util.List;

import com.revature.shopmanagement.dto.OrderItemDTO;

public interface OrderItemService {
	public String addItems(OrderItemDTO orderItemDTO);

	public List<OrderItemDTO> getOrderedItems(Long orderId);
}
