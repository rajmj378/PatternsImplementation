package com.proxyexample;

import com.proxyexample.functor.ThingLoggingBiFunctor;

//Expected result lines : 4
//        A Hello
//        before delegation
//        A Hello
//        after delegation

public class ThingProxyApp {
    public static void main(String[] args){

        Thing<String> thing = new aThing<String>("A");
        thing.compute("Hello");


        thing = new LogProxy<String>(thing, new ThingLoggingBiFunctor());
        thing.compute("Hello");
    }
}
