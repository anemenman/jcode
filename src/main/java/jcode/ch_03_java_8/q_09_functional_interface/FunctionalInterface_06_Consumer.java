package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.Consumer;

public class FunctionalInterface_06_Consumer {

  public static void main(String[] args) {
    Consumer<Integer> consumer = (x1) -> {
      System.out.println(x1);
    };
    consumer.accept(10);
  }

}
