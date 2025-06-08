package com.designpatterns.creational.singleton;

final class NaiveSingleton {

  private static NaiveSingleton instance;
  public String value;

  private NaiveSingleton(String value) {

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    this.value = value;
  }

  public static NaiveSingleton getInstance(String value) {
    if (instance == null) {
      instance = new NaiveSingleton(value);
    }
    return instance;
  }

}

