package com.designpatterns.structural.facade;

public class Main {

  public static void main(String[] args) {
    HomeTheaterFacade facade = new HomeTheaterFacade(new DVDPlayer(), new Projector(),
        new SoundSystem());
    facade.watchMovie();
  }

}
