package com.designpatterns.structural.decorator;

class Soy extends CondimentDecorator {

  public Soy(Beverage beverage) {
    super(beverage);
  }

  public String getDescription() {
    return beverage.getDescription() + " , Soy";
  }

  @Override
  public double getCost() {
    return beverage.getCost() + 0.15;
  }
}
