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

import com.revature.shopmanagement.dto.StocksDTO;
import com.revature.shopmanagement.entity.Customer;
import com.revature.shopmanagement.entity.Products;
import com.revature.shopmanagement.entity.Stocks;
import com.revature.shopmanagement.service.StocksService;

@CrossOrigin("*")
@RestController
@RequestMapping("stocks")
public class StocksController {

	Stocks stocks = new Stocks();

	@Autowired
	StocksService stocksService;

	@GetMapping("/getStocksById/{stockId}")
	public ResponseEntity<Stocks> getStocksById(@PathVariable("stockId") Long stockId) {
		return new ResponseEntity<>(stocksService.getStocksById(stockId), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<String> addStocks(@RequestBody StocksDTO stocks) {
		return new ResponseEntity<>(stocksService.addStocks(stocks), HttpStatus.OK);
	}

	@PostMapping("/count")
	public ResponseEntity<List<Stocks>> getCountByProdId(@RequestBody List<Long> prodIds) {
		return new ResponseEntity<>(stocksService.getCountByProdId(prodIds), HttpStatus.OK);
	}

	@PutMapping("/updateStocks")
	public ResponseEntity<String> updateStocks(@RequestBody StocksDTO stocks) {
		return new ResponseEntity<>(stocksService.updateStocks(stocks), HttpStatus.OK);
	}

	@DeleteMapping("/deleteStocks/{stockId}")
	public ResponseEntity<String> deleteStocksById(@PathVariable("stockId") Long stockId) {
		return new ResponseEntity<>(stocksService.deleteStocksById(stockId), HttpStatus.OK);
	}
	
	@GetMapping("/count/{prodId}")
	public ResponseEntity<Stocks> getCountByProdId(@PathVariable("prodId") Long prodId){
		return new ResponseEntity<>(stocksService.getCountByProdId(prodId),HttpStatus.OK);
	}
}
