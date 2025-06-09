package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

class Directory implements FileSystem {

  private final String name;
  private final List<FileSystem> fileSystemList;

  public Directory(String name, List<FileSystem> fileSystemList) {
    this.name = name;
    this.fileSystemList = fileSystemList;
  }

  public Directory(String name) {
    this.name = name;
    fileSystemList = new ArrayList<>();
  }

  public void setFileSystem(FileSystem fileSystem) {
    fileSystemList.add(fileSystem);
  }

  @Override
  public void ls() {

    System.out.println(getName() + " Directory Files... ");

    for (FileSystem fileSystem : fileSystemList) {
      fileSystem.ls();
    }

  }

  @Override
  public String getName() {
    return name;
  }
}
