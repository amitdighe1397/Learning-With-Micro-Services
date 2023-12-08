package com.example.fegianclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.entity.Product;
import com.example.reseponce.OrdersResponse;
import com.example.reseponce.ProductReseponce;

@FeignClient(name = "abc", url="http://localhost:8081")
public interface ProductClient {
	
	@GetMapping("/OrderApp/getbyid{id}")
	public ResponseEntity<OrdersResponse> getDataById(@PathVariable int id);
	
	@PostMapping("/saveall")
	public ResponseEntity<OrdersResponse> saveData(ProductReseponce productReseponce);


}
