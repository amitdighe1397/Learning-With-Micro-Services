package com.example.service;

import com.example.entity.Product;
import com.example.reseponce.ProductReseponce;

public interface ProdectService {
	
	public ProductReseponce getDataById(int id); 
	
	public ProductReseponce productSave(Product product);

}
