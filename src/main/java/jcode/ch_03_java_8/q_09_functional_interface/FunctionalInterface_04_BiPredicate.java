package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.BiPredicate;

public class FunctionalInterface_04_BiPredicate {

  public static void main(String[] args) {
    BiPredicate<Integer, Integer> biPredicate = (x1, x2) -> {
      return x1.equals(x2);
    };

    System.out.println("biPredicate 1 2 --->" + biPredicate.test(1, 2));
    System.out.println("biPredicate 5 5--->" + biPredicate.test(5, 5));
  }

}
