package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.DoubleConsumer;

public class FunctionalInterface_08_DoubleConsumer {

  public static void main(String[] args) {
    DoubleConsumer doubleConsumer = (x) -> {
      System.out.println(x);
    };

    doubleConsumer.accept(0.123);
  }

}
