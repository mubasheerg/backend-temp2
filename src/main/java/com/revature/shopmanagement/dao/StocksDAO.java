package com.revature.shopmanagement.dao;

import java.util.List;

import com.revature.shopmanagement.entity.Products;
import com.revature.shopmanagement.entity.Stocks;

public interface StocksDAO {
	public String addStocks(Stocks stocks);

	public String updateStocks(Stocks stocks);

	public String deleteStocksById(Long stockId);

	public Stocks getStocksById(Long stockId);

	public boolean isStockExists(Long stockId);

	public List<Stocks> getAllStocks();
	
	public List<Stocks> getCountByProdId(List<Long> prodIds); 
	
	public Long updateCount(Long prodId,int quantity);
}
