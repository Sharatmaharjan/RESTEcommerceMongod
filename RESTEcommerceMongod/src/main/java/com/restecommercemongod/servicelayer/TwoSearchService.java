package com.restecommercemongod.servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restecommercemongod.model.Product;
import com.restecommercemongod.repo.ProductRepo;

@Service
public class TwoSearchService {
	@Autowired
	private ProductRepo productRepo;

	public List<Product> findByNameAndCategory(String name, String category) {
		return productRepo.findByNameAndCategory(name, category);
	}

	public List<Product> findByNameAndCondition(String name, String condition) {
		return productRepo.findByNameAndCondition(name, condition);
	}

	public List<Product> findByCategoryAndCondition(String category, String condition) {
		return productRepo.findByCategoryAndCondition(category, condition);
	}
}
