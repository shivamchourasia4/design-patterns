package com.designpatterns.behavioral.cor;

public interface DispenseChain {

  void setNextChain(DispenseChain chain);

  void dispense(Currency currency);

}
