package com.peppo.app;

import java.util.function.Supplier;

public class SupplierApp {

  public static void main(String[] args) {

    Supplier<String> supplier = new Supplier<String>() {
      @Override
      public String get() {
        return "peppo";
      }
    };

    Supplier<String> supplierV2 = () -> "peppo from supplierV2";

    System.out.println("supplier : " + supplier.get());
    System.out.println("supplierV2 : " + supplierV2.get());
  }
}
