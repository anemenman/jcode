package jcode.ch_01_java_core.q_13_asserts;

public class Asserts_01 {

  public static void main(String[] args) {

    int v = 11;

    //By default assert disabled
    //If enable -> then should be java.lang.AssertionError
    assert v >= 18 : "Ex";

    System.out.println(v >= 18);

    System.out.println("QQQQQQQ");
  }

}
