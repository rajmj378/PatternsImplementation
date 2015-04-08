package com.observer;

public interface Subscriber {
	
	public abstract void update(NewsPublisher newsPublisher);
}
