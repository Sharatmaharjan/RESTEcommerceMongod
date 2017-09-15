package com.restecommercemongod.controller;

import java.util.List;
import com.restecommercemongod.model.Product;
import com.restecommercemongod.servicelayer.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public List<Product> getAllProducts() throws Exception{
		//System.out.println("hello from get");
		List<Product> list=productService.findAllProduct();
		if(list!=null){
			return list;
		}else{
			throw new Exception("no product found.");
			//return null; //return msg saying no product found.
		}
	}
	
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public void addProduct(@RequestBody Product product) throws Exception{
		//System.out.println("hello from post method");
		if(product!=null){
		productService.addProduct(product);
	}else{
		throw new Exception("no product");
	}
	}
	
	@RequestMapping(value="/product/{id}",method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable String id){
		productService.deleteProduct(id);
	}
	
	@RequestMapping(value="/product/{id}",method=RequestMethod.PUT)
	public void updateProduct(@RequestBody Product product,@PathVariable String id){
		//@ResponseBody {productService.getById(id);}
		productService.updateProduct(product);
	}
	
//	@RequestMapping(value="/product/{price}",method=RequestMethod.GET)
//	public List<Product> getProductByPrice(@PathVariable String price){
//		
//	}
}
