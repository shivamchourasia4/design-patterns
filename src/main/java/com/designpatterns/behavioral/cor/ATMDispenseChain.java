package com.designpatterns.behavioral.cor;

import java.util.Scanner;

public class ATMDispenseChain {

  private final DispenseChain chain;

  public ATMDispenseChain() {

    this.chain = new Rupees50Dispenser();
    DispenseChain nextChain1 = new Rupees20Dispenser();
    DispenseChain nextChain2 = new Rupees10Dispenser();

    chain.setNextChain(nextChain1);
    nextChain1.setNextChain(nextChain2);
  }

  public static void main(String[] args) {
    ATMDispenseChain atmDispenser = new ATMDispenseChain();

    while (true) {
      int amount;
      System.out.println("Enter amount to dispense");
      Scanner input = new Scanner(System.in);
      amount = input.nextInt();

      if (amount % 10 != 0) {
        System.out.println("Amount should be multiple of 10");
        return;
      }

      atmDispenser.chain.dispense(new Currency(amount));
    }
  }
}
