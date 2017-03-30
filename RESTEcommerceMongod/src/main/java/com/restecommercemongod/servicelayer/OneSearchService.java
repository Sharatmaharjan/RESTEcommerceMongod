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
	
	public List<Product> findByX(String name){
		List<Product> prod=productRepo.findByName(name);
		List<Product> prod1=productRepo.findByCategory(name);
		prod.addAll(prod1);
		List<Product> prod2=productRepo.findByCondition(name);
		prod.addAll(prod2);
		return prod;
	}
	
//	public List<Product> findByCategory(String category){
//		return productRepo.findByCategory(category);
//	}
//	
//	public List<Product> findByCondition(String condition){
//		return productRepo.findByCondition(condition);
//	}
	
}
