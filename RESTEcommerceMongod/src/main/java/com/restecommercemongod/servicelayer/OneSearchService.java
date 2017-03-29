package com.restecommercemongod.servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restecommercemongod.model.Product;
import com.restecommercemongod.repo.ProductRepo;

@Service
public class OneSearchService {

	@Autowired
	private ProductRepo productRepo;
	
	public List<Product> findByName(String name){
		return productRepo.findByName(name);
	}
	
	public List<Product> findByCategory(String category){
		return productRepo.findByCategory(category);
	}
	
	public List<Product> findByCondition(String condition){
		return productRepo.findByCondition(condition);
	}
	
}
