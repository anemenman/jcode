package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.Supplier;

public class FunctionalInterface_21_Supplier {

  public static void main(String[] args) {
    Supplier<String> supplier = () -> "a";
    System.out.println(supplier.get());
  }

}
