package com.proxyexample.functor;

public class ThingLoggingBiFunctor implements BiFunctor {

 public void before() {
    System.out.println("before delegation");
  }

  public void after() {
    System.out.println("after delegation");
  }
}
