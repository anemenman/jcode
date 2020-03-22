package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.DoubleToLongFunction;

public class FunctionalInterface_13_DoubleToLongFunction {

  public static void main(String[] args) {
    DoubleToLongFunction doubleToLongFunction = (x) -> (long) x;
    System.out.println(doubleToLongFunction.applyAsLong(1.1));
    System.out.println(doubleToLongFunction.applyAsLong(1.999));
  }

}
