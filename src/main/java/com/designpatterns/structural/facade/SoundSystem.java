package com.designpatterns.structural.facade;

class SoundSystem {

  void on() {
    System.out.println("Sound System on");
  }

  void setVolume(int level) {
    System.out.println("Volume set to = " + level);
  }

}
