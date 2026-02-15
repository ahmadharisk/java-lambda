package com.peppo.app;

import java.util.function.Predicate;

public class PredicateApp {

  public static void main(String[] args) {

    Predicate<String> predicateCheckBlank = new Predicate<String>() {
      @Override
      public boolean test(String t) {
        return t.isBlank();
      }
    };

    Predicate<String> predicateCheckBlankV2 = value -> value.isBlank();

    System.out.println("predicateCheckBlank : " + predicateCheckBlank.test(""));
    System.out.println("predicateCheckBlank, peppo : " + predicateCheckBlank.test("peppo"));

    System.out.println("predicateCheckBlankV2, : " + predicateCheckBlankV2.test(""));
    System.out.println("predicateCheckBlankV2, peppo : " + predicateCheckBlankV2.test("peppo"));
  }
}
