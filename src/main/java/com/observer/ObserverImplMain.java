package com.observer;

public class ObserverImplMain {

	public static void main(String[] args) {
		NewsPublisher businessNewsPublisher=new BusinessNewsPublisher();
		businessNewsPublisher.setLatestNews("Ajako Taja khabar, Gadi dhurghatna maa 2 ko mritu..");
		
		//Create Observer (Subscibers) and attach to Observable Object (NewsPublisher)
		Subscriber smsSubscriber=new SmsSubscriber();
		Subscriber emailSubscriber=new EmailSubscriber();
		businessNewsPublisher.attachSubscriber(smsSubscriber);
		businessNewsPublisher.attachSubscriber(emailSubscriber);
		
		//update change in state(Brodcast msgs to Observer)
		businessNewsPublisher.notifyAllSubscribers();
		
		System.out.println("-------------------------------------------------------------");
		//Change in state of Observable object
		businessNewsPublisher.setLatestNews("Ajako Taja khabar, Bholi aam hadtaal suru...");
		
		//update change in state(Brodcast msgs to Observer)
		businessNewsPublisher.notifyAllSubscribers();
				
		
	}

}
