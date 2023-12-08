package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Orders;
import com.example.orderservice.OrderService;
import com.exampleorderresponce.OrderResponce;

@RestController
@RequestMapping("/OrderApp")
public class OrdersControllers {

	@Autowired
	private OrderService orderService;

	@GetMapping("/getbyid{id}")
	public ResponseEntity<OrderResponce> getDataById(@PathVariable int id) {

		OrderResponce orderResponce = orderService.getByid(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(orderResponce);

	}

	@PostMapping("/saveall")
	public ResponseEntity<OrderResponce> saveData(@RequestBody Orders orders) {

		OrderResponce orderResponce = orderService.saveData(orders);
		return ResponseEntity.status(HttpStatus.OK).body(orderResponce);

	}

}
