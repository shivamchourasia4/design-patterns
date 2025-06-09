package com.designpatterns.behavioral.observer;

public interface Subject {

  void registerObserver(Observer observer);

  void notifyObservers();

}
