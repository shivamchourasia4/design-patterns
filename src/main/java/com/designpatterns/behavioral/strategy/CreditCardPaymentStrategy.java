package com.designpatterns.behavioral.strategy;

class CreditCardPaymentStrategy implements PaymentStrategy {

  @Override
  public void pay(int amount) {
    System.out.printf("payed %d amount using credit card%n", amount);
  }
}
