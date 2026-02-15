package com.peppo.app;

import java.util.function.Consumer;

public class ConsumerApp {
  public static void main(String[] args) {

    Consumer<String> consumer = new Consumer<String>() {
      @Override
      public void accept(String value) {
        System.out.println(value);
      }
    };

    consumer.accept("consumer peppo");
  }
}
