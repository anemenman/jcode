package jcode.ch_03_java_8.q_09_functional_interface;

import java.util.function.ToDoubleBiFunction;

public class FunctionalInterface_22_ToDoubleBiFunction {

  public static void main(String[] args) {
    ToDoubleBiFunction<String, Integer> toDoubleBiFunction = (x, y) -> {
      return x.hashCode() + y;
    };

    System.out.println(toDoubleBiFunction.applyAsDouble("aaa", 123));
  }

}
