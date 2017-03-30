package com.restecommercemongod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restecommercemongod.model.Product;
import com.restecommercemongod.servicelayer.TwoSearchService;

@RestController
public class TwoSearchController {
@Autowired
private TwoSearchService twoSearchService;

	@RequestMapping(value="/product/{x}/{y}",method=RequestMethod.GET)
	public List<Product> findByXAndY(@PathVariable String x,@PathVariable String y){
		return twoSearchService.findByXAndY(x, y);
	}

//	@RequestMapping(value="/product/name-{name}/category-{category}",method=RequestMethod.GET)
//	public List<Product> findByNameAndCategory(@PathVariable String name,@PathVariable String category){
//		return twoSearchService.findByNameAndCategory(name, category);
//	}
//	
//	@RequestMapping(value="/product/name-{name}/condition-{condition}",method=RequestMethod.GET)
//	public List<Product> findByNameAndCondition(@PathVariable String name,@PathVariable String condition){
//		return twoSearchService.findByNameAndCondition(name, condition);
//	}
//	
//	@RequestMapping(value="/product/category-{category}/condition-{condition}",method=RequestMethod.GET)
//	public List<Product> findByCategoryAndCondition(@PathVariable String category,@PathVariable String condition){
//		return twoSearchService.findByCategoryAndCondition(category, condition);
//	}
}
