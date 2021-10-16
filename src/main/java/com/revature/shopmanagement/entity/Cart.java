package com.revature.shopmanagement.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "shopcart_table")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cartId;

	@Column
	@Temporal(TemporalType.DATE)
	private Date cartAddedOn;

	@Column
	@Temporal(TemporalType.DATE)
	private Date cartUpdatedOn;

	@OneToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Products product;

	public Cart() {

	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public Date getCartAddedOn() {
		return cartAddedOn;
	}

	public void setCartAddedOn(Date cartAddedOn) {
		this.cartAddedOn = cartAddedOn;
	}

	public Date getCartUpdatedOn() {
		return cartUpdatedOn;
	}

	public void setCartUpdatedOn(Date cartUpdatedOn) {
		this.cartUpdatedOn = cartUpdatedOn;
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

	public Cart(long cartId, Date cartAddedOn, Date cartUpdatedOn, Customer customer, Products product) {
		super();
		this.cartId = cartId;
		this.cartAddedOn = cartAddedOn;
		this.cartUpdatedOn = cartUpdatedOn;
		this.customer = customer;
		this.product = product;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cartAddedOn=" + cartAddedOn + ", cartUpdatedOn=" + cartUpdatedOn
				+ ", customer=" + customer + ", product=" + product + "]";
	}

}
