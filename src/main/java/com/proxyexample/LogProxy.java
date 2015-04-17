package com.proxyexample;

import com.proxyexample.functor.BiFunctor;

public class LogProxy<T> implements Thing<T> {
    Thing<T> thing;
    BiFunctor biFunctor;

    public LogProxy(Thing thing, BiFunctor biFunctor){
        this.thing = thing;
        this.biFunctor = biFunctor;
    }

    public void compute(T name) {
        biFunctor.before();
        thing.compute(name);
        biFunctor.after();
    }
}
