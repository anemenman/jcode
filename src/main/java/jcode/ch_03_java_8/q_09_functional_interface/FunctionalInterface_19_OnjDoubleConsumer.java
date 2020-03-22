package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.ObjDoubleConsumer;

public class FunctionalInterface_19_OnjDoubleConsumer {

  public static void main(String[] args) {
    ObjDoubleConsumer<String> objDoubleConsumer = (o, x) -> {
      System.out.println("hashCode--->" + o.hashCode());
      System.out.println("hashCode * x--->" + o.hashCode() * x);
    };

    objDoubleConsumer.accept("ABC", 111.123);
  }

}
