package com.strategyPattern;

public class CreditCardPaymentStrategy implements PaymentStrategy {

	private int cardNumber;
	private String cardHolder;
	private int ccn;
	private String dateOfExpiry;

	public CreditCardPaymentStrategy(int cardNumber, String cardHolder,
			int ccn, String dateOfExpiry) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolder = cardHolder;
		this.ccn = ccn;
		this.dateOfExpiry = dateOfExpiry;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public int getCcn() {
		return ccn;
	}

	public void setCcn(int ccn) {
		this.ccn = ccn;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public void pay(double amount) {
		System.out.println("Amount paid by CreditCard::  $"+amount);
	}

}
