package com.cars.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.advices.ResourceNotFoundException;
import com.cars.beans.Customer;
import com.cars.beans.User;
import com.cars.service.UserService;

@RestController
@RequestMapping(path="/api")
public class UserController {
	@Autowired	
	UserService userservice;
	
	
	@PostMapping(path="/addUser")
	public ResponseEntity<User> addUser(@RequestBody User u) throws ResourceNotFoundException
	{
		User u1=userservice.createUser(u);
		ResponseEntity<User> re=new ResponseEntity<User>(u1,HttpStatus.OK);
		return re;
	}
	
	
	@GetMapping("/SignIn/{userId}")
	public ResponseEntity<String> signIn(@PathVariable long userId,@RequestBody String password)throws Exception
	{
    	userservice.signIn(userId,password);
    	String s="Logged in successful";
    	
    	 ResponseEntity<String> re=new ResponseEntity<String>(s,HttpStatus.OK);
 		return re;	
	}
	
    
	@PutMapping(path="/ChangePassword/{userId}")
	public ResponseEntity<User>  changePassword(@PathVariable long userId,@RequestBody String newpassword ) throws Exception
	{
		User u1=userservice.changeUserPassword(userId,newpassword);
		
		ResponseEntity<User> re=new ResponseEntity<User>(u1,HttpStatus.OK);
		return re;
	}
	
	
	@GetMapping("/SignOut/{userId}")
	public ResponseEntity <String> signOut(@PathVariable long userId) throws Exception
	{
        userservice.signOut(userId);
        String s="Logged Out Succssfully";
		ResponseEntity<String> re=new ResponseEntity<String>(s,HttpStatus.OK);
		return re;
		
	}
}
