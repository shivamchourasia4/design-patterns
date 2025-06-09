package com.designpatterns.behavioral.cor;

public class Rupees10Dispenser implements DispenseChain {

  private DispenseChain chain;

  @Override
  public void setNextChain(DispenseChain nextChain) {
    this.chain = nextChain;
  }

  @Override
  public void dispense(Currency currency) {

    if (currency.getAmount() >= 10) {
      int num = currency.getAmount() / 10;
      int rem = currency.getAmount() % 10;

      System.out.println("Dispensing " + num + " 10 note");

      if (rem != 0) {
        this.chain.dispense(new Currency(rem));
      }
    } else {
      this.chain.dispense(currency);
    }

  }
}
