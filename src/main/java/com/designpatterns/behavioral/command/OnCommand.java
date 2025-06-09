package com.designpatterns.behavioral.command;

class OnCommand implements Command {

  private final Light light;

  OnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOn();
  }
}
