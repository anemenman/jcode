package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.DoubleUnaryOperator;

public class FunctionalInterface_14_DoubleUnaryOperator {

  public static void main(String[] args) {
    DoubleUnaryOperator doubleUnaryOperator = (x) -> {
      return x * 2;
    };

    System.out.println(doubleUnaryOperator.applyAsDouble(11));
  }

}
