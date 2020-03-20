package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.DoubleFunction;

public class FunctionalInterface_09_DoubleFunction {

  public static void main(String[] args) {
    DoubleFunction doubleFunction = (x) -> {
      return 2 * x;
    };

    System.out.println(doubleFunction.apply(100));
  }

}
