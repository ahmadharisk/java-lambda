package com.peppo.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {

  public static void main(String[] args) {

    List<String> names = new ArrayList<>();
    names.addAll(List.of("peppo", "silpiana", "kenzy"));

    // menggunakan anonymous class
    names.removeIf(new Predicate<String>() {
      @Override
      public boolean test(String t) {
        return t.length() > 5;
      }
    });

    // menggunakan lambda
    names.removeIf(name -> name.length() > 5);
  }
}
