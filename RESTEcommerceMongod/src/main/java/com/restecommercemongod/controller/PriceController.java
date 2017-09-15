package com.restecommercemongod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restecommercemongod.model.Product;
import com.restecommercemongod.servicelayer.PriceService;

@RestController
public class PriceController {
	
	@Autowired
	private PriceService priceService;
	
	@RequestMapping(value="product/lessthan/{price}",method=RequestMethod.GET)
	public List<Product> getProductByLessThanPrice(@PathVariable String price){
		return priceService.getProductByLessThanPrice(price);		
	}
	
	@RequestMapping(value="product/morethan/{price}",method=RequestMethod.GET)
	public List<Product> getProductByMoreThanPrice(@PathVariable String price){
		return priceService.getProductByMoreThanPrice(price);		
	}
	
	@RequestMapping(value="product/equalto/{price}",method=RequestMethod.GET)
	public List<Product> getProductByEqualToPrice(@PathVariable String price){
		return priceService.getProductByEqualToPrice(price);		
	}
}
