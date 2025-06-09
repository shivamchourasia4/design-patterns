package com.designpatterns.behavioral.cor;

public class Rupees50Dispenser implements DispenseChain {

  private DispenseChain chain;

  @Override
  public void setNextChain(DispenseChain nextChain) {
    this.chain = nextChain;
  }

  @Override
  public void dispense(Currency currency) {

    if (currency.getAmount() >= 50) {
      int num = currency.getAmount() / 50;
      int rem = currency.getAmount() % 50;

      System.out.println("Dispensing " + num + " 50 note");

      if (rem != 0) {
        this.chain.dispense(new Currency(rem));
      }
    } else {
      this.chain.dispense(currency);
    }

  }
}
