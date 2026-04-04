package com.peppo.app;

import java.util.function.Supplier;

public class LazyApp {

  public static void main(String[] args) {
    testScore(90, "peppo");

    testScore(60, getName());
    // jika dijalankan func getName akan dipanggil, padahal score 60 dan tidak
    // membutuhkan parameter name

    testScore2(90, () -> getName());
    testScore2(60, () -> getName());
  }

  public static void testScore(int score, String name) {
    if (score > 80) {
      System.out.println("Selamat " + name + ", anda lulus");
    } else {
      System.out.println("coba lagi tahun depan");
    }
  }

  public static void testScore2(int score, Supplier<String> name) {
    if (score > 80) {
      System.out.println("Selamat " + name.get() + ", anda lulus");
    } else {
      System.out.println("coba lagi tahun depan");
    }
  }

  public static String getName() {
    System.out.println("method getName() dipanggil");
    return "peppo";
  }
}
