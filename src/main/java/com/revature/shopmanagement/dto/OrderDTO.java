package com.revature.shopmanagement.dto;

import java.util.Date;

import com.revature.shopmanagement.entity.Customer;
import com.revature.shopmanagement.entity.Products;

public class OrderDTO {
	private long orderId;
	private double amount;
	private Date orderAddedOn;
	private Customer customer;
	private Products product;

	public OrderDTO() {
	}

	public OrderDTO(long orderId, double amount, Date orderAddedOn, Customer customer, Products product) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.orderAddedOn = orderAddedOn;
		this.customer = customer;
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getOrderAddedOn() {
		return orderAddedOn;
	}

	public void setOrderAddedOn(Date orderAddedOn) {
		this.orderAddedOn = orderAddedOn;
	}

	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", amount=" + amount + ", orderAddedOn=" + orderAddedOn + ", customer="
				+ customer + ", product=" + product + "]";
	}

}
