package com.designpatterns.structural.decorator;

class Whip extends CondimentDecorator {

  public Whip(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " , Whip";
  }

  @Override
  public double
  getCost() {
    return beverage.getCost() + .10;
  }
}
