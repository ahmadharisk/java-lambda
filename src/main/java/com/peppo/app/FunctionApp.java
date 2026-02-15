package com.peppo.app;

import java.util.function.Function;

public class FunctionApp {
  public static void main(String[] args) {

    Function<String, Integer> functionLength = new Function<String, Integer>() {
      @Override
      public Integer apply(String value) {
        return value.length();
      }
    };

    System.out.println("functionLength : " + functionLength.apply("function length"));

  }
}
