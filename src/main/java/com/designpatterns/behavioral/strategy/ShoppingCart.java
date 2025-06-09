package com.designpatterns.behavioral.strategy;

class ShoppingCart {

  private final PaymentStrategy paymentStrategy;

  public ShoppingCart(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  void checkout(int amount) {
    paymentStrategy.pay(amount);
  }
}
