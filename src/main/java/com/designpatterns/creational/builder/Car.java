package com.designpatterns.creational.builder;

class Car {

  private final int id;
  private final String color;
  private final String model;

  private Car(Builder builder) {
    this.id = builder.id;
    this.color = builder.color;
    this.model = builder.model;
  }

  @Override
  public String toString() {
    return "Car{" +
           "id=" + id +
           ", color='" + color + '\'' +
           ", model='" + model + '\'' +
           '}';
  }

  public int getId() {
    return id;
  }

  public String getColor() {
    return color;
  }

  public String getModel() {
    return model;
  }

  public Builder builder() {
    return new Builder();
  }

  static class Builder {

    private int id;
    private String color;
    private String model;

    Builder id(int id) {
      this.id = id;
      return this;
    }

    Builder color(String color) {
      this.color = color;
      return this;
    }

    Builder model(String model) {
      this.model = model;
      return this;
    }

    Car build() {
      return new Car(this);
    }

  }

}
