package com.designpatterns.creational.abstractfactory;

class MacCheckBox implements Checkbox {

  @Override
  public void paint() {
    System.out.println("mac checkbox");
  }
}
