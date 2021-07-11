package com.cars.beans;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private long userId;
	
	private String password;
		
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + "]";
	}
	
}
