package com.peppo.app;

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

  public boolean isLowerCase(String s) {
    for (Character c : s.toCharArray()) {
      if (!Character.isLowerCase(c)) {
        return false;
      }
    }
    return true;
  }
}
