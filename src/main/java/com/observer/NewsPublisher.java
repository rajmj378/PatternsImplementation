package com.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NewsPublisher {

	protected List<Subscriber> subscribers;
	protected String latestNews;
	
	public NewsPublisher()
	{
		subscribers=new ArrayList<Subscriber>();
	}
	
	public abstract void attachSubscriber(Subscriber s);
	public abstract void dettachSubscriber(Subscriber s);
	public abstract void notifyAllSubscribers();
	
	
}
