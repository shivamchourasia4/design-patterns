package com.designpatterns.creational.abstractfactory;

class WindowsButton implements Button {

  @Override
  public void paint() {
    System.out.println("windows button");
  }
}
