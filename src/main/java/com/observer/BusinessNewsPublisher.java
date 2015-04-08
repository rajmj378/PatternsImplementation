package com.observer;

public class BusinessNewsPublisher extends NewsPublisher {

	@Override
	public void notifyAllSubscribers() {
		for(Subscriber sc:subscribers)
		{
			sc.update(this);
		}
	}

	@Override
	public void attachSubscriber(Subscriber s) {
		subscribers.add(s);
	}

	@Override
	public void dettachSubscriber(Subscriber s) {
		subscribers.remove(s);
	}

}
