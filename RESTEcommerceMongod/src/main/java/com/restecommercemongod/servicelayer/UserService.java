package com.restecommercemongod.servicelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restecommercemongod.model.User;
import com.restecommercemongod.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public User findValidUser(User user){
//		User user=userRepo.findByUsernameAndPassword(username, password);
//		if(user!=null){
//			return user;
//		}
//		return null;
		User user1= userRepo.findByUsernameAndPassword(user.getUsername(),user.getPassword());
		if(user1!=null){
			return user;
		}
		return null;
	}

	public void addNewUser(User user) {
		User user1=userRepo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		if(user1==null){
			System.out.println("no error while checking user==null");
//			user.setUsername(username);
//			user.setPassword(password);
			userRepo.save(user);
		}
	}
}
