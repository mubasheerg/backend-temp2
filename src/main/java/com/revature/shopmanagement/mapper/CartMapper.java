package com.revature.shopmanagement.mapper;

import java.util.List;
import com.revature.shopmanagement.dto.CartDTO;
import com.revature.shopmanagement.entity.Cart;
import com.revature.shopmanagement.entity.Customer;
import com.revature.shopmanagement.entity.Products;

public class CartMapper {
	public static Cart dtoToEntity(CartDTO cartDTO) {
		Cart cart = new Cart();
		cart.setCartId(cartDTO.getCartId());
		cart.setCartAddedOn(cartDTO.getCartAddedOn());
		cart.setCartUpdatedOn(cartDTO.getCartUpdatedOn());
		System.out.println(cartDTO.getProduct().getProdId());
		Customer customer = new Customer();
		customer.setCustId(cartDTO.getCustomer().getCustId());
		cart.setCustomer(customer);
		Products product = new Products();
		product.setProdId(cartDTO.getProduct().getProdId());
		cart.setProduct(product);
		
		return cart;
	}
}
