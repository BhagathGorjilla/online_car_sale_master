package com.cars.beans;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(long userId) {
		super();
		this.userId = userId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return Objects.equals(userId, other.userId);
	}

	@Override
	public String toString() {
		return "Admin [userId=" + userId + "]";
	} 

}
