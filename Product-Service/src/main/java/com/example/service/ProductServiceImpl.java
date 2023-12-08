package com.example.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.fegianclient.ProductClient;
import com.example.repositry.ProductRepositry;
import com.example.reseponce.OrdersResponse;
import com.example.reseponce.ProductReseponce;

@Service
public class ProductServiceImpl implements ProdectService {

	@Autowired
	private ProductRepositry productRepositry;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private ProductClient productClient;
	
	@Autowired 
	ProductReseponce productReseponce ;
	

	@Override
	public ProductReseponce getDataById(int id) {

		Product product = productRepositry.findById(id).get();

		ProductReseponce proResponseEntity = modelMapper.map(product, ProductReseponce.class);

	     ResponseEntity<OrdersResponse> prEntity = productClient.getDataById(id);

	     proResponseEntity.setOrderEntity(prEntity);
	     
		return proResponseEntity;

	}

	@Override
	public ProductReseponce productSave(Product product) {

		Product product2 = productRepositry.save(product);

		 productReseponce = modelMapper.map(product2, ProductReseponce.class);
		
		return productReseponce;
	}

}
