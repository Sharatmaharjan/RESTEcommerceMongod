package com.restecommercemongod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restecommercemongod.model.Product;
import com.restecommercemongod.servicelayer.OneSearchService;

@RestController
public class OneSearchController {

	@Autowired
	private OneSearchService oneSearchService;
	
	@RequestMapping(value="/product/name-{name}",method=RequestMethod.GET)
	public List<Product> findByName(@PathVariable String name){
		return oneSearchService.findByName(name);
	}
	
	@RequestMapping(value="/product/category-{category}",method=RequestMethod.GET)
	public List<Product> findByCategory(@PathVariable String category){
		return oneSearchService.findByCategory(category);
	}
	
	@RequestMapping(value="/product/condition-{condition}",method=RequestMethod.GET)
	public List<Product> findByCondition(@PathVariable String condition){
		return oneSearchService.findByCondition(condition);
	}
}
