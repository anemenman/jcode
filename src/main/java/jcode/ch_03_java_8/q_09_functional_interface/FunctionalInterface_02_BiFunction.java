package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.BiFunction;

public class FunctionalInterface_02_BiFunction {

  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> biFunction = (i1, i2) -> {
      return i1 + i2;
    };
    //OR
    BiFunction<Integer, Integer, Integer> biFunction2 = (i1, i2) -> i1 + i2;

    System.out.println("result --> " + biFunction.apply(1, 2));
  }

}
