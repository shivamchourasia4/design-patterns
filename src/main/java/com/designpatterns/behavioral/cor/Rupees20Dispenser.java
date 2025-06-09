package com.designpatterns.behavioral.cor;

public class Rupees20Dispenser implements DispenseChain {

  private DispenseChain chain;

  @Override
  public void setNextChain(DispenseChain nextChain) {
    this.chain = nextChain;
  }

  @Override
  public void dispense(Currency currency) {

    if (currency.getAmount() >= 20) {
      int num = currency.getAmount() / 20;
      int rem = currency.getAmount() % 20;

      System.out.println("Dispensing " + num + " 20 note");

      if (rem != 0) {
        this.chain.dispense(new Currency(rem));
      }
    } else {
      this.chain.dispense(currency);
    }

  }
}
