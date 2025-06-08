package com.designpatterns.creational.abstractfactory;

class Application {

  private final Button button;
  private final Checkbox checkbox;

  public Application(GUIFactory guiFactory) {
    this.button = guiFactory.createButton();
    this.checkbox = guiFactory.createCheckbox();
  }

  public void renderUI() {
    button.paint();
    checkbox.paint();
  }
}
