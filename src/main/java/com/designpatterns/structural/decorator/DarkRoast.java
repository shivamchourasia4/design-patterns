package com.designpatterns.structural.decorator;

class DarkRoast implements Beverage {

  @Override
  public String getDescription() {
    return "Dark Roast Coffee";
  }

  @Override
  public double getCost() {
    return 0.99;
  }
}
