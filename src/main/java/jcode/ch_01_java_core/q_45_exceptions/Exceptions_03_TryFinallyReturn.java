package jcode.ch_01_java_core.q_45_exceptions;

public class Exceptions_03_TryFinallyReturn {

  public static void main(String[] args) {
    try {
      /**
       * some code with some returns...
       *
       * return 1;
       * ....
       * return 2;
       * ....
       * return n;
       */
      return;
    } finally {
      System.out.println("finally");
    }
  }

}
