package com.peppo.app;

import com.peppo.SimpleAction;

public class SimpleActionApp {

  public static void main(String[] args) {

    SimpleAction simpleAction1 = new SimpleAction() {
      @Override
      public String action(String name) {
        return "Hello " + name;
      }
    };

    System.out.println(simpleAction1.action("peppo"));

    SimpleAction simpleAction2 = (String name) -> {
      return "Hello " + name;
    };

    System.out.println(simpleAction2.action("peppo 2"));

    // lambda tanpa block

    SimpleAction simpleAction3 = (String value) -> "Hello " + value;

    SimpleAction simpleAction4 = (value) -> "Hello " + value;

    System.out.println(simpleAction3.action("from simpleAction3"));

    System.out.println(simpleAction4.action("from simpleAction4"));

  }

}
