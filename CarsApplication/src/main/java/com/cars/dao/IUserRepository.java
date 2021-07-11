package com.cars.dao;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.cars.beans.User;

public interface IUserRepository extends JpaRepository<User, Long> {
	
	@Query("Select u from User u where u.userId=?1 and u.password=?2")
	Optional<User> SignIn(long userId,String password);
	
	
	@Query("Select u from User u where u.userId=?1")
	Optional<User> SignOut(long userId);
	
	
	@Query("Select u from User u where u.userId=?1 and u.password=?2")
	Optional<User> Changepassword(long userId,String password);
	
	
	

	User save(Optional<User> objUser);

}
