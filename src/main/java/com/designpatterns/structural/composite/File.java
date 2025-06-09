package com.designpatterns.structural.composite;

class File implements FileSystem {

  private final String name;

  public File(String name) {
    this.name = name;
  }

  @Override
  public void ls() {
    System.out.println("fileName = " + name);
  }

  @Override
  public String getName() {
    return name;
  }
}
