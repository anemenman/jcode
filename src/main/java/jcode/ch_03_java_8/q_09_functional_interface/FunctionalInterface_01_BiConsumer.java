package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.BiConsumer;

public class FunctionalInterface_01_BiConsumer {

  public static void main(String[] args) {

    Integer integer1 = 1;
    Integer integer2 = 2;

    BiConsumer<Integer, Integer> biConsumer = (i1, i2) -> {
      System.out.println("i1 -> " + i1 + " i2 -> " + i2);
    };
    biConsumer.accept(integer1, integer2);
  }

}
