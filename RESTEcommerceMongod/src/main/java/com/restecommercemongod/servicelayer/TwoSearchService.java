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

	public List<Product> findByXAndY(String x, String y) throws Exception {
		if (x == null || y == null) {
			throw new Exception("error in url.");
		}
		List<Product> prod = productRepo.findByNameAndCategory(x, y);
		// List<Product> prodd = productRepo.findByNameAndCategory(y, x);
		// prod.addAll(prodd);
		// List<Product> prod1 = productRepo.findByNameAndCondition(x, y);
		// prod.addAll(prod1);
		// List<Product> prodd1 = productRepo.findByNameAndCondition(y, x);
		// prod.addAll(prodd1);
		// List<Product> prod2 = productRepo.findByCategoryAndCondition(x, y);
		// prod.addAll(prod2);
		// List<Product> prodd2 = productRepo.findByCategoryAndCondition(y, x);
		// prod.addAll(prodd2);
		if (prod == null) {
			prod = productRepo.findByNameAndCategory(y, x);
			if (prod == null) {
				prod = productRepo.findByNameAndCondition(x, y);
				if (prod == null) {
					prod = productRepo.findByNameAndCondition(y, x);
				}
				if (prod == null) {
					prod = productRepo.findByCategoryAndCondition(x, y);
				}
				if (prod == null) {
					prod = productRepo.findByCategoryAndCondition(y, x);
				}
			}
		}
		if (prod == null) {
			throw new Exception("no product found");
		}
		return prod;
	}

	// public List<Product> findByNameAndCondition(String name, String
	// condition) {
	// return productRepo.findByNameAndCondition(name, condition);
	// }
	//
	// public List<Product> findByCategoryAndCondition(String category, String
	// condition) {
	// return productRepo.findByCategoryAndCondition(category, condition);
	// }
}
