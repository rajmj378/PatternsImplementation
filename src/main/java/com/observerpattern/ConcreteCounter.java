package com.observerpattern;

public class ConcreteCounter extends Counter {

	@Override
	public void increment() {
		count++;
		notifyAllFrames();
	}

	@Override
	public void decrement() {
		if (count > 0) {
			count--;
		}
		notifyAllFrames();
	}

	@Override
	public void attachFrame(Frame f) {
		frames.add(f);		
	}

	@Override
	public void dettachFrame(Frame f) {
		frames.remove(f);
		
	}

	@Override
	public void notifyAllFrames() {
		for(Frame f:frames)
		{
			f.updateCount(count);
		}
		
	}

}
