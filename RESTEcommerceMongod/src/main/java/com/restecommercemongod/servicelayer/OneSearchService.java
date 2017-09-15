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

	public List<Product> findByX(String name) {
		List<Product> prod = productRepo.findByName(name);
		if (prod == null) {
			prod = productRepo.findByCategory(name);
			if (prod == null) {
				prod = productRepo.findByCondition(name);
			}
		}
		return prod;
	}

	// public List<Product> findByCategory(String category){
	// return productRepo.findByCategory(category);
	// }
	//
	// public List<Product> findByCondition(String condition){
	// return productRepo.findByCondition(condition);
	// }

}
