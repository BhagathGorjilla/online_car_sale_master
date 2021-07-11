package com.cars.beans;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Card {
	
	private String cardName;
	@Id
	private String cardNumber;
    private String cardExpiry;
    private String cvv;
	
	

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardExpiry() {
		return cardExpiry;
	}

	public void setCardExpiry(String cardExpiry) {
		this.cardExpiry = cardExpiry;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "Card [ cardName=" + cardName + ", cardNumber=" + cardNumber + ", cardExpiry="
				+ cardExpiry + ", cvv=" + cvv + "]";
	}
	
	
}