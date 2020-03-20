package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.DoubleBinaryOperator;

public class FunctionalInterface_07_DoubleBinaryOperator {

  public static void main(String[] args) {
    DoubleBinaryOperator doubleBinaryOperator = (x1, x2) -> {
      return x1 * x2;
    };

    System.out.println(doubleBinaryOperator.applyAsDouble(0.111, 0.00777));
  }

}
