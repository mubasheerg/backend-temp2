package com.revature.shopmanagement.mapper;

import com.revature.shopmanagement.dto.ProductDTO;
import com.revature.shopmanagement.entity.Products;

public class ProductMapper {
	public static Products dtoToEntity(ProductDTO productDTO) {
		Products product = new Products();
		product.setProdId(productDTO.getProdId());
		product.setProdName(productDTO.getProdName());
		product.setProdPrice(productDTO.getProdPrice());
		product.setCategory(productDTO.getCategory());
		product.setProdAddedOn(productDTO.getProdAddedOn());
		product.setProdUpdatedOn(productDTO.getProdUpdatedOn());
		
		return product;
	}
}
