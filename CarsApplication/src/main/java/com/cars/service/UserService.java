package com.cars.service;

import java.util.Optional;


import java.util.function.Supplier;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cars.advices.ResourceNotFoundException;
import com.cars.beans.Customer;
import com.cars.beans.User;
import com.cars.dao.IUserRepository;

@Service
public class UserService implements IUserService {
	
	@Autowired	/* To Connect with User Repository and dependency Injection  */
	IUserRepository userrepository;
	
	/* Regex condition to check password */
	String regex = "^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[@#$%&])"
            + "(?=\\S+$).{8,20}$";
	Pattern p = Pattern.compile(regex);
	
	/* The sign in is a login Method -> It verifies the data and return appropriate statement or data */
	
	
	@Override /* It is child class method overriding the parent class method */
	
	public Optional<User> signIn(long userId,String password)throws Exception 
	{     
		
		
		User user=userrepository.getById(userId);
	if(user.getPassword().equals(password)) {
			return Optional.of(userrepository.save(user));
		}
		else {
			 throw new ResourceNotFoundException(" Invalid id/password for SignIn");
		}
	}

	
	/* The ChangeUserPassword is a update Method -> It verifies and validates the details given and update it */
	@Override /* It is child class method overriding the parent class method */
	public User changeUserPassword(long userId,String newpassword) throws Exception  
	{	
	    String np=newpassword;
	    User user=userrepository.getById(userId);
	    
	    if(p.matcher(np).matches()) /* Password criteria validation */
		   {
	    	user.setPassword(newpassword);
	    	 return userrepository.save(user);
		   }
	    else {
	    	throw new ResourceNotFoundException(" Invalid password Craiteria");
	    }
	   
	}
	/* The Create user method -> It verifies the data and add the user */
	@Override /* It is child class method overriding the parent class method */
	public User createUser(User user) throws ResourceNotFoundException
	{
	   long id=user.getUserId();
	   String password=user.getPassword();
	   Optional<User> addUser=userrepository.findById(id);
	   if(addUser.isPresent())
	   {
		 throw new ResourceNotFoundException(id +" is already present in the database");
	   }
	   else if(p.matcher(password).matches()) /* Password criteria validation */
	   {
		  userrepository.save(user);
	   }
	   else
	   {
		  throw new ResourceNotFoundException("Password dosen't match the criteria..it should have alteast one upper,lower,number,special characters like @#$%& and min size of 8 and max of 20"); 
	   }
	   return user;
	}


	@Override
	public User signOut(long userId) throws Exception 
	{
	   Supplier<Exception> s1 = ()->new ResourceNotFoundException("Invalid id for SignOut");
	   User signOutUser=((Optional<User>) userrepository.SignOut(userId)).orElseThrow(s1);
	   return signOutUser;
	}


}
