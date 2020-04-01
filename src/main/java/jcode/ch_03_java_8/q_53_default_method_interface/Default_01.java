package jcode.ch_03_java_8.q_53_default_method_interface;

public class Default_01 {

  public static void main(String[] args) {
    AA a = new AA();
    a.print();
    a.print2();
  }
}

interface A {

  default void print() {
    System.out.println("default...");
  }
}

class AA implements A {

  public void print2() {
    System.out.println("print 2...");
    A.super.print();
  }
}
