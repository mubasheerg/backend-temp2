package com.revature.shopmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.shopmanagement.dto.CartDTO;
import com.revature.shopmanagement.entity.Cart;
import com.revature.shopmanagement.entity.Customer;
import com.revature.shopmanagement.service.CartService;

@CrossOrigin("*")

@RestController
@RequestMapping("cart")
public class CartController {

	@Autowired
	CartService cartService;

	@GetMapping("/getCartById/{custId}")
	public ResponseEntity<List<Cart>> getCartById(@PathVariable("custId") Long custId) {
		return new ResponseEntity<>(cartService.getCartById(custId), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<String> addCart(@RequestBody CartDTO cart) {
		System.out.println(cart);
		return new ResponseEntity<>(cartService.addCart(cart),HttpStatus.OK);
	}

	@PutMapping("/updateCart")
	public ResponseEntity<String> updateCart(@RequestBody CartDTO cart) {
		return new ResponseEntity<>(cartService.updateCart(cart),HttpStatus.OK);
	}

	@DeleteMapping("/deleteCart/{cartId}")
	public ResponseEntity<String> deleteCartById(@PathVariable("cartId") Long cartId) {
		return new ResponseEntity<>(cartService.deleteCartById(cartId),HttpStatus.OK);
	}

	@GetMapping("/getAllCarts")
	public ResponseEntity<List<Cart>> getAllCartDetails() {
		return new ResponseEntity<>(cartService.getAllCartDetails(), HttpStatus.OK);
	}

}
