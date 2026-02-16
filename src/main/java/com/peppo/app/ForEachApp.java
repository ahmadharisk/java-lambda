package com.peppo.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {

  public static void main(String[] args) {

    List<String> list = List.of("peppo", "silpiana", "kenzy");

    System.out.println("menggunakan perulangan biasa : ");
    for (String value : list) {
      System.out.println(value);
    }

    System.out.println("menggunakan anonymoun class : ");
    list.forEach(new Consumer<String>() {
      public void accept(String t) {
        System.out.println(t);
      };
    });

    System.out.println("menggunakan lambda : ");
    list.forEach(value -> System.out.println(value));

    System.out.println("menggunakan method reference : ");
    list.forEach(System.out::println);
  }
}
