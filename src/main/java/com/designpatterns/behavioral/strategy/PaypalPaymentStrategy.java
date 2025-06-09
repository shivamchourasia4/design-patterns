package com.designpatterns.behavioral.strategy;

class PaypalPaymentStrategy implements PaymentStrategy {

  @Override
  public void pay(int amount) {
    System.out.printf("payed %d amount using paypal%n", amount);
  }
}
