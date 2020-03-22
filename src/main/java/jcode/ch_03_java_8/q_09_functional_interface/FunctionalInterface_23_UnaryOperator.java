package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.UnaryOperator;

public class FunctionalInterface_23_UnaryOperator {

  public static void main(String[] args) {
    UnaryOperator<String> unaryOperator = (x) -> {
      return String.valueOf(x.hashCode());
    };

    System.out.println(unaryOperator.apply("a"));
    System.out.println(unaryOperator.apply("b"));
    System.out.println(unaryOperator.apply("c"));
  }

}
