package com.designpatterns.creational.singleton;

class ThreadSafeSingleton {

  private static volatile ThreadSafeSingleton instance;
  public String value;

  private ThreadSafeSingleton(String value) {
    this.value = value;
  }

  public static ThreadSafeSingleton getInstance(String value) {
    if (instance == null) {
      synchronized (ThreadSafeSingleton.class) {
        if (instance == null) {
          instance = new ThreadSafeSingleton(value);
        }
      }
    }
    return instance;
  }

}
