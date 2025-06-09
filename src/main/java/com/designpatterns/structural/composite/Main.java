package com.designpatterns.structural.composite;

public class Main {

  public static void main(String[] args) {
    Directory directory = new Directory("movies");
    File movie = new File("Specter 2015");

    directory.setFileSystem(movie);

    Directory latest = new Directory("latest");
    File latestMovie = new File("Fall Guy 2024");
    latest.setFileSystem(latestMovie);
    directory.setFileSystem(latest);
    directory.ls();

  }

}
