package com.cars.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity 
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long carId;
	private String brand;
	private String model;
	private String variant;	
	private long price;
    private String registrationYear;
    private String registrationState;
	
	@ManyToOne(cascade=CascadeType.ALL)
	
	private Customer customer ;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public long getCarId() {
		return carId;
	}
	public void setCarId(long carId) {
		this.carId = carId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVariant() {
		return variant;
	}
	public void setVariant(String variant) {
		this.variant = variant;
		
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getRegistrationYear() {
		return registrationYear;
	}
	public void setRegistrationYear(String registrationYear) {
		this.registrationYear = registrationYear;
	}
	public String getRegistrationState() {
		return registrationState;
	}
	public void setRegistrationState(String registrationState) {
		this.registrationState = registrationState;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", brand=" + brand + ", model=" + model + ", variant=" + variant + ", price="
				+ price + ", registrationYear=" + registrationYear + ", registrationState=" + registrationState
				+ ", customer=" + customer + "]";
	}
	
	
	
		
	

}