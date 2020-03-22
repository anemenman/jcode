package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.LongFunction;

public class FunctionalInterface_18_LongFunction {

  public static void main(String[] args) {
    LongFunction<String> longFunction = (x) -> {
      return String.valueOf(x + 2);
    };

    System.out.println(longFunction.apply(1));
  }

}
