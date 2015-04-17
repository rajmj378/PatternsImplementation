package com.proxyexample;

public class aThing<T> implements Thing<T> {
    private T name;

    public aThing(T name){
        this.name = name;
    }

    public void compute(T name) {
        System.out.println(this.name+ " " + name);
    }
}
