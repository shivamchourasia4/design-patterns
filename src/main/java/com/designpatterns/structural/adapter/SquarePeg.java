package com.designpatterns.structural.adapter;

class SquarePeg {

  private final double width;

  SquarePeg(double width) {
    this.width = width;
  }

  double getWidth() {
    return width;
  }

  double getSquare() {
    return Math.pow(width, 2);
  }

}
