package com.strategyPattern;

public class StrategyPatternMain {

	public static void main(String[] args)
	{
		Item item1=new Item("Item 1", 2.25);
		Item item2=new Item("Item 2", 40.23);
		
		ShoopingCart cart=new ShoopingCart();
		cart.addItem(item1);
		cart.payAmount(new PaypalPaymentStrategy("abina@outlook.com"));
		
		cart.addItem(item2);
		cart.payAmount(new CreditCardPaymentStrategy(31964545, "abinash", 222, "10/17"));
		
	}
}
