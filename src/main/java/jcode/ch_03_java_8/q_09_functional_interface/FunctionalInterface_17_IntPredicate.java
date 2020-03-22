package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.IntPredicate;

public class FunctionalInterface_17_IntPredicate {

  public static void main(String[] args) {
    IntPredicate intPredicate = (x) -> x > 10;
    System.out.println(intPredicate.test(5));
    System.out.println(intPredicate.test(25));
  }
}
