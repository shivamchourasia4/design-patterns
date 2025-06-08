package com.designpatterns.creational.abstractfactory;

class MacButton implements Button{

  @Override
  public void paint() {
    System.out.println("mac button");
  }
}
