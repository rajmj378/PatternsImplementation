package com.observerpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Counter
{
	protected List<Frame> frames;
    protected int count;

    public Counter (){
        count = 0;
        frames=new ArrayList<Frame>();
    }
    
    public abstract void increment();
    public abstract void decrement();
    public abstract void attachFrame(Frame f);
    public abstract void dettachFrame(Frame f);
    
    public abstract void notifyAllFrames();
    
   
}