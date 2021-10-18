package com.revature.shopmanagement.dto;

import java.util.Date;

import com.revature.shopmanagement.entity.Order;
import com.revature.shopmanagement.entity.Products;

public class OrderItemDTO {
	private Long id;
	private Integer quantity;
	private Double price;
	private Date createdOn;
	private Order order;
	private Products product;

	public OrderItemDTO() {
	}

	public OrderItemDTO(Long id, Integer quantity, Double price, Date createdOn, Order order, Products product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		this.createdOn = createdOn;
		this.order = order;
		this.product = product;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderItemDTO [id=" + id + ", quantity=" + quantity + ", price=" + price + ", createdOn=" + createdOn
				+ ", order=" + order + ", product=" + product + "]";
	}

}
