package com.example.reseponce;

import org.springframework.http.ResponseEntity;

import com.example.entity.Product;

public class ProductReseponce {
	private int id;
	private String name;
	private String description;
	private double price;
	private ResponseEntity<OrdersResponse> orderEntity;

	public ResponseEntity<OrdersResponse> getOrderEntity() {
		return orderEntity;
	}

	public void setOrderEntity(ResponseEntity<OrdersResponse> orderEntity) {
		this.orderEntity = orderEntity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setOrderEntity(Product product) {
		// TODO Auto-generated method stub
		
	}

	


}
