package com.designpatterns.structural.adapter;

class SquarePegAdapter extends RoundPeg {

  private final SquarePeg peg;

  SquarePegAdapter(SquarePeg peg) {
    this.peg = peg;
  }

  @Override
  double getRadius() {
    // min circle radius which can fit this peg
    return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
  }

}
