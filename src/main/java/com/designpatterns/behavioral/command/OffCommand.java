package com.designpatterns.behavioral.command;

class OffCommand implements Command {

  private final Light light;

  OffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOff();
  }
}
