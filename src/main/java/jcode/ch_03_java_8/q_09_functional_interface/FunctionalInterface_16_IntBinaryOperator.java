package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.IntBinaryOperator;

public class FunctionalInterface_16_IntBinaryOperator {

  public static void main(String[] args) {
    IntBinaryOperator intBinaryOperator = (x, y) -> {
      return x + y;
    };

    System.out.println(intBinaryOperator.applyAsInt(2, 5));
  }

}
