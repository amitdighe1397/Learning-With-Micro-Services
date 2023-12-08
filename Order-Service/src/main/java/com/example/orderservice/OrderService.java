package com.example.orderservice;

import com.example.entity.Orders;
import com.exampleorderresponce.OrderResponce;

public interface OrderService {

	public OrderResponce getByid(int id);

	public OrderResponce saveData(Orders orders);

}
