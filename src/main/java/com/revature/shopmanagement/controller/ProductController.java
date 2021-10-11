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

import com.revature.shopmanagement.dto.ProductDTO;
import com.revature.shopmanagement.entity.Customer;
import com.revature.shopmanagement.entity.Products;
import com.revature.shopmanagement.service.ProductService;

@CrossOrigin("*")

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/getProduct/Id/{prodId}")
	public ResponseEntity<Products> getProductById(@PathVariable("prodId") Long prodId) {
		return new ResponseEntity<>(productService.getProductById(prodId), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<String> addProduct(@RequestBody ProductDTO product) {	
		return new ResponseEntity<>(productService.addProduct(product),HttpStatus.OK);
	}

	@PutMapping("/updateProduct")
	public ResponseEntity<String> updateProduct(@RequestBody ProductDTO product) {
		return new ResponseEntity<>(productService.updateProduct(product),HttpStatus.OK);
	}

	@DeleteMapping("/deleteProduct/{prodId}")
	public ResponseEntity<String> deleteProduct(@PathVariable("prodId") Long prodId) {
		return new ResponseEntity<>(productService.deleteProductById(prodId),HttpStatus.OK);
	}

	@GetMapping("/getProduct/Name/{prodName}")
	public ResponseEntity<List<Products>> getProductByName(@PathVariable String prodName) {
		return new ResponseEntity<>(productService.getProductByName(prodName), HttpStatus.OK);
	}

	@GetMapping("/getProduct/{category}")
	public ResponseEntity<Products> getProductByCategory(@PathVariable String category) {
		return new ResponseEntity<>(productService.getProductByCategory(category), HttpStatus.OK);
	}

	@GetMapping("/getAllProducts")
	public ResponseEntity<List<Products>> getAllProducts() {
		return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
	}

}
