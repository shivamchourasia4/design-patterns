package com.designpatterns.creational.singleton;

public class DemoSingleThreaded {

  public static void main(String[] args) {

    breakNaiveSingletonUsingMultithreadDemo();

//    simpleDemo();

  }

  private static void breakNaiveSingletonUsingMultithreadDemo() {
    System.out.println("\nSingleton is broken by multiple threads");

    Thread thread1 = new Thread(() -> {
      NaiveSingleton naiveSingleton = NaiveSingleton.getInstance("FOO");
      System.out.println(naiveSingleton.value + " hashcode= " + naiveSingleton);
    });
    Thread thread2 = new Thread(() -> {
      NaiveSingleton naiveSingleton = NaiveSingleton.getInstance("BAR");
      System.out.println(naiveSingleton.value + " hashcode= " + naiveSingleton);
    });

    thread1.start();
    thread2.start();
  }

  private static void simpleDemo() {
    System.out.println("""
        If you see the same value, then singleton was reused (yay!)
        If you see different values, then 2 singletons were created (booo!!)\
        
        
        RESULT:
        """);
    NaiveSingleton singleton = NaiveSingleton.getInstance("FOO");
    NaiveSingleton anotherSingleton = NaiveSingleton.getInstance("BAR");
    System.out.println(singleton.value + " hashcode= " + singleton);
    System.out.println(anotherSingleton.value + " hashcode= " + anotherSingleton);
  }

}
