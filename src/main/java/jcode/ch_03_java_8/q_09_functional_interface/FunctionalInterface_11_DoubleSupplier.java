package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.DoubleSupplier;

public class FunctionalInterface_11_DoubleSupplier {

  public static void main(String[] args) {
    DoubleSupplier doubleSupplier = () -> {
      return 0.12345;
    };
    System.out.println(doubleSupplier.getAsDouble());
  }

}
