package com.revature.shopmanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "shoporderItem_table")
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "price")
	private Double price;

	@Column(name = "createdOn")
	private Date createdOn;

	@ManyToOne
	@JoinColumn(name = "orderId")
	@JsonIgnore
	private Order order;

	@ManyToOne
	@JoinColumn(name = "prodId")
	private Products product;

	public OrderItem() {

	}

	public OrderItem(Long id, Integer quantity, Double price, Date createdOn, Order order, Products product) {
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
		return "OrderItem [id=" + id + ", quantity=" + quantity + ", price=" + price + ", createdOn=" + createdOn
				+ ", order=" + order + ", product=" + product + "]";
	}

}
