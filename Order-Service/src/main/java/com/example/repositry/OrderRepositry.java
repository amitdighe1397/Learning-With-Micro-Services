package com.example.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Orders;

@Repository
public interface OrderRepositry extends JpaRepository<Orders, Integer> {
	
}
