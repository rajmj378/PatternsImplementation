package com.strategyPattern;

public class PaypalPaymentStrategy implements PaymentStrategy {

	private String emailId;
	
	public PaypalPaymentStrategy(String emailId) {
		super();
		this.emailId = emailId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void pay(double amount) {
		System.out.println("Amount paid by Paypal Account::  $"+amount);
	}

}
