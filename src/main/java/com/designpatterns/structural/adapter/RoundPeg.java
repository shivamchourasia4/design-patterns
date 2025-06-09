package com.designpatterns.structural.adapter;

class RoundPeg {

  private double radius;

  public RoundPeg() {
  }

  RoundPeg(double radius) {
    this.radius = radius;
  }

  double getRadius() {
    return radius;
  }
}
