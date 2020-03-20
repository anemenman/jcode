package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.BooleanSupplier;

public class FunctionalInterface_05_BooleanSupplier {

  public static void main(String[] args) {
    BooleanSupplier booleanSupplierTrue = () -> true;

    System.out.println(booleanSupplierTrue.getAsBoolean());
    BooleanSupplier booleanSupplierFalse = () -> false;

    System.out.println(booleanSupplierFalse.getAsBoolean());
  }

}
