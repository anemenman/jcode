package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.Predicate;

public class FunctionalInterface_20_Predicate {

  public static void main(String[] args) {
    Predicate<String> predicate = (x) -> x.equals("a");
    System.out.println(predicate.test("b"));
    System.out.println(predicate.test("a"));
  }

}
