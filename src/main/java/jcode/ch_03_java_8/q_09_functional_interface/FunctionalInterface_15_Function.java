package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.Function;

public class FunctionalInterface_15_Function {

  public static void main(String[] args) {
    Function<Double, String> function = (x) -> {
      x *= 2;
      return String.valueOf(x);
    };

    System.out.println(function.apply(100.0));
  }

}
