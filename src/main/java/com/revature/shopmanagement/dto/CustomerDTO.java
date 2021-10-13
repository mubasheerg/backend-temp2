package com.revature.shopmanagement.dto;

import java.util.Date;
import java.util.List;

import com.revature.shopmanagement.entity.Cart;
import com.revature.shopmanagement.entity.Order;

public class CustomerDTO {

	private long custId;
	private String custName;
	private String custMail;
	private String custPwd;
	private String custAddress;
	private String custPhone;
	private Date custCreatedOn;
	private Date custUpdatedOn;
	private List<Order> order;
	private Cart cart;

	public CustomerDTO() {

	}

	public CustomerDTO(long custId, String custName, String custMail, String custPwd, String custAddress,
			String custPhone, Date custCreatedOn, Date custUpdatedOn, List<Order> order, Cart cart) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custMail = custMail;
		this.custPwd = custPwd;
		this.custAddress = custAddress;
		this.custPhone = custPhone;
		this.custCreatedOn = custCreatedOn;
		this.custUpdatedOn = custUpdatedOn;
		this.order = order;
		this.cart = cart;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustMail() {
		return custMail;
	}

	public void setCustMail(String custMail) {
		this.custMail = custMail;
	}

	public String getCustPwd() {
		return custPwd;
	}

	public void setCustPwd(String custPwd) {
		this.custPwd = custPwd;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public Date getCustCreatedOn() {
		return custCreatedOn;
	}

	public void setCustCreatedOn(Date custCreatedOn) {
		this.custCreatedOn = custCreatedOn;
	}

	public Date getCustUpdatedOn() {
		return custUpdatedOn;
	}

	public void setCustUpdatedOn(Date custUpdatedOn) {
		this.custUpdatedOn = custUpdatedOn;
	}

	@Override
	public String toString() {
		return "CustomerDTO [custId=" + custId + ", custName=" + custName + ", custMail=" + custMail + ", custPwd="
				+ custPwd + ", custAddress=" + custAddress + ", custPhone=" + custPhone + ", custCreatedOn="
				+ custCreatedOn + ", custUpdatedOn=" + custUpdatedOn + ", order=" + order + ", cart=" + cart + "]";
	}

}
