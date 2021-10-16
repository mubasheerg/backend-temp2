package com.revature.shopmanagement.controller;

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

import com.revature.shopmanagement.dto.OrderItemDTO;
import com.revature.shopmanagement.entity.OrderItem;
import com.revature.shopmanagement.service.OrderItemService;

@CrossOrigin("*")
@RestController
@RequestMapping("orderItem")
public class OrderItemController {

	OrderItem orderItem = new OrderItem();

	@Autowired
	OrderItemService orderItemService;

	@PostMapping
	public ResponseEntity<OrderItem> addItems(@RequestBody OrderItemDTO orderItemDTO) {
			return new ResponseEntity<>(orderItemService.addItems(orderItemDTO)), HttpStatus.OK);
	}

	@GetMapping("/{orderId}")
	public ResponseEntity<OrderItem> getOrderedItems(@PathVariable("orderId") Long orderId) {
		return new ResponseEntity<>(orderItemService.getOrderedItems(orderId)),HttpStatus.OK);
	}

}
