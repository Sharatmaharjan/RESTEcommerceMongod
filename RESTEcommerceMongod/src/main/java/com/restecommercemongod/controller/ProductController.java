package com.restecommercemongod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restecommercemongod.model.Product;
import com.restecommercemongod.servicelayer.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public List<Product> getAllProducts(){
		//System.out.println("hello from get");
		return productService.findAllProduct();
	}
	
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public void addProduct(@RequestBody Product product){
		//System.out.println("hello from post method");
		productService.addProduct(product);
	}
	
	@RequestMapping(value="/product/{id}",method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable String id){
		productService.deleteProduct(id);
	}
	
	@RequestMapping(value="/product/{id}",method=RequestMethod.PUT)
	public void updateProduct(@RequestBody Product product,@PathVariable String id){
		productService.updateProduct(product,id);
	}
}
