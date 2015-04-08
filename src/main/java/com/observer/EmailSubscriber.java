package com.observer;

public class EmailSubscriber implements Subscriber {

	public void update(NewsPublisher newsPublisher) {
		System.out.println("Message sent to EmailSubcriber :::  "+newsPublisher.getLatestNews());
	}

}
