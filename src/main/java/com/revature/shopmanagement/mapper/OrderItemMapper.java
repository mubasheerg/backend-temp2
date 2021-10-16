package com.revature.shopmanagement.mapper;

import com.revature.shopmanagement.dto.OrderItemDTO;
import com.revature.shopmanagement.entity.OrderItem;

public class OrderItemMapper {
	public static OrderItem dtoToEntity(OrderItemDTO orderItemDTO) {
		OrderItem orderItem = new OrderItem();
		orderItem.setId(orderItemDTO.getId());
		orderItem.setPrice(orderItemDTO.getPrice());
		orderItem.setQuantity(orderItemDTO.getQuantity());
		orderItem.setProduct(orderItemDTO.getProduct());
		orderItem.setOrder(orderItemDTO.getOrder());

		return orderItem;
	}
}
