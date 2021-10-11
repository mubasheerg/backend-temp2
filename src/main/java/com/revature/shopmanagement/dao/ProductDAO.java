package com.revature.shopmanagement.dao;

import java.util.List;

import com.revature.shopmanagement.entity.Products;

public interface ProductDAO {
	public String addProduct(Products product);

	public String updateProduct(Products product);

	public String deleteProductById(Long prodId);

	public Products getProductById(Long prodId);

	public List<Products> getProductByName(String prodName);

	public Products getProductByCategory(String category);

	public boolean isProductExists(Long prodId);

	public List<Products> getAllProducts();
}
