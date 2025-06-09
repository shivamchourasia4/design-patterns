package com.designpatterns.behavioral.command;

public class Main {

  public static void main(String[] args) {
    Light light = new Light();

    Command onCommand = new OnCommand(light);
    Command offCommand = new OffCommand(light);

    RemoteControl remoteControl = new RemoteControl();
    remoteControl.setCommand(onCommand);
    remoteControl.pressButton();
    remoteControl.setCommand(offCommand);
    remoteControl.pressButton();
  }

}
