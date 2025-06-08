package com.designpatterns.creational.abstractfactory;

class WindowsFactory implements GUIFactory {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new WindowsCheckBox();
  }
}
