package com.designpatterns.behavioral.observer;

public class CurrentConditionDisplay implements Observer {

  private float temperature;
  private float humidity;

  public CurrentConditionDisplay(Subject subject) {
    subject.registerObserver(this);
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {

    this.temperature = temperature;
    this.humidity = humidity;
    display();

  }

  private void display() {
    System.out.println(
        "Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }
}
