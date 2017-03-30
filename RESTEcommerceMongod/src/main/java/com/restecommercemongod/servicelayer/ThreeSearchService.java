package com.restecommercemongod.servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restecommercemongod.model.Product;
import com.restecommercemongod.repo.ProductRepo;

@Service
public class ThreeSearchService {
	@Autowired
	private ProductRepo productRepo;

	public List<Product> findByXYZ(String x, String y, String z) {
		List<Product> prod1 = productRepo.findByNameAndCategoryAndCondition(x, y, z);
		List<Product> prod2 = productRepo.findByNameAndCategoryAndCondition(x, z, y);
		prod1.addAll(prod2);
		List<Product> prod3 = productRepo.findByNameAndCategoryAndCondition(y, x, z);
		prod1.addAll(prod3);
		List<Product> prod4 = productRepo.findByNameAndCategoryAndCondition(y, z, x);
		prod1.addAll(prod4);
		List<Product> prod5 = productRepo.findByNameAndCategoryAndCondition(z, x, y);
		prod1.addAll(prod5);
		List<Product> prod6 = productRepo.findByNameAndCategoryAndCondition(z, y, x);
		prod1.addAll(prod6);
		return prod1;
	}

	// public List<Product> findByNameAndCategoryAndCondition(String name,String
	// category,String condition){
	// return productRepo.findByNameAndCategoryAndCondition(name, category,
	// condition);
	// }
}
