package com.designpatterns.behavioral.strategy;

public class Main {

  public static void main(String[] args) {
    ShoppingCart cart1 = new ShoppingCart(new CreditCardPaymentStrategy());
    cart1.checkout(100);

    ShoppingCart cart2 = new ShoppingCart(new PaypalPaymentStrategy());
    cart2.checkout(35);

  }

}
