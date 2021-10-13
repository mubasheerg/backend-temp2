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

import com.revature.shopmanagement.dto.OrderDTO;
import com.revature.shopmanagement.entity.Customer;
import com.revature.shopmanagement.entity.Order;
import com.revature.shopmanagement.service.OrderService;

@CrossOrigin("*")

@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	OrderService orderService;

	@GetMapping("/getOrderById/{orderId}")
	public ResponseEntity<Order> getCustomerById(@PathVariable("orderId") Long orderId) {
		return new ResponseEntity<>(orderService.getOrderById(orderId), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<String> addOrder(@RequestBody OrderDTO order) {
		return new ResponseEntity<>(orderService.addOrder(order),HttpStatus.OK);
	}

	@PutMapping("/updateOrder")
	public ResponseEntity<String> updateOrder(@RequestBody OrderDTO order) {
		return new ResponseEntity<>(orderService.updateOrder(order),HttpStatus.OK);
	}

	@DeleteMapping("/deleteOrder/{orderId}")
	public ResponseEntity<String> deleteOrder(@PathVariable("orderId") Long orderId) {
		return new ResponseEntity<>(orderService.deleteOrderById(orderId),HttpStatus.OK);
	}

	@GetMapping("/getAllOrders")
	public ResponseEntity<List<Order>> getAllcustomers() {
		return new ResponseEntity<>(orderService.getAllOrders(), HttpStatus.OK);
	}
}
