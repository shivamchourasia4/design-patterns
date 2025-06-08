package com.designpatterns.creational.abstractfactory;

class WindowsCheckBox implements Checkbox {

  @Override
  public void paint() {
    System.out.println("windows checkbox");
  }
}
