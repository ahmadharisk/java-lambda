package com.peppo.util;

public class StringUtil {

  public static boolean isLowerCase(String s) {
    for (Character c : s.toCharArray()) {
      if (!Character.isLowerCase(c)) {
        return false;
      }
    }
    return true;
  }
}
