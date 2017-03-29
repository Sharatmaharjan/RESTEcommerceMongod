package com.restecommercemongod.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.restecommercemongod.model.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product, String> {
	List<Product> findByName(String name);

	List<Product> findByCategory(String category);

	List<Product> findByCondition(String condition);

	List<Product> findByPrice(String price);

	List<Product> findByNameAndCategory(String name, String category);

	List<Product> findByNameAndCondition(String name, String condition);

	List<Product> findByCategoryAndCondition(String category, String condition);
	
	List<Product> findByNameAndCategoryAndCondition(String name,String category,String condition);
}
