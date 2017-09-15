package com.restecommercemongod.servicelayer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restecommercemongod.model.Product;
import com.restecommercemongod.repo.ProductRepo;

@Service
public class PriceService {

	@Autowired
	private ProductRepo productRepo;

	public List<Product> getProductByLessThanPrice(String price) {
		double price1 = Double.valueOf(price);
		List<Product> prodlis = productRepo.findAll();
		List<Product> prodlis1 = new ArrayList<>();
		for (Product prod : prodlis) {
			if (Double.valueOf(prod.getPrice()) < price1) {
				prodlis1.add(prod);
			}
		}
		return prodlis1;
	}

	public List<Product> getProductByMoreThanPrice(String price) {
		double price1 = Double.valueOf(price);
		List<Product> prodlis = productRepo.findAll();
		List<Product> prodlis1 = new ArrayList<>();
		for (Product prod : prodlis) {
			if (Double.valueOf(prod.getPrice()) > price1) {
				prodlis1.add(prod);
			}
		}
		return prodlis1;
	}
	
	public List<Product> getProductByEqualToPrice(String price) {
		double price1 = Double.valueOf(price);
		List<Product> prodlis = productRepo.findAll();
		List<Product> prodlis1 = new ArrayList<>();
		for (Product prod : prodlis) {
			if (Double.valueOf(prod.getPrice()) == price1) {
				prodlis1.add(prod);
			}
		}
		return prodlis1;
	}
}
