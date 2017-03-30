package com.restecommercemongod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restecommercemongod.model.Product;
import com.restecommercemongod.servicelayer.ThreeSearchService;

@RestController
public class ThreeSearchController {
	@Autowired
	private ThreeSearchService threeSearchService;

	@RequestMapping(value="/product/{x}/{y}/{z}",method=RequestMethod.GET)
	public List<Product> findBYXYZ(@PathVariable String x,@PathVariable String y,@PathVariable String z){
		return threeSearchService.findByXYZ(x, y, z);
	}
	
//	@RequestMapping(value="/product/{name}/{category}/{condition}",method=RequestMethod.GET)
//	public List<Product> findByNameCategoryCondition(@PathVariable String name,@PathVariable String category,@PathVariable String condition){
//	return threeSearchService.findByNameAndCategoryAndCondition(name, category, condition);	
//	}
}
