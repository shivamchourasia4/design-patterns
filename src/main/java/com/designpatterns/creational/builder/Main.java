package com.designpatterns.creational.builder;

import com.designpatterns.creational.builder.Car.Builder;

public class Main {

  public static void main(String[] args) {
    var builder = new Car.Builder();
    var car = builder.id(1).color("red").build();
    System.out.println("car = " + car);

  }

}
