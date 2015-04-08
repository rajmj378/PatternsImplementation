package com.observer;

public class SmsSubscriber implements Subscriber {

	public void update(NewsPublisher newsPublisher) {
		System.out.println("Message sent to SmsSubcriber :::  "+newsPublisher.getLatestNews());
	}

}
