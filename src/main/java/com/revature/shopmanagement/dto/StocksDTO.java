package com.revature.shopmanagement.dto;

import java.util.Date;

public class StocksDTO {
	private long stockId;
	private long count;
	private Date stockAddedOn;
	private Date stockUpdatedOn;
	private ProductDTO product;

	public StocksDTO() {
	}

	public StocksDTO(long stockId, long count, Date stockAddedOn, Date stockUpdatedOn, ProductDTO product) {
		super();
		this.stockId = stockId;
		this.count = count;
		this.stockAddedOn = stockAddedOn;
		this.stockUpdatedOn = stockUpdatedOn;
		this.product = product;
	}

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}

	public long getStockId() {
		return stockId;
	}

	public void setStockId(long stockId) {
		this.stockId = stockId;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public Date getStockAddedOn() {
		return stockAddedOn;
	}

	public void setStockAddedOn(Date stockAddedOn) {
		this.stockAddedOn = stockAddedOn;
	}

	public Date getStockUpdatedOn() {
		return stockUpdatedOn;
	}

	public void setStockUpdatedOn(Date stockUpdatedOn) {
		this.stockUpdatedOn = stockUpdatedOn;
	}

	@Override
	public String toString() {
		return "StocksDTO [stockId=" + stockId + ", count=" + count + ", stockAddedOn=" + stockAddedOn
				+ ", stockUpdatedOn=" + stockUpdatedOn + ", product=" + product + "]";
	}

}
