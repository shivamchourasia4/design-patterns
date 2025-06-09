package com.designpatterns.structural.decorator;

abstract class CondimentDecorator implements Beverage {

  protected Beverage beverage;

  public CondimentDecorator(Beverage beverage) {
    this.beverage = beverage;
  }
}
