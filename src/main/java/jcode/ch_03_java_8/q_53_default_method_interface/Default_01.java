package jcode.ch_03_java_8.q_53_default_method_interface;

public class Default_01 {

  public static void main(String[] args) {
    A a = new AA();
    a.print();
  }
}

interface A {

  default void print() {
    System.out.println("default...");
  }
}

class AA implements A {

}
