package com.designpatterns.creational.singleton;

public class DemoMultiThreaded {

  public static void main(String[] args) {
    System.out.println("""
        If you see the same value, then singleton was reused (yay!)
        If you see different values, then 2 singletons were created (booo!!)\
        
        
        RESULT:
        """);
    ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("FOO");
    ThreadSafeSingleton anotherSingleton = ThreadSafeSingleton.getInstance("BAR");
    System.out.println(singleton.value + " hashcode= " + singleton);
    System.out.println(anotherSingleton.value + " hashcode= " + anotherSingleton);
  }

}
