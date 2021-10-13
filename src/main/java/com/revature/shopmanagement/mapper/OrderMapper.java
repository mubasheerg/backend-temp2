package com.revature.shopmanagement.mapper;

import java.util.List;

import com.revature.shopmanagement.dto.OrderDTO;
import com.revature.shopmanagement.entity.Customer;
import com.revature.shopmanagement.entity.Order;
import com.revature.shopmanagement.entity.Products;

public class OrderMapper {
	public static Order dtoToEntity(OrderDTO orderDTO) {
		Order order = new Order();
		order.setOrderId(orderDTO.getOrderId());
		order.setAmount(orderDTO.getAmount());
		order.setOrderedOn(orderDTO.getOrderAddedOn());
		Products product = new Products();
		product.setProdId(orderDTO.getProduct().getProdId());
		order.setProduct((List<Products>) product);
		Customer customer = new Customer();
		customer.setCustId(orderDTO.getCustomer().getCustId());
		order.setCustomer(customer);
		return order;
	}
}
