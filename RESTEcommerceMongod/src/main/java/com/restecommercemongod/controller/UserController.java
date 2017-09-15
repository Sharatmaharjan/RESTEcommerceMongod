package com.restecommercemongod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restecommercemongod.model.User;
import com.restecommercemongod.servicelayer.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public User findValidUser(@RequestBody User user){
		return userService.findValidUser(user);
	}
	
	@RequestMapping(value="/addnewuser",method=RequestMethod.POST)
	public void addNewUser(@RequestBody User user){
		userService.addNewUser(user);
	}
}
