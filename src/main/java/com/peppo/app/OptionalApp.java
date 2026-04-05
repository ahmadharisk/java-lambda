package com.peppo.app;

import java.util.Optional;

public class OptionalApp {

  public static void main(String[] args) {

    sayHello("peppo");

    sayHello2("silpiana");
    sayHello2(null);

  }

  public static void sayHello(String name) {
    String nameUpper = name.toUpperCase();

    System.out.println("HELLO " + nameUpper);
  }

  public static void sayHello2(String name) {

    String nameUpper = Optional.ofNullable(name)
        .map(String::toUpperCase)
        .orElse("TEMAN");

    // nameUpper.ifPresent(value -> System.out.println("HELLO " + value));

    System.out.println("HELLO " + nameUpper);
  }

}
