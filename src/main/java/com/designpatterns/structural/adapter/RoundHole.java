package com.designpatterns.structural.adapter;

class RoundHole {

  private final double radius;

  RoundHole(double radius) {
    this.radius = radius;
  }

  double getRadius() {
    return radius;
  }

  boolean fits(RoundPeg peg) {

    return this.radius >= peg.getRadius();

  }

}
