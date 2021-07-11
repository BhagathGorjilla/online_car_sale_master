package com.cars.service;


import java.util.Optional;

import com.cars.advices.ResourceNotFoundException;
import com.cars.beans.Customer;
import com.cars.beans.User;

public interface IUserService {
	
	
	public User signOut(long userId) throws Exception;
	public User createUser(User u) throws ResourceNotFoundException;
	public User changeUserPassword(long userId, String newpassword) throws Exception;
	
	public Optional<User> signIn(long userId, String password) throws ResourceNotFoundException, Exception;

}
