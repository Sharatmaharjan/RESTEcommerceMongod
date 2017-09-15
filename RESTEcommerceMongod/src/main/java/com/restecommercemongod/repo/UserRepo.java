package com.restecommercemongod.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.restecommercemongod.model.User;

@Repository
public interface UserRepo extends MongoRepository<User, String> {

	User findByUsernameAndPassword(String username, String password);
	
}
