package com.cars.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long paymentId;
	private String type1;
	private String status;
	private long amount;
	
	 @OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	 private List<Card> card;
	 
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	  public List<Card> getCard() { 
		  return card; 
		  }
	  public void setCard(List<Card> card) {
		  this.card =card;
		  }
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", type1=" + type1 + ", status=" + status + ", amount=" + amount
				+ ", card=" + card + "]";
	}
	  
	  
}