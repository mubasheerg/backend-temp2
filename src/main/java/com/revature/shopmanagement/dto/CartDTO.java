package com.revature.shopmanagement.dto;

import java.util.Date;

import com.revature.shopmanagement.entity.Customer;

public class CartDTO {
	private long cartId;
	private Date cartAddedOn;
	private Date cartUpdatedOn;
	private Customer customer;

	public CartDTO() {
	}

	public CartDTO(long cartId, Date cartAddedOn, Date cartUpdatedOn, Customer customer) {
		super();
		this.cartId = cartId;
		this.cartAddedOn = cartAddedOn;
		this.cartUpdatedOn = cartUpdatedOn;
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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

	@Override
	public String toString() {
		return "CartDTO [cartId=" + cartId + ", cartAddedOn=" + cartAddedOn + ", cartUpdatedOn=" + cartUpdatedOn
				+ ", customer=" + customer + "]";
	}

}
