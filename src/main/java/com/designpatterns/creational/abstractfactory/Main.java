package com.designpatterns.creational.abstractfactory;

public class Main {

  public static void main(String[] args) {

    // WINDOWS
    GUIFactory guiFactory = new WindowsFactory();

    Application application = new Application(guiFactory);

    application.renderUI();

    // MAC
    GUIFactory guiFactory1 = new MacFactory();

    Application application1 = new Application(guiFactory1);

    application1.renderUI();

  }

}
