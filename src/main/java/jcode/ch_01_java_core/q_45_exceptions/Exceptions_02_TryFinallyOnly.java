package jcode.ch_01_java_core.q_45_exceptions;

public class Exceptions_02_TryFinallyOnly {

  public static void main(String[] args) {

    try {
      System.out.println("start try...");
      throw new RuntimeException("exception...");
    } finally {
      System.out.println("finally");
    }

  }
}
