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

import com.example.entity.Product;
import com.example.reseponce.ProductReseponce;
import com.example.service.ProdectService;

@RestController
@RequestMapping("/ProductApp")
public class ProductController {

	@Autowired
	private ProdectService prodectService;

	@GetMapping("/getbyid{id}")
	public ResponseEntity<ProductReseponce> getDataById(@PathVariable int id) {

		ProductReseponce proResponseEntity = prodectService.getDataById(id);

		return ResponseEntity.status(HttpStatus.OK).body(proResponseEntity);

	}

	@PostMapping("/SaveData")
	public ResponseEntity<ProductReseponce> saveData(@RequestBody Product product) {

		ProductReseponce productReseponce = prodectService.productSave(product);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(productReseponce);

	}

}
