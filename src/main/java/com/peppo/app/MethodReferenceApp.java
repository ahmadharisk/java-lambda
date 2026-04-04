package com.peppo.app;

import java.util.function.Function;
import java.util.function.Predicate;

import com.peppo.util.StringUtil;

public class MethodReferenceApp {

  public static void main(String[] args) {
    Predicate<String> predicateIsLowerCase = new Predicate<String>() {
      @Override
      public boolean test(String value) {
        return StringUtil.isLowerCase(value);
      }
    };

    Predicate<String> predicateIsLowerCaseV2 = StringUtil::isLowerCase; // method reference

    System.out.println("predicateIsLowerCase : " + predicateIsLowerCase.test("Halo"));
    System.out.println("predicateIsLowerCaseV2 : " + predicateIsLowerCaseV2.test("Halo"));

    // method reference parameter

    // Function<String, String> functionUpper = new Function<String, String>() {
    // @Override
    // public String apply(String value) {
    // return value.toUpperCase();
    // }
    // };

    // Function<String, String> functionUpper = value -> value.toUpperCase();

    Function<String, String> functionUpper = String::toUpperCase;

    // tidak boleh manggil yang ada parameter nya

    System.out.println(functionUpper.apply("halo"));
  }

  public void run() {

    Predicate<String> predicateIsLowerCase = new Predicate<String>() {
      @Override
      public boolean test(String value) {
        return MethodReferenceApp.this.isLowerCase(value);
      }
    };

    Predicate<String> predicateIsLowerCaseV2 = value -> MethodReferenceApp.this.isLowerCase(value);

    Predicate<String> predicateIsLowerCaseV3 = this::isLowerCase;

    System.out.println("predicateIsLowerCase : " + predicateIsLowerCase.test("Halo"));
    System.out.println("predicateIsLowerCaseV2 : " + predicateIsLowerCaseV2.test("Halo"));
    System.out.println("predicateIsLowerCaseV3 : " + predicateIsLowerCaseV3.test("Halo"));

  }

  public void run2() {
    MethodReferenceApp app = new MethodReferenceApp();

    Predicate<String> predicateIsLowerCase = app::isLowerCase;

    System.out.println(predicateIsLowerCase.test("halo"));
    System.out.println(predicateIsLowerCase.test("Halo"));
  }

  public boolean isLowerCase(String s) {
    for (Character c : s.toCharArray()) {
      if (!Character.isLowerCase(c)) {
        return false;
      }
    }
    return true;
  }
}
