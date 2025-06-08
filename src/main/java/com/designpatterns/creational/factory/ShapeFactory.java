package com.designpatterns.creational.factory;

class ShapeFactory {

  public Shape getShape(String shapeName) {

    if ("CIRCLE".equals(shapeName)) {
      return new Circle();
    }

    return new Square();

  }

}
