package com.example.orderservice;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Orders;
import com.example.repositry.OrderRepositry;
import com.exampleorderresponce.OrderResponce;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepositry orderRepositry;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public OrderResponce getByid(int id) {

		Orders orders = orderRepositry.findById(id).get();
		OrderResponce orderResponce = modelMapper.map(orders, OrderResponce.class);
		return orderResponce;

	}

	@Override
	public OrderResponce saveData(Orders orders) {

		Orders order2 = orderRepositry.save(orders);
		OrderResponce orderResponce = modelMapper.map(order2, OrderResponce.class);

		return orderResponce;

	}

}
