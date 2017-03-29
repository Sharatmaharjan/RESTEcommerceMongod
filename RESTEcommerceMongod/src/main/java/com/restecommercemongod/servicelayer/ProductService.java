package com.restecommercemongod.servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restecommercemongod.model.Product;
import com.restecommercemongod.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;

	public List<Product> findAllProduct() {
		return productRepo.findAll();
	}

	public void addProduct(Product product) {
		productRepo.save(product);
	}

	public void deleteProduct(String id) {
		productRepo.delete(id);
	}

	public void updateProduct(Product product,String id) {
	productRepo.save(product);
	}

	public List<Product> findByCategory(String category) {
		return productRepo.findByCategory(category);
	}

	public List<Product> findByCondition(String condition) {
		return productRepo.findByCondition(condition);
	}

	public List<Product> findByPrice(String price) {
		return productRepo.findByPrice(price);
	}
}