package com.designpatterns.structural.facade;

class HomeTheaterFacade {

  private final DVDPlayer dvdPlayer;
  private final Projector projector;
  private final SoundSystem soundSystem;

  HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
    this.dvdPlayer = dvdPlayer;
    this.projector = projector;
    this.soundSystem = soundSystem;
  }

  void watchMovie() {
    dvdPlayer.on();
    dvdPlayer.play();
    projector.on();
    projector.focus();
    soundSystem.on();
    soundSystem.setVolume(15);
    System.out.println("Movie started");
  }


}
