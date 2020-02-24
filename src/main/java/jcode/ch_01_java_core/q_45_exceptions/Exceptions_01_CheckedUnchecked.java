package jcode.ch_01_java_core.q_45_exceptions;

import java.io.IOException;

public class Exceptions_01_CheckedUnchecked {

  public static void main(String[] args) {
    Throwable throwable;
    Exception exception;
    Error error;

    //Error
    StackOverflowError stackOverflowError;
    OutOfMemoryError outOfMemoryError;

    //Checked
    IOException ioException;

    //Unchecked
    RuntimeException runtimeException;
    NullPointerException nullPointerException;
  }

  public static void uncheckedError() {
    throw new Error();
  }

  public static void checked() throws Exception {
    throw new Exception();
  }

  public static void unchecked() {
    throw new RuntimeException();
  }

}
