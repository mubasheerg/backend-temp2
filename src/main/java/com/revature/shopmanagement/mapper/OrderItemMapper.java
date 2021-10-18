package com.revature.shopmanagement.mapper;

import com.revature.shopmanagement.dto.OrderItemDTO;
import com.revature.shopmanagement.entity.Order;
import com.revature.shopmanagement.entity.OrderItem;
import com.revature.shopmanagement.entity.Products;

public class OrderItemMapper {
	public static OrderItem dtoToEntity(OrderItemDTO orderItemDTO) {
		OrderItem orderItem = new OrderItem();
		orderItem.setId(orderItemDTO.getId());
		orderItem.setPrice(orderItemDTO.getPrice());
		orderItem.setCreatedOn(orderItemDTO.getCreatedOn());
		orderItem.setQuantity(orderItemDTO.getQuantity());
		Order order = new Order();
		order.setOrderId(orderItemDTO.getOrder().getOrderId());
		orderItem.setOrder(order);
		Products product = new Products();
		product.setProdId(orderItemDTO.getProduct().getProdId());
		orderItem.setProduct(product);
		return orderItem;
	}
}
