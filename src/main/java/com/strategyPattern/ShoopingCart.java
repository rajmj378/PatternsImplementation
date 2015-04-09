package com.strategyPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoopingCart {

	private List<Item> items;

	public ShoopingCart() {
		items = new ArrayList<Item>();
	}

	public void addItem(Item i) {
		items.add(i);
	}

	public double calculateTotal() {
		double total = 0.0;
		for (Item i : items) {
			total += i.getRate();
		}
		return total;
	}

	public void payAmount(PaymentStrategy paymentStrategy) {
		paymentStrategy.pay(calculateTotal());
	}

}
