package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.DoublePredicate;

public class FunctionalInterface_10_DoublePredicate {

  public static void main(String[] args) {
    DoublePredicate doublePredicate = (x) -> {
      return x > 3.14;
    };

    System.out.println(doublePredicate.test(3));
    System.out.println(doublePredicate.test(4));
  }

}
