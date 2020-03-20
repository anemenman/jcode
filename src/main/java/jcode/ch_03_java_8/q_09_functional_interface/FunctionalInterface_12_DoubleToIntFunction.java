package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.DoubleToIntFunction;

public class FunctionalInterface_12_DoubleToIntFunction {

  public static void main(String[] args) {

    DoubleToIntFunction doubleToIntFunction = (x) -> {
      return (int) x;
    };

    System.out.println(doubleToIntFunction.applyAsInt(1.5));
    System.out.println(doubleToIntFunction.applyAsInt(0.999));
  }

}
