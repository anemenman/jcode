package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.BinaryOperator;

public class FunctionalInterface_03_BinaryOperator {

  public static void main(String[] args) {
    BinaryOperator<Integer> binaryOperator = (x1, x2) -> x1 + x2;
    System.out.println("binaryOperator--->" + binaryOperator.apply(10, 11));
  }

}
